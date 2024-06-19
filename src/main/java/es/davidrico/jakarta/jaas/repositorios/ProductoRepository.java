package es.davidrico.jakarta.jaas.repositorios;

import es.davidrico.jakarta.jaas.entities.Producto;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto>{
    List<Producto> buscarPorNombre(String nombre);
}
