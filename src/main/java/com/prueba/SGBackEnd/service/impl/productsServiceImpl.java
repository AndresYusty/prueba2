package com.prueba.SGBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.SGBackEnd.model.products;
import com.prueba.SGBackEnd.repository.IproductsRepository;
import com.prueba.SGBackEnd.service.IproductsService;

@Service
public class productsServiceImpl implements IproductsService{

	@Autowired
	private IproductsRepository repo;

	@Override
	public List<products> listarTodos() {
		return repo.findAll();
	}

	@Override
	public products listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(products entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(products entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}
	
	
	
}
