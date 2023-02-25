package wg_datas;

import wg_datas.components.*;
import wg_datas.countriesDatas.Faction;

import java.util.ArrayList;

public class Wg {

    private String name;
    private ArrayList<Culture> culturesInGame;
    private ArrayList<Estates> estatesInGame;
    private ArrayList<Religion> religionsInGame;
    private ArrayList<Unit> unitsInGame;
    private ArrayList<Resource> resoursesInGame;
    private ArrayList<Faction> factions;




    public String getName() {
        return name;
    }

    public ArrayList<Culture> getCulturesInGame() {
        return culturesInGame;
    }

    public ArrayList<Estates> getEstatesInGame() {
        return estatesInGame;
    }

    public ArrayList<Religion> getReligionsInGame() {
        return religionsInGame;
    }

    public ArrayList<Unit> getUnitsInGame() {
        return unitsInGame;
    }

    public ArrayList<Resource> getResoursesInGame() {
        return resoursesInGame;
    }

    public ArrayList<Faction> getFactions() {
        return factions;
    }
}
