package com.uncia.civil.accumulatenotin.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private double od;
	private int loanType;
	private int ownership;

//	=======================Craeting list of data for NOT IN Condition ==================================
	
	private List<Integer> list = new ArrayList<>();
//	=========================================================
	public Account() {
	}

	public Account(double od, int loanType, int ownership) {
		this.od = od;
		this.loanType = loanType;
		this.ownership = ownership;
	}

	public double getOd() {
		return od;
	}

	public void setOd(double od) {
		this.od = od;
	}

	public int getLoanType() {
		return loanType;
	}

	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}

	public int getOwnership() {
		return ownership;
	}

	public void setOwnership(int ownership) {
		this.ownership = ownership;
	}

}
