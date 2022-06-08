package com.neptum.spring.springcoreadvanced.autowiring.quiz;

class Bill
{
	private int id;
	private double bill;
	
	public int getId() { return id; }
	
	public void setId(int id) { this.id = id; }
	
	public double getBill() { return bill; }
	
	public void setBill(double bill) { this.bill = bill; }
	
	@Override
	public String toString() {
		return "Bill [id=" + id + ", bill=" + bill + "]";
	}
}