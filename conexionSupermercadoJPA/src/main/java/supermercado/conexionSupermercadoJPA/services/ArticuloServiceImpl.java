package supermercado.conexionSupermercadoJPA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supermercado.conexionSupermercadoJPA.models.entities.Articulo;
import supermercado.conexionSupermercadoJPA.models.repositories.ArticuloRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ArticuloServiceImpl implements ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;
    @Override
    public List<Articulo> getArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Optional<Articulo> getArticuloByID(Long id) {
        return articuloRepository.findById(id);
    }

    @Override
    public Articulo saveOrUpdateArticulos(Articulo articulo) {
        return articuloRepository.save(articulo);
    }
}
