package hn.unah.poo.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.proyecto.models.Prestamo;

@Repository
public interface PrestamosRepositorio  extends JpaRepository <Prestamo, Integer> {
    
}
