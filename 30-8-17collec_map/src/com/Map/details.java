/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

import java.util.List;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:59:35 am
 *TIME:30-Aug-2017
 *TAGS:
 */
public class details {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "details [job=" + job + ", land=" + land + ", b=" + b + ", income=" + income + ", v=" + v + "]";
	}
	//private prop prop;
	private job job;
	/**
	 * @return the job
	 */
	public job getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(job job) {
		this.job = job;
	}
	/**
	 * @return the land
	 */
	public land getLand() {
		return land;
	}
	/**
	 * @param land the land to set
	 */
	public void setLand(land land) {
		this.land = land;
	}
	/**
	 * @return the b
	 */
	public business getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(business b) {
		this.b = b;
	}
	/**
	 * @return the income
	 */
	public incomesource getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(incomesource income) {
		this.income = income;
	}
	/**
	 * @return the v
	 */
	public vichel getV() {
		return v;
	}
	/**
	 * @param v the v to set
	 */
	public void setV(vichel v) {
		this.v = v;
	}
	private land land;
	private business b;
	private incomesource income;
	private vichel v;
	
	

}
