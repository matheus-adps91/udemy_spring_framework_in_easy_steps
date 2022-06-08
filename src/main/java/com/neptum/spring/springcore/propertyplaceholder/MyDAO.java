package com.neptum.spring.springcore.propertyplaceholder;

class MyDAO 
{
	private String dbServer;
	
	MyDAO(String dbServer){
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}
}