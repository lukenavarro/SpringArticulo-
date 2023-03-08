package supermercado.conexionSupermercadoJPA.services;

import supermercado.conexionSupermercadoJPA.models.entities.Articulo;

import java.util.List;
import java.util.Optional;

public interface ArticuloService {
    List<Articulo> getArticulos();
    Optional<Articulo> getArticuloByID(Long id);
    Articulo saveOrUpdateArticulos(Articulo articulo);


}
