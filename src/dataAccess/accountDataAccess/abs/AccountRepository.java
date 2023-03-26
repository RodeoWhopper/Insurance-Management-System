package dataAccess.accountDataAccess.abs;


import entity.account.abs.Account;
import java.util.Set;

public interface AccountRepository {
    public void addAccount(Account account);
    public void removeAccount(Account account);
    public Set<Account> getList();
    public void postList(Set<Account> set);
}
