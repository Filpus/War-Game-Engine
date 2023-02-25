package wg_datas.components;

public class Estates {
    private float taxation;

    private String name;
    int influence;


    private float baseHappiness;
    private float draft;
    private  float draftEffectOnHappiness;
    private  float tolerabilityOfDraft;
    private  float tolerabilityOfTaxes;
    private float taxationEffectOnHappiness;
    private float baseGoldProductionFactor;
    private float baseFoodProductionFactor;
    private float baseGoldMaintenanceCost;
    private float baseFoodMaintenanceCost;
    private int baseManpower;

    public float getTaxation() {
        return taxation;
    }

    public String getName() {
        return name;
    }

    public int getInfluence() {
        return influence;
    }

    public float getBaseHappiness() {
        return baseHappiness;
    }

    public float getDraft() {
        return draft;
    }

    public float getBaseGoldProductionFactor() {
        return baseGoldProductionFactor;
    }

    public float getBaseFoodProductionFactor() {
        return baseFoodProductionFactor;
    }

    public float getBaseGoldMaintenanceCost() {
        return baseGoldMaintenanceCost;
    }

    public float getBaseFoodMaintenanceCost() {
        return baseFoodMaintenanceCost;
    }

    public int getBaseManpower() {
        return baseManpower;
    }

    public float getDraftEffectOnHappiness() {
        return draftEffectOnHappiness;
    }

    public float getTaxationEffectOnHappiness() {
        return taxationEffectOnHappiness;
    }

    public float getTolerabilityOfDraft() {
        return tolerabilityOfDraft;
    }

    public float getTolerabilityOfTaxes() {
        return tolerabilityOfTaxes;
    }
}
