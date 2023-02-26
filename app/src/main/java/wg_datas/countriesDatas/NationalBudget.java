package wg_datas.countriesDatas;

import wg_datas.components.Resource;

import java.util.ArrayList;
import java.util.HashMap;

public class NationalBudget {

    float gold;
    float food;
    float income;
    float expenses;
    float foodIncome;
    float foodExpenses;

    ArrayList<Resource> resources;
    HashMap<Resource,Integer> incomeOfResources;
    HashMap<Resource,Integer> expensesOfResources;

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public float getFood() {
        return food;
    }

    public void setFood(float food) {
        this.food = food;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public float getFoodIncome() {
        return foodIncome;
    }

    public void setFoodIncome(float foodIncome) {
        this.foodIncome = foodIncome;
    }

    public float getFoodExpenses() {
        return foodExpenses;
    }

    public void setFoodExpenses(float foodExpenses) {
        this.foodExpenses = foodExpenses;
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public HashMap<Resource, Integer> getIncomeOfResources() {
        return incomeOfResources;
    }

    public HashMap<Resource, Integer> getExpensesOfResources() {
        return expensesOfResources;
    }
}
