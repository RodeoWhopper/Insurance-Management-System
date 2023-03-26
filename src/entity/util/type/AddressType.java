package entity.util.type;

import java.util.ArrayList;

public enum AddressType {
    HOME_ADDRESS(1),
    BUSINESS_ADDRESS(2);
    private int type;
    private AddressType(int type){
        this.type = type;
    }
    public int getType(){
        return this.type;
    }
    public String getTypeName(int i){
        String type = null;
        switch (this.type){
            case 1:
                type = "Home Address";
                break;
            case 2:
                type = "Business Address";
                break;
            default:
                throw new IllegalArgumentException();
        }
        return type;
    }
}
