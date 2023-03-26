package service.account_manager.abs;

import entity.account.abs.Account;
import entity.insurance.abs.Insurance;
import entity.user.User;
import entity.util.exceptions.InvalidTypeException;
import service.Manager;

import java.util.ArrayList;
import java.util.Set;

public interface AccountManagerInterface extends Manager {
    public void addAccount(Account account,Set<Account> accountSet) throws InvalidTypeException;
    public void removeAccount(Account account,Set<Account> accountSet);
    public Account createAccount(String type, User user, ArrayList<Insurance> list) throws InvalidTypeException;
    public Account login(String email,String password,Set<Account> accountSet);
}
