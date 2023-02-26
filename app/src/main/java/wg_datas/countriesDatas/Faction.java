package wg_datas.countriesDatas;

import wg_datas.components.*;
import wg_datas.countriesDatas.countryComponents.*;

import java.util.ArrayList;

public class Faction {

    private Leader leader;
    private String name;
    private Localizations localizations;
    private Culture nationalCulture;
    private Religion nationalReligion;

    private float foodSupply;
    private float maintenanceSupply;


    private ArrayList<Culture> acceptedCultures;

    private ArrayList<PoliticalFaction> politicalFactions;
    private ArrayList<Estates> estates;

    private NationalBudget nationalBudget;
    private ArrayList<Modifier> modifiers;

    private float mediumHappiness;
    private float mediumTaxation;

    public void setIncome(){
        float newIncome = 0;
        for(City city: localizations.getCities()){
            newIncome += city.getIncome();
        }
        for(Province province: localizations.getProvinces()){
            newIncome += province.getIncome();
        }
        nationalBudget.setIncome(newIncome);
    }

    public  void setExpenses(){
        float newExpenses = 0;
        for(City city: localizations.getCities()){
            newExpenses += city.getExpenses();
        }
        for(Province province: localizations.getProvinces()){
            newExpenses += province.getExpenses();
        }
        nationalBudget.setExpenses(newExpenses);
    }

    public  void setFoodExpenses(){
        float newFoodExpenses = 0;
        for(City city: localizations.getCities()){
            newFoodExpenses += city.getFoodExpenses();
        }
        for(Province province: localizations.getProvinces()){
            newFoodExpenses += province.getFoodExpenses();
        }
        nationalBudget.setFoodExpenses(newFoodExpenses);
    }

    public void setFoodIncome(){
        float newFoodIncome = 0;
        for(Province province: localizations.getProvinces()){
            newFoodIncome +=  province.getFoodProduction();
        }
        nationalBudget.setFoodIncome(newFoodIncome);
    }

    public void setMediums(){
        int number = 0;
        float newMediumTaxation = 0;
        float newMediumHappiness = 0;
        for(City city: localizations.getCities()){
            newMediumTaxation += city.getMediumTaxation();
            newMediumHappiness += city.getMediumHappiness();
            number += 1;
        }
        for(Province province: localizations.getProvinces()){
            newMediumTaxation += province.getMediumTaxation();
            newMediumHappiness += province.getMediumHappiness();
            number += 1;
        }
        mediumHappiness = newMediumHappiness /number;
        mediumTaxation = newMediumTaxation / number;
    }

    public void nextTurn(){

        //TODO dokończyć i ustalić dodawanie czy odejmowanie
        nationalBudget.setFood((nationalBudget.getFoodExpenses() * foodSupply + nationalBudget.getFood() + nationalBudget.getFoodIncome()));
        nationalBudget.setGold(nationalBudget.getGold() + nationalBudget.getIncome() + nationalBudget.getExpenses() * maintenanceSupply);
        for(Resource resource : nationalBudget.getResources()){
            resource.changeNumber(nationalBudget.getIncomeOfResources().get(resource) + nationalBudget.getExpensesOfResources().get(resource));
        }
    }
}
