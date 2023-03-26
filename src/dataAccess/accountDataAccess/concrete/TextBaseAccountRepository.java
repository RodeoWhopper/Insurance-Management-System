package dataAccess.accountDataAccess.concrete;

import dataAccess.accountDataAccess.abs.AccountRepository;
import entity.account.abs.Account;

import java.util.Set;
import java.util.TreeSet;

public class TextBaseAccountRepository implements AccountRepository {
    @Override
    public void addAccount(Account account) {
        TreeSet<Account> set = getList();
        if(set.contains(account)){
            set.add(account);
        }else{
            System.out.println("Account already exist in the base.");
        }
    }

    @Override
    public void removeAccount(Account account) {
        TreeSet<Account> set = getList();
        if(set.contains(account)){
            set.remove(account);
        }else{
            System.out.println("Account not found in the base.");
        }
    }

    @Override
    public TreeSet<Account> getList() {
        //Gets from text files
        return new TreeSet<Account>();
    }

    @Override
    public void postList(Set<Account> set) {
        //Sends to text files
    }
}
