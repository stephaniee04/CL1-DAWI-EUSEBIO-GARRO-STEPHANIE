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
        country.setContinent("North");
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
        lang1.setCountry(country); //
        lang1.setLanguage("Imaginese");
        lang1.setIsOfficial("T");
        lang1.setPercentage(70.0);

        Countrylanguage lang2 = new Countrylanguage();
        lang2.setCountry(country); //
        lang2.setLanguage("Fantasia");
        lang2.setIsOfficial("F");
        lang2.setPercentage(30.0);

        // Persistir todos los objetos
        try {
            em.getTransaction().begin();

            // Persistir el país
            em.persist(country);

            // Persistir las ciudades
            em.persist(city1);
            em.persist(city2);
            em.persist(city3);

            // Persistir los lenguajes
            em.persist(lang1);
            em.persist(lang2);

            em.getTransaction().commit();
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
