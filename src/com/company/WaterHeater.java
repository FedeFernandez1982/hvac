package com.company;

/**
 * Created by Federico on 11/6/2016.
 */

import java.util.Date;

/**
 * Represents a service call to fix a Water Heater
 */
public class WaterHeater extends ServiceCall{

    private String age;
    private static double extraFee = 20;


    public WaterHeater(String serviceAddress, String problemDescription, Date date, String age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String extrafeeString = (extraFee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(extraFee);
        String finalFee = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee+extraFee);

        return "Water Heater AC Unit Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Age of the Water Heater Unit = " + age + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + " + Mandatory city fee: " + extrafeeString +
                ", Total = " + finalFee;

    }
}

