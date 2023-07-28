package com.prueba.SGBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.SGBackEnd.model.invoices;
import com.prueba.SGBackEnd.repository.IinvoicesRepository;
import com.prueba.SGBackEnd.service.IinvoicesService;

@Service
public class invoicesServiceImpl implements IinvoicesService {
	
	@Autowired
	private  IinvoicesRepository repo;

	@Override
	public List<invoices> listarTodos() {
		return repo.findAll();
	}

	@Override
	public invoices listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(invoices entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(invoices entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	} 
	

}
