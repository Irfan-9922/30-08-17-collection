/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

/**
 * NAME:shaikh irfan
 *
 * DATE:8:10:06 am
 *TIME:30-Aug-2017
 *TAGS:
 */
public class vichel {
	/**
	 * @return the vichettype
	 */
	public String getVichettype() {
		return vichettype;
	}
	/**
	 * @param vichettype the vichettype to set
	 */
	public void setVichettype(String vichettype) {
		this.vichettype = vichettype;
	}
	private String vichettype;
	private int vichelno;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "vichel [vichettype=" + vichettype + ", vichelno=" + vichelno + "]";
	}
	/**
	 * @return the vichelno
	 */
	public int getVichelno() {
		return vichelno;
	}
	/**
	 * @param vichelno the vichelno to set
	 */
	public void setVichelno(int vichelno) {
		this.vichelno = vichelno;
	}

}
