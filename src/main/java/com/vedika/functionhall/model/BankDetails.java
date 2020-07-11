package com.vedika.functionhall.model;

public class BankDetails {
	
	private String state;
	private String bank;
	private String ifsc;
	private String accountNumber;
	private String accountType;
	private String accountName;
	private String branch;
	private String address;
	private String contact;
	private String city;
	private String district;
	private String panNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "BankDetails [state=" + state + ", bank=" + bank + ", ifsc=" + ifsc + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + ", accountName=" + accountName + ", branch=" + branch + ", address="
				+ address + ", contact=" + contact + ", city=" + city + ", district=" + district + ", panNumber="
				+ panNumber + "]";
	}

}
