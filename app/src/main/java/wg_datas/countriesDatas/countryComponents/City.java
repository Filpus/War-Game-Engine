package wg_datas.countriesDatas.countryComponents;

import wg_datas.components.Pop;

import java.util.ArrayList;

public class City {

    private String name;
    private ArrayList<Pop> pops;
    Fort cityFortification;
    private float mediumHappiness;
    private int wealth;
    private float mediumTaxation;
    private float income;
    private  float foodExpenses;
    private float expenses;
    private int manpower;


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

    public String getName() {
        return name;
    }

    public ArrayList<Pop> getPops() {
        return pops;
    }

    public Fort getCityFortification() {
        return cityFortification;
    }

    public float getMediumHappiness() {
        return mediumHappiness;
    }

    public int getWealth() {
        return wealth;
    }

    public float getMediumTaxation() {
        return mediumTaxation;
    }

    public float getIncome() {
        return income;
    }

    public float getFoodExpenses() {
        return foodExpenses;
    }

    public float getExpenses() {
        return expenses;
    }

    public int getManpower() {
        return manpower;
    }
}
