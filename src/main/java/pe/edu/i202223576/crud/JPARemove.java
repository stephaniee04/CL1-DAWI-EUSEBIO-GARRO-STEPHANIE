package pe.edu.i202223576.crud;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223576.entity.Country;

public class JPARemove {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Eliminar el país imaginario y sus ciudades y lenguajes asociados
        Country countryToRemove = em.find(Country.class, "Z0Z");  //código del país imaginario

        if (countryToRemove != null) {
            em.remove(countryToRemove);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

