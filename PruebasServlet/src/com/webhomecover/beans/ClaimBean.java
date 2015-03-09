package com.webhomecover.beans;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class ClaimBean implements Serializable {

	private static final long serialVersionUID = -6513780033930413710L;
	private String claimDescription;
	private String claimType;
	private double claimValue;
	private String policyNumber;
	public ClaimBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return claimDescription;
	}
	public String getType() {
		return claimType;
	}
	public String getClaim() {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String valueOfClaimFormatted = currencyFormat.format(claimValue);
		return valueOfClaimFormatted;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setDescription(String claimDescription) {
		this.claimDescription = claimDescription;
	}
	public void setType(String claimType) {
		
		this.claimType = claimType;
	}
	public void setClaim(String claim) {
		
		try {
			this.claimValue = Double.parseDouble(claim);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(claimValue + "is not a valid number");
		}
		
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	
}
