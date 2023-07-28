package com.prueba.SGBackEnd.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoices")
public class invoices {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nit", nullable = true)
	private String nit;
	
	@Column(name = "name", nullable = true)
	private String name;
	
	@Column(name = "subTotal", nullable = true)
	private float subTotal;
	
	@Column(name = "taxTotal", nullable = true)
	private float taxTotal;
	
	@Column(name = "totalDiscount", nullable = true)
	private float totalDiscount;
	
	@Column(name = "total", nullable = true)
	private float total;
	
	@Column(name = "created_at", nullable = true)
	private Timestamp  created_at;
	
	@Column(name = "updated_at", nullable = true)
	private Timestamp  updated_at;

	@Column(name = "deleted_at", nullable = true)
	private Timestamp  deleted_at;


}
