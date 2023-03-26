package service.account_manager.concrete;

import entity.account.abs.Account;
import entity.account.concrete.Enterprise;
import entity.account.concrete.Individual;
import entity.insurance.abs.Insurance;
import entity.user.User;
import entity.util.exceptions.InvalidTypeException;
import service.account_manager.abs.AccountManagerInterface;

import java.util.ArrayList;
import java.util.Set;

public class AccountManagerClass implements AccountManagerInterface {
    @Override
    public void addAccount(Account account,Set<Account> accountSet) {
        accountSet.add(account);
    }

    @Override
    public void removeAccount(Account account, Set<Account> accountSet) {
        accountSet.remove(account);
    }

    @Override
    public Account createAccount(String type,User user,ArrayList<Insurance> list) throws InvalidTypeException {
        Account account;
        switch (type){
            case "Individual":
                account = new Individual(user,list);
                break;
            case "Enterprise":
                account = new Enterprise(user,list);
                break;
            default:
                throw new InvalidTypeException();
        }
        return account;
    }

    @Override
    public Account login(String email, String password,Set<Account> accountSet) {
        Account returnAccount = null;
        for(Account account : accountSet){
            if(account.getUser().getEmail() == email && account.getUser().getPassword() == password){
                account.setStatusOn();
                returnAccount = account;
            }
        }
        return returnAccount;
    }
}
