/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.Map.resp.responce1;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:40:00 am TIME:30-Aug-2017 TAGS:
 */
public class simpleMapDemo {

	/**
	 * user info registretion for adhar card
	 */
	static String s;
	public static Scanner ss = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<adharcard, details> map = new HashMap();
		do {
			System.out.println("1.for inserting new record");
			System.out.println("2.for dispalying full detail of all  record");
			System.out.println("3.for show the recoed");
			System.out.println("enter the choice/n");
			String ch = ss.next();
			s = ch;
			switch (s) {
			case "1": {
				adharcard v = adhar();
				details d = details();
				/*d.setJob(jobd());
				d.setB(business());
				d.setLand(land());
				d.setV(vichel());
				d.setIncome(income());*/
				map.put(v, d);
				break;
			}
			case "2": {
				System.out.println(map);
				break;
			}
			case"3":{
				System.out.println("enter the record no for show the record");
				ch=ss.next();
				s=ch;
				if(map.containsKey(s)){
					System.out.println(map.get(s));
				}
				
				else{
					
					System.out.println("key not found");


				}
				
			}
			default:
				System.out.println("invalid option");

			}
			System.out.println("do you wnt to continue(yes/no);");
			ch = ss.next();
			s = ch;
		} while (s.equalsIgnoreCase("yes"));

	}
	private static details details() {
		details d = new details();
		return d;
	}
	private static vichel vichel() {
		vichel vv = new vichel();
		System.out.println("enter the vichel no");
		int vn = ss.nextInt();
		vv.setVichelno(vn);
		System.out.println("enter the vichel type");
		String vt = ss.next();
		vv.setVichettype(vt);
		return vv;
	}
	private static incomesource income() {
		incomesource incom = new incomesource();
		System.out.println("enter the income source");
		String source = ss.next();
		incom.setAnyaotherincomeSource(source);
		return incom;
	}
	private static business business() {
		business business = new business();
		System.out.println("enter the business details::");
		System.out.println("enter the business city::");
		String sity = ss.next();
		business.setBcity(sity);
		System.out.println("enter the business type::");
		String bt = ss.next();
		business.setBusineeType(bt);
		return business;
	}

	/**
	 * this method gives informination about land
	 */
	private static land land() {
		System.out.println("please enter the land details");
		land land = new land();
		System.out.println("please enter the land type:/t");
		String l = ss.next();
		land.setLandType(l);
		System.out.println("please enter the how much land you have:/t");
		float f = ss.nextFloat();
		land.setTotalland(f);
		return land;
	}

	/**
	 * this is the main method of the class which can hold the main user details 
	 */
	private static adharcard adhar() {
		adharcard v = new adharcard();
		System.out.println("welcome to the adhar card registretion please enter below i" + "informinaton cearfully /n");
		System.out.println("please enter the name:/t");
		String name = ss.next();
		v.setName(name);
		System.out.println("please enter the gender:/t");
		String ge = ss.next();
		v.setGender(ge);
		System.out.println("please enter the village:/t");
		String vi = ss.next();
		v.setAdres(vi);
		System.out.println("please enter the dob:/t");
		int it = ss.nextInt();
		v.setDate(it);
		return v;
	}

	/**
	 * this method is used to hold job details
	 * 
	 */
	private static job jobd() {
		System.out.println("please enter the job details: /n");
		job job = new job();
		System.out.println("please enter the job tital:/t");
		String jo = ss.next();
		job.setJobtital(jo);
		System.out.println("please enter the company:");
		String c = ss.next();
		job.setCompany(c);
		System.out.println("please enter the job location:/t");
		String lo = ss.next();
		job.setCity(lo);
		return job;

	}
}
