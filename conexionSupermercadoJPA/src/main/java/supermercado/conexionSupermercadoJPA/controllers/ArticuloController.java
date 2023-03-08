package supermercado.conexionSupermercadoJPA.controllers;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import supermercado.conexionSupermercadoJPA.models.entities.Articulo;
import supermercado.conexionSupermercadoJPA.services.ArticuloService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/articulo")
    public List<Articulo> getArticulos(){
        return articuloService.getArticulos();
    }
    @GetMapping("/articulo/{id}")
    public Articulo getArticuloByID(@PathVariable Long id){
        return articuloService.getArticuloByID(id).orElse(null);
    }

    @PostMapping("/articulo")
    public Articulo saveArticulo(Articulo articulo){
        return articuloService.saveOrUpdateArticulos(articulo);
    }

    @PutMapping("/articulo/{id}")
    public Articulo updateArticulo(@PathVariable Long id,Articulo articulo){
        articuloService.getArticuloByID(id)
                .ifPresent(articulo1 -> {
                    articulo.setId(articulo1.getId());
                    articuloService.saveOrUpdateArticulos(articulo);
                });
        return articulo;
    }
}
