/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.NovemberExam;

import java.util.Date;

/**
 *
 * @author Cliftonb
 */
public class Activity {

	private String description;
	private double cost;
	private Date date;

	public static final double ANNUAL_EXCURSION_INSUARNCE_COST = 105.25;

	public Activity(String inDescription, double inCost, Date inDate) {
		description = inDescription;
		cost = inCost;
		date = inDate;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

	public Date getActivityDate() {
		return date;
	}
}
