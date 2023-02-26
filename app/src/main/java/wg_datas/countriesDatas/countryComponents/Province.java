package wg_datas.countriesDatas.countryComponents;

import wg_datas.components.Pop;

import java.util.ArrayList;

public class Province {
    private String name;
    private ArrayList<Pop> pops;
    private float mediumHappiness;
    private int wealth;
    private float fertility;
    private float foodProduction;
    private float foodExpenses;
    private float mediumTaxation;
    private float income;
    private  float expenses;

    private int  manpower;

    public void setIncome(){
        float newIncome = 0;
        for (Pop pop : pops) {
            newIncome += pop.getGoldProductionFactor() * pop.getTaxation() * pop.getNumber() * wealth;
        }
        income = Math.round(newIncome);
    }
    public void setExpenses(){
        float newExpenses = 0;
        for(Pop pop : pops){
            newExpenses += pop.getGoldMaintenanceCost() * pop.getNumber();
        }
        expenses = Math.round(newExpenses);
    }

    public void setManpower(){
        int newManpower = 0;
        for(Pop pop: pops){
            newManpower += Math.round(pop.getManpower() * pop.getDraft());
        }

        manpower = newManpower;
    }

    public  void setFoodExpenses(){
        float newFoodExpenses = 0;
        for(Pop pop: pops){
            newFoodExpenses =+ pop.getFoodMaintenanceCost() * pop.getNumber();
        }
        foodExpenses = newFoodExpenses;
    }
    public void setMediumTaxation(){
        int number = 0;
        float newMediumTaxation = 0;
        for(Pop pop:pops){
            number+= pop.getNumber();
            newMediumTaxation += pop.getNumber() * pop.getTaxation();
        }

        mediumTaxation = newMediumTaxation / number;

    }

    public void setMediumHappiness(){
        int number = 0;
        float newMediumHappiness = 0;
        for(Pop pop:pops){
            number+= pop.getNumber();
            newMediumHappiness += pop.getNumber() * pop.getHappiness();
        }

        mediumHappiness = newMediumHappiness / number;

    }

    public void setFoodProduction(){
        float newFoodProduction = 0;
        for(Pop pop: pops){
            newFoodProduction += pop.getFoodProductionFactor() * pop.getNumber()*fertility;
        }
        foodProduction = newFoodProduction;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pop> getPops() {
        return pops;
    }

    public float getMediumHappiness() {
        return mediumHappiness;
    }

    public int getWealth() {
        return wealth;
    }

    public float getFertility() {
        return fertility;
    }

    public float getFoodProduction() {
        return foodProduction;
    }

    public float getFoodExpenses() {
        return foodExpenses;
    }

    public float getMediumTaxation() {
        return mediumTaxation;
    }

    public float getIncome() {
        return income;
    }

    public float getExpenses() {
        return expenses;
    }

    public int getManpower() {
        return manpower;
    }
}
