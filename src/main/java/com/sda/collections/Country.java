package com.sda.collections;

public class Country {
    private String name;
    private String capitalCity;
    private Integer residenceNumber;

    public Country(String name, String capitalCity, Integer residenceNumber) {
        this.name = name;
        this.capitalCity = capitalCity;
        this.residenceNumber = residenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Integer getResidenceNumber() {
        return residenceNumber;
    }

    public void setResidenceNumber(Integer residenceNumber) {
        this.residenceNumber = residenceNumber;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", residenceNumber=" + residenceNumber +
                '}';
    }
}
