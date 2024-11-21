package pe.edu.i202223576.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223576.entity.Country;

public class JPAFind {
    public static void main(String[] args) {
        // Crear el EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Obtener el país con código "PER" (Perú)
        Country country = em.find(Country.class, "PER");

        // Verificar si se encontró el país
        if (country != null) {
            // Cargar la list de ciudades (en caso de que sea un fetch lazy)
            country.getCities().size();  // Esto fuerza la carga de las ciudades

            // Filtrar las ciudades con población > 700k y mostrar su nombre
            country.getCities().stream()
                    .filter(city -> city.getPopulation() > 700000)  // Filtra las ciudades con población > 700k
                    .forEach(city -> System.out.println(city.getName()));  // Imprime el nombre de las ciudades
        } else {
            System.out.println("No se encontró el país con el código 'PER'.");
        }

        // Cerrar EntityManager y EntityManagerFactory
        em.close();
        emf.close();
    }
}