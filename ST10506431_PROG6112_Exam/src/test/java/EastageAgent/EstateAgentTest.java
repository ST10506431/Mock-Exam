/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package EastageAgent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emeris
 */
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    @org.junit.jupiter.api.Test
    public void CalculateTotalSales_ReturnsTotalSales() 
    {
        double[] mockedSales = {100, 200, 500};
        EstateAgent estateAgent = new EstateAgent();
        
        int expected = 800;
        
        double actual = estateAgent.EstateAgentSales(mockedSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void CalculateTotalCommission_ReturnsTotalCommission() 
    {
        double mockedTotalSale = 100;
        EstateAgent estateAgent = new EstateAgent();
        
        double expected = 2;

        double actual = estateAgent.EstateAgentCommision(mockedTotalSale);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void TopAgent_ReturnsTopPosition() 
    {
        double[] mockedTotalSales = {100,200};
        EstateAgent estateAgent = new EstateAgent();
        
        int expected = 1;
        
        int actual = estateAgent.TopEstateAgent(mockedTotalSales);
        assertEquals(expected, actual);
        
    }
    
}
