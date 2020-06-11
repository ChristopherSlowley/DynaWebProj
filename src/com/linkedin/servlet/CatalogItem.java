package com.linkedin.servlet;

/**
 * 
 * @author Christopher Slowley
 * Class to represent an item in the store catalog
 */
public class CatalogItem implements ICatalogItem {
	
	private String name;
	private String manufacturer;
	private String sku;
	
	/**
	 * Primary constructor
	 * @param name
	 * @param manufactuer
	 * @param sku
	 */
	public CatalogItem (String name, String manufactuer, String sku)
	{
		super();
		this.name = name;
		this.manufacturer = manufactuer;
		this.sku = sku;
	}
	
	//Accessors / getters
	@Override
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String getManufacturer ()
	{
		return this.manufacturer;
	}
	
	@Override
	public String getSku()
	{
		return this.sku;
	}
	
	//Mutators /setters
	
	@Override
	public void setName (String name)
	{
		this.name = name;
	}
	
	@Override
	public void setManufacturer (String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	@Override
	public void setSku (String sku)
	{
		this.sku = sku;
	}
}
