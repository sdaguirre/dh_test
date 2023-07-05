package com.interview.tienda_patitos.repositories;

import com.interview.tienda_patitos.models.Patito;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatitoRepository extends JpaRepository<Patito,Integer> {

    Patito getByPrecioAndColorAndTamaño(Double precio, Patito.COLOR color, Patito.TAMAÑO tamaño);

    List<Patito> findAllByBorrado(Boolean borrado);

    List<Patito> findAllByBorrado(Sort sort, Boolean borrado);
}
