package com.uncia.civil.accumulatenotin.model;

import java.util.List;

public class Cibil {

	private List<Account> listOfAccount;
	private boolean mit;

	public Cibil() {
	}

	public Cibil(List<Account> listOfAccount, boolean mit) {
		super();
		this.listOfAccount = listOfAccount;
		this.mit = mit;
	}

	public List<Account> getListOfAccount() {
		return listOfAccount;
	}

	public void setListOfAccount(List<Account> listOfAccount) {
		this.listOfAccount = listOfAccount;
	}

	public boolean isMit() {
		return mit;
	}

	public void setMit(boolean mit) {
		this.mit = mit;
	}

}
