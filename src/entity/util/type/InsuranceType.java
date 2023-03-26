package entity.util.type;

public enum InsuranceType {
    CAR_INSURANCE(1),
    HEALTH_INSURANCE(2),
    RESIDENCE_INSURANCE(3),
    TRAVEL_INSURANCE(4);
    private int type;
    private InsuranceType(int type){
        this.type = type;
    }
}
