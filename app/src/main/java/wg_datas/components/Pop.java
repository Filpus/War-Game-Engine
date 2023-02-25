package wg_datas.components;

public class Pop {
    private float happiness;
    private float taxation;
    private float goldProductionFactor;
    private float foodProductionFactor;

    private int goldMaintenanceCost;
    private int foodMaintenanceCost;
    private Estates estates;
    private Culture culture;
    private Religion religion;

    private int number;

    public float getHappiness() {
        return happiness;
    }

    public float getGoldProductionFactor() {
        return goldProductionFactor;
    }

    public float getFoodProductionFactor() {
        return foodProductionFactor;
    }

    public int getGoldMaintenanceCost() {
        return goldMaintenanceCost;
    }

    public int getFoodMaintenanceCost() {
        return foodMaintenanceCost;
    }

    public Estates getEstates() {
        return estates;
    }

    public Culture getCulture() {
        return culture;
    }

    public Religion getReligion() {
        return religion;
    }

    public int getNumber() {
        return number;
    }
}
