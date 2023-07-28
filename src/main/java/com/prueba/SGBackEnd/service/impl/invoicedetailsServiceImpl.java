package com.prueba.SGBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.SGBackEnd.model.invoicedetails;
import com.prueba.SGBackEnd.repository.IinvoicedetailsRepository;
import com.prueba.SGBackEnd.service.IinvoicedetailsService;

@Service
public class invoicedetailsServiceImpl implements IinvoicedetailsService {
	
	@Autowired
	private IinvoicedetailsRepository repo;

	@Override
	public List<invoicedetails> listarTodos() {
		
		return repo.findAll();
	}

	@Override
	public invoicedetails listarPorId(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(invoicedetails entidad) {
		
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(invoicedetails entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

}
