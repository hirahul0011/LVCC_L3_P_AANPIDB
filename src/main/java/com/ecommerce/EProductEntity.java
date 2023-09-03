package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	
	private long ID;
	private String pName;
	private BigDecimal pPrice;
	private Date dateAdded;
	private String pHDD;
	private String pCPU;
	private String pRAM;
	
	public EProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(long iD, String pName, BigDecimal pPrice, Date dateAdded, String pHDD, String pCPU,
			String pRAM) {
		super();
		ID = iD;
		this.pName = pName;
		this.pPrice = pPrice;
		this.dateAdded = dateAdded;
		this.pHDD = pHDD;
		this.pCPU = pCPU;
		this.pRAM = pRAM;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public BigDecimal getpPrice() {
		return pPrice;
	}

	public void setpPrice(BigDecimal pPrice) {
		this.pPrice = pPrice;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getpHDD() {
		return pHDD;
	}

	public void setpHDD(String pHDD) {
		this.pHDD = pHDD;
	}

	public String getpCPU() {
		return pCPU;
	}

	public void setpCPU(String pCPU) {
		this.pCPU = pCPU;
	}

	public String getpRAM() {
		return pRAM;
	}

	public void setpRAM(String pRAM) {
		this.pRAM = pRAM;
	}
	
	
	

}
