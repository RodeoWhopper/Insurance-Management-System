package service.user_manager.abs;

import entity.account.abs.Account;
import entity.user.User;
import service.Manager;

import java.util.List;

public interface UserManagerInterface extends Manager {
    public User createUser(String name,String surname,String email,String password,String job,int age);
    public void addUser(User user,Account account);
    public void removeUser(Account account);
}
