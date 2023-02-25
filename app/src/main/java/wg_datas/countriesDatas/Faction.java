package wg_datas.countriesDatas;

import wg_datas.components.*;

import java.util.ArrayList;

public class Faction {

    private Leader leader;
    private String name;

    private Culture nationalCulture;
    private Religion nationalReligion;

    private ArrayList<Culture> acceptedCultures;
    private ArrayList<City> cities;
    private ArrayList<Fort> forts;
    private ArrayList<PoliticalFaction> politicalFactions;
    private ArrayList<Estates> estates;
    private ArrayList<Province> provinces;
    private ArrayList<Resource> resources;
    private ArrayList<Modifier> modifiers;

    private float mediumHappiness;

}
