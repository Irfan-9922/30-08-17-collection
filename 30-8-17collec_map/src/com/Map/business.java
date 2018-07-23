/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

/**
 * NAME:shaikh irfan
 *
 * DATE:8:07:41 am
 *TIME:30-Aug-2017
 *TAGS:
 */
public class business {
	private String BusineeType;
	private String bcity;
	/**
	 * @return the busineeType
	 */
	public String getBusineeType() {
		return BusineeType;
	}
	/**
	 * @param busineeType the busineeType to set
	 */
	public void setBusineeType(String busineeType) {
		BusineeType = busineeType;
	}
	/**
	 * @return the bcity
	 */
	public String getBcity() {
		return bcity;
	}
	/**
	 * @param bcity the bcity to set
	 */
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "business [BusineeType=" + BusineeType + ", bcity=" + bcity + "]";
	}
	

}
