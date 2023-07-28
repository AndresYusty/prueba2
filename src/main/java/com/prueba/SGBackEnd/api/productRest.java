package com.prueba.SGBackEnd.api;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.SGBackEnd.model.products;
import com.prueba.SGBackEnd.service.IproductsService;

@RestController
@RequestMapping("/api/product")
public class productRest {
	
	@Autowired
	private IproductsService service;
	
	@GetMapping("")
	public List<products> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public products listarPorId(@PathVariable int id) {  
		return service.listarPorId(id);
	}

    @PostMapping("")
	public void registrar(@RequestBody products entidad) {
	
		service.registrar(entidad);
	}

	@PutMapping("")
	public void actualizar(@RequestBody products entidad) {
	
		service.actualizar(entidad);
		
	}

    @DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
	
		service.eliminar(id);
	}

}
