package pe.edu.i202223576.crud;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223576.entity.City;
import pe.edu.i202223576.entity.Country;
import pe.edu.i202223576.entity.Countrylanguage;

public class JPAPersist {

    public static void main(String[] args) {
        // Configurar EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Crear un país
        Country country = new Country();
        country.setCode("Z0Z");
        country.setName("Zonalia");
        country.setContinent("Africa");
        country.setRegion("Zonal Region");
        country.setSurfaceArea(500000.0);
        country.setIndepYear(1900);
        country.setPopulation(30000000);
        country.setLifeExpectancy(70.5);
        country.setGNP(20000.0);
        country.setGNPOld(15000.0);
        country.setLocalName("Zonal");
        country.setGovernmentForm("Republic");
        country.setHeadOfState("John Doe");
        country.setCapital(1);
        country.setCode2("ZZ");

        // Crear las ciudades y asociarlas con el país
        City city1 = new City();
        city1.setName("Dream");
        city1.setCountry(country);
        city1.setDistrict("North District");
        city1.setPopulation(2000000);

        City city2 = new City();
        city2.setName("Wonder");
        city2.setCountry(country);
        city2.setDistrict("East District");
        city2.setPopulation(1500000);

        City city3 = new City();
        city3.setName("Fiction");
        city3.setCountry(country);
        city3.setDistrict("West District");
        city3.setPopulation(1500000);

        // Crear los dos lenguajes
        Countrylanguage lang1 = new Countrylanguage();

        lang1.setLanguage("Pumpum");
        lang1.setIsOfficial("T");
        lang1.setPercentage(30.0);
        lang1.setCountryCode(country); //

        Countrylanguage lang2 = new Countrylanguage();
        lang2.setLanguage("Maemos");
        lang2.setIsOfficial("F");
        lang2.setPercentage(30.0);
        lang2.setCountryCode(country); //

        // Persistir todos los objetos
        try {
            em.getTransaction().begin();
            country.getCities().add(city1);
            country.getCities().add(city2);
            country.getCities().add(city3);

            em.persist(country);

            em.getTransaction().commit();
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}

