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
}
