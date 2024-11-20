package pe.edu.i202223576.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class Countrylanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;

    private String Language;
    private String IsOfficial;
    private double Percentage;

    // Constructor sin parámetros
    public Countrylanguage() {
    }

    // Constructor con solo countryCode
    public Countrylanguage(Country country) {
        this.country = country;
    }

    // Constructor con parámetros completos
    public Countrylanguage(Country country, String language, String isOfficial, double percentage) {
        this.country = country;
        this.Language = language;
        this.IsOfficial = isOfficial;
        this.Percentage = percentage;
    }

    // Métodos getter y setter
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        this.Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.IsOfficial = isOfficial;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        this.Percentage = percentage;
    }

    @Override
    public String toString() {
        return "Countrylanguage{" +
                "country=" + country +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }
}
