package entity.account.concrete;

import entity.account.abs.Account;
import entity.insurance.abs.Insurance;
import entity.user.User;

import java.util.ArrayList;

public class Enterprise extends Account {
    public Enterprise(User user, ArrayList<Insurance> insuranceList) {
        super(user, insuranceList);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
