package com.prueba.SGBackEnd.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prueba.SGBackEnd.model.invoicedetails;
import com.prueba.SGBackEnd.service.IinvoicedetailsService;

public class invoicedetailsRest {
	
	private IinvoicedetailsService service;
	
	@GetMapping("")
	public List<invoicedetails> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public invoicedetails listarPorId(@PathVariable int id) {  
		return service.listarPorId(id);
	}

    @PostMapping("")
	public void registrar(@RequestBody invoicedetails entidad) {
	
		service.registrar(entidad);
	}

	@PutMapping("")
	public void actualizar(@RequestBody invoicedetails entidad) {
	
		service.actualizar(entidad);
		
	}

    @DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}

}
