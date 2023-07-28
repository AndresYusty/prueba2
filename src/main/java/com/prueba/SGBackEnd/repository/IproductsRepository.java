package com.prueba.SGBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.SGBackEnd.model.products;

@Repository
public interface IproductsRepository extends JpaRepository<products, Integer>{

}
