/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

/**
 * NAME:shaikh irfan
 *
 * DATE:8:06:00 am
 *TIME:30-Aug-2017
 *TAGS:
 */
public class land {
	private String landType;
	private double totalland;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "land [landType=" + landType + ", totalland=" + totalland + "]";
	}
	/**
	 * @return the landType
	 */
	public String getLandType() {
		return landType;
	}
	/**
	 * @param landType the landType to set
	 */
	public void setLandType(String landType) {
		this.landType = landType;
	}
	/**
	 * @return the totalland
	 */
	public double getTotalland() {
		return totalland;
	}
	/**
	 * @param totalland the totalland to set
	 */
	public void setTotalland(double totalland) {
		this.totalland = totalland;
	}

}
