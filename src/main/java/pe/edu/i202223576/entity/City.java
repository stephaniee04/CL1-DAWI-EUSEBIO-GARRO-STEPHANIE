package pe.edu.i202223576.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    private int ID;
    private String Name;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;

    private String District;
    private int Population;

    public City() {
    }

    public City(int ID) {
        this.ID = ID;
    }

    public City(int ID, String name, Country country, String district, int population) {
        this.ID = ID;
        this.Name = name;
        this.country = country;
        this.District = district;
        this.Population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + country.getCode() + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}