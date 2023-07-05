package com.interview.tienda_patitos.repositories;

import com.interview.tienda_patitos.models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer> {
}
