package supermercado.conexionSupermercadoJPA.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import supermercado.conexionSupermercadoJPA.models.entities.Articulo;

public interface ArticuloRepository extends JpaRepository<Articulo,Long> {
}
