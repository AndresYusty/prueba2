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
@Table(name = "products")
public class products {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "code", nullable = true, length = 12)
	private String code;
	
	@Column(name = "name", nullable = true)
	private String name;
	
	@Column(name = "price", nullable = true)
	private float price;
	
	@Column(name = "stock", nullable = true)
	private int stock;
	
	@Column(name = "created_at", nullable = true)
	private Timestamp  created_at;
	
	@Column(name = "updated_at", nullable = true)
	private Timestamp  updated_at;

	@Column(name = "deleted_at", nullable = true)
	private Timestamp  deleted_at;

}
