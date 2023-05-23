package com.example.demo1;

public class Lignes {
    private String codeValue;
    private String alternateName;
    private String countryGroup;
    private String nameEn;
    private String nameFr;
    private String nameDe;
    private String latitude;
    private String longitude;

    Lignes(String code, String alternateName, String countryGroup,
           String nameEn, String nameFr, String nameDe, String latitude, String longitude){
        this.codeValue = code;
        this.alternateName = alternateName;
        this.countryGroup = countryGroup;
        this.nameEn = nameEn;
        this.nameFr = nameFr;
        this.nameDe = nameDe;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getCountryGroup() {
        return countryGroup;
    }

    public void setCountryGroup(String countryGroup) {
        this.countryGroup = countryGroup;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
