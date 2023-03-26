package service.user_manager.concrete;

import entity.account.abs.Account;
import entity.user.User;
import service.user_manager.abs.UserManagerInterface;

public class UserManagerClass implements UserManagerInterface {
    @Override
    public User createUser(String name, String surname, String email, String password, String job, int age) {
        return new User(name, surname, email, password, job, age);
    }

    @Override
    public void addUser(User user, Account account) {
        account.setUser(user);
    }

    @Override
    public void removeUser(Account account) {
        account.setUser(null);
    }

}
