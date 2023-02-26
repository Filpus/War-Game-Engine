package wg_datas.countriesDatas;

import wg_datas.countriesDatas.countryComponents.City;
import wg_datas.countriesDatas.countryComponents.Fort;
import wg_datas.countriesDatas.countryComponents.Province;

import java.util.ArrayList;

public class Localizations {
    private ArrayList<City> cities;
    private ArrayList<Fort> forts;
    private ArrayList<Province> provinces;

    public ArrayList<City> getCities() {
        return cities;
    }

    public ArrayList<Fort> getForts() {
        return forts;
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }
}
