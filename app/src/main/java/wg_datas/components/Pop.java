package wg_datas.components;

public class Pop {
    private float happiness;
    private float taxation;
    private float draft;
    private float goldProductionFactor;
    private float foodProductionFactor;

    private float goldMaintenanceCost;
    private float foodMaintenanceCost;
    private Estates estates;
    private Culture culture;
    private Religion religion;

    private int manpower;

    private int number;

    public void setTaxation(){
        taxation = estates.getTaxation();
    }

    public  void setDraft(){
        draft = estates.getDraft();
    }
    public void setHappiness(){
        happiness = estates.getBaseHappiness() + ((estates.getTolerabilityOfTaxes()- taxation) * estates.getTaxationEffectOnHappiness()) + ((estates.getTolerabilityOfDraft() - draft) * estates.getDraftEffectOnHappiness());
    }

    public void setGoldProductionFactor(){
        goldProductionFactor = estates.getBaseGoldProductionFactor() * culture.getGoldProductionModifier() * religion.getGoldProductionModifier();
    }

    public void setFoodProductionFactor(){
        foodProductionFactor = estates.getBaseFoodProductionFactor() * culture.getFoodProductionModifier() * religion.getFoodProductionModifier();
    }

    public void setGoldMaintenanceCost(){
        goldMaintenanceCost = estates.getBaseGoldMaintenanceCost()*culture.getGoldMaintenanceModifier() * religion.getGoldMaintenanceModifier();
    }

    public void setFoodMaintenanceCost(){
        foodMaintenanceCost = estates.getBaseFoodMaintenanceCost() *culture.getFoodMaintenanceModifier() * religion.getFoodMaintenanceModifier();
    }

    public void setManpower(){
        manpower = Math.round(estates.getBaseManpower() * culture.getManpowerModifier() * religion.getManpowerModifier() * draft);
    }


    public void setEstates(Estates estates) {
        this.estates = estates;
    }

    public void setCulture(Culture culture) {
        this.culture = culture;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void changeNumber(int number) {
        this.number += number;
    }


    public float getHappiness() {
        return happiness;
    }

    public float getGoldProductionFactor() {
        return goldProductionFactor;
    }

    public float getFoodProductionFactor() {
        return foodProductionFactor;
    }

    public float getGoldMaintenanceCost() {
        return goldMaintenanceCost;
    }

    public float getFoodMaintenanceCost() {
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

    public float getTaxation() {
        return taxation;
    }

    public float getDraft() {
        return draft;
    }

    public int getManpower() {
        return manpower;
    }

    public int getNumber() {
        return number;
    }
}
