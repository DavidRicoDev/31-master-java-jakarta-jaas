package es.davidrico.jakarta.jaas.servicios;

import jakarta.ejb.Local;
import es.davidrico.jakarta.jaas.entities.Categoria;
import es.davidrico.jakarta.jaas.entities.Producto;

import java.util.List;
import java.util.Optional;

@Local
public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> porId(Long id);
    void guardar(Producto producto);
    void eliminar(Long id);
    List<Categoria> listarCategorias();
    Optional<Categoria> porIdCategoria(Long id);
    List<Producto> buscarPorNombre(String nombre);
}
