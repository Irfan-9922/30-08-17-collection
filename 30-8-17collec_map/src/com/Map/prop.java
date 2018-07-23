/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:47:10 am
 *TIME:30-Aug-2017
 *TAGS:
 */
public class prop {
	private Double land;
	private Double BankBalance;
	private Boolean business;
	/**
	 * @return the land
	 */
	public Double getLand() {
		return land;
	}
	/**
	 * @param land the land to set
	 */
	public void setLand(Double land) {
		this.land = land;
	}
	/**
	 * @return the bankBalance
	 */
	public Double getBankBalance() {
		return BankBalance;
	}
	/**
	 * @param bankBalance the bankBalance to set
	 */
	public void setBankBalance(Double bankBalance) {
		BankBalance = bankBalance;
	}
	/**
	 * @return the business
	 */
	public Boolean getBusiness() {
		return business;
	}
	/**
	 * @param business the business to set
	 */
	public void setBusiness(Boolean business) {
		this.business = business;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "prop [land=" + land + ", BankBalance=" + BankBalance + ", business=" + business + "]";
	}
	

}
