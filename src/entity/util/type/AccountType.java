package entity.util.type;

public enum AccountType {
    INDIVIDUAL(1),
    ENTERPRISE(2);
    private int type;
    private AccountType(int type){
        this.type = type;
    }
}
