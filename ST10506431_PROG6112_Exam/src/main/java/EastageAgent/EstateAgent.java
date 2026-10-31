/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EastageAgent;

import EstateAgent.interfaces.IEstateAgent;

/**
 *
 * @author emeris
 */
public class EstateAgent implements IEstateAgent {

    private double[][] propertySales = {{800000, 1500000, 2000000}, {700000, 1200000, 16600000}};
    private String[] agents = {"Joe Bloggs", "Jane Doe"};

    //Constants are best practise
    private final double COMMISSION_PERCENTAGE = 0.02;

    @Override
    public double EstateAgentSales(double[] propertySales) {
        double result = 0;
        for (double sale : propertySales) //For each Loop
        {
            result += sale;
        }

        return result;
    }

    @Override
    public double EstateAgentCommision(double propertySales) {
        return propertySales * COMMISSION_PERCENTAGE;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        double max = Double.MIN_VALUE;//Lowest double value
        int best = -1;

        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] >= max) {
                best = i;
            }
        }
        return best;
    }

    private double[] EstateAgentSales() {
        double[] totals = new double[propertySales.length];//Array to store the totals must be the same length as the amount of agents
        for (int i = 0; i < propertySales.length; i++) {
            totals[i] = EstateAgentSales(propertySales[i]);
        }
        return totals;
    }

    private double[] EstateAgentCommision(double totals[]) {
        double[] commissions = new double[totals.length];
        for (int i = 0; i < totals.length; i++) {
            commissions[i] = EstateAgentCommision(totals[i]);
        }
        return commissions;
    }

    public void displayMonthlyReport() {
        double[] totals = EstateAgentSales();
        double[] commissions = EstateAgentCommision(totals);

        int topAgent = TopEstateAgent(totals);

        System.out.println("Estate agent sales report");

        System.out.printf("%-15s %-15s %-15s %-15s %n", "Month:", "Jan", "Feb", "Mar");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < propertySales.length; i++) {
            System.out.printf("%-15s R%-14.2f R%-14.2f R%-14.2f  %n", agents[i], propertySales[i][0], propertySales[i][1], propertySales[i][2]);

        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < propertySales.length; i++) {
            System.out.printf("Totals sales for %-15s: R%.2f%n", agents[i], totals[i]);
        }
        System.out.println("");
        for (int i = 0; i < propertySales.length; i++) {
            System.out.printf("Commission for %-15s: R%.2f%n", agents[i], commissions[i]);
        }
        System.out.println("");
        System.out.printf("Top agent: %s", agents[topAgent]);

    }
}
