/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author emeris
 */
package EstateAgent.interfaces;
        
public interface IEstateAgent {
    double EstateAgentSales(double[] propertySales);
    double EstateAgentCommision(double propertySales);
    int TopEstateAgent(double[] totalSales);
}
