package com.linkedin.servlet;

/**
 * Interface for the CatalogItem class
 * @author Christopher Slowley
 *
 */
public interface ICatalogItem {

	//Accessors / getters
	String getName();

	String getManufacturer();

	String getSku();
	
	//Mutators /setters

	void setName(String name);

	void setManufacturer(String manufacturer);

	void setSku(String sku);

}