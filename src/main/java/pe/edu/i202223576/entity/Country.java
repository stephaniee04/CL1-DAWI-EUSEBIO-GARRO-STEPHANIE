package pe.edu.i202223576.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "country")
public class Country {
    @Id
    private String Code; // Esto mapea a la columna "Code" de la base de datos.

    private String Name; // Mapea a "Name"
    private String Continent; // Mapea a "Continent"
    private String Region; // Mapea a "Region"
    private double SurfaceArea; // Mapea a "SurfaceArea"
    private Integer IndepYear; // Mapea a "IndepYear"
    private int Population; // Mapea a "Population"
    private Double LifeExpectancy; // Mapea a "LifeExpectancy"
    private Double GNP; // Mapea a "GNP"
    private Double GNPOld; // Mapea a "GNPOld"
    private String LocalName; // Mapea a "LocalName"
    private String GovernmentForm; // Mapea a "GovernmentForm"
    private String HeadOfState; // Mapea a "HeadOfState"
    private int Capital; // Mapea a "Capital"
    private String Code2; // Mapea a "Code2"

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities = new ArrayList<>();

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Countrylanguage> languages = new ArrayList<>();


    public Country() {
    }

    public Country(String code) {
        Code = code;
    }

    public Country(String code, String name, String continent, String region, double surfaceArea, int indepYear, int population, double lifeExpectancy, double GNP, double GNPOld, String localName, String governmentForm, String headOfState, int capital, String code2, List<City> cities, List<Countrylanguage> languages) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
        this.cities = cities;
        this.languages = languages;
    }
    public List<City> getCities() {
        return cities;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(int indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public double getGNP() {
        return GNP;
    }

    public void setGNP(double GNP) {
        this.GNP = GNP;
    }

    public double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                '}';
    }
}
