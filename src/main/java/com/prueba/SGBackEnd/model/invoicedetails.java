package com.prueba.SGBackEnd.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Data
@Entity
@Table(name = "invoicedetails")
public class invoicedetails {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name = "idInvoice", nullable = false)
	private invoices Invoices ; 
	
	@ManyToOne  
	@JoinColumn(name = "idProduct", nullable = false)
	private products Products ; 
	
	@Column(name = "quantity", nullable = true)
	private int quantity;
	
	@Column(name = "price", nullable = true)
	private float price;
	
	@Column(name = "discount", nullable = true)
	private float discount;
	
	@Column(name = "created_at", nullable = true)
	private Timestamp  created_at;
	
	@Column(name = "updated_at", nullable = true)
	private Timestamp  updated_at;

	@Column(name = "deleted_at", nullable = true)
	private Timestamp  deleted_at;
	
	
	

}
