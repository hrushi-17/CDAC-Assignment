package com.demo.beans;

import java.time.LocalDate;

public class Employee  implements Comparable<Object>{

	private int eid;
	private String ename;
	private double sal;
	private LocalDate ldt;
	
	public Employee() {
		super();
	}

	
	 
	public Employee(int eid) {
		super();
		this.eid = eid;
	}


	public Employee(int eid, String ename, double sal, LocalDate ldt) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.ldt = ldt;
	}

	@Override
	public boolean equals(Object obj) {
		return this.eid == ((Employee)obj).eid;
	}


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public LocalDate getLdt() {
		return ldt;
	}

	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", ldt=" + ldt + "]";
	}



	@Override
	public int compareTo(Object ob) {
		System.out.println("Salary --->"+this.sal+"----"+ ((Employee)ob).sal );
		return (int)(this.sal - ((Employee)ob).sal);
		
	}
	



//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}
