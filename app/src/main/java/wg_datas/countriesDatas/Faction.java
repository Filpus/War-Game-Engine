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

}
