package pe.edu.i202223576.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class Countrylanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;

    public pe.edu.i202223576.entity.Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(pe.edu.i202223576.entity.Country countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }


}
