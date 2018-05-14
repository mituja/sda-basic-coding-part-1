package com.sda.collections;

import java.util.*;

public class ExerciseCities {

    public static void main(String[] args) {
//        Map<String, Country> countryMap = new HashMap<>();

//        getMap(initialize()).forEach((k, v) -> {
//            System.out.println(k + ", " + v);
//        });
        Map<String, Country> map = getMap(initialize());
        for (String k : map.keySet()){
            Country c = map.get(k);
            System.out.println(k + ", " + c.getName() + ", " + c.getResidenceNumber());
        }

    }

    public static Map<String, Country> getMap(List<Country> list){
        Map<String, Country> countryMap = new HashMap<>();

        list.forEach(country -> {
            countryMap.put(country.getCapitalCity(), country);
        });

        return countryMap;
    }

    public static List<Country> initialize(){
        List<Country> countryList = new LinkedList<>();
        countryList.add(new Country("Polska", "Wawa", 40_000_000));
        countryList.add(new Country("Czechy", "Praga", 20_000_000));
        countryList.add(new Country("Niemcy", "Berlin", 80_000_000));
        countryList.add(new Country("Białoruś", "Mińsk", 30_000_000));
        countryList.add(new Country("Belgia", "Bruksela", 40_000_000));
        countryList.add(new Country("Litwa", "Wilno", 30_000_000));
        countryList.add(new Country("Ukraina", "Kijów", 50_000_000));

        return countryList;
    }
}
