/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici2;

import exercici2.Metodes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexr
 */
public class MetodesTest {
    
    public MetodesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of existeixNom method, of class Metodes.
     */
    @Test
    public void testExisteixNom() {
        System.out.println("existeixNom");
        String[] llista = null;
        String busqueda = "";
        boolean expResult = false;
        boolean result = Metodes.existeixNom(llista, busqueda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicioArray method, of class Metodes.
     */
    @Test
    public void testPosicioArray() {
        System.out.println("posicioArray");
        String[] llista = null;
        String busqueda = "";
        int expResult = 0;
        int result = Metodes.posicioArray(llista, busqueda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introduirLlistaGrup method, of class Metodes.
     */
    @Test
    public void testIntroduirLlistaGrup() {
        System.out.println("introduirLlistaGrup");
        String[] llista = null;
        Metodes.introduirLlistaGrup(llista);
        assertEquals(1, "");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introduirNomBuscat method, of class Metodes.
     */
    @Test
    public void testIntroduirNomBuscat() {
        System.out.println("introduirNomBuscat");
        String expResult = "";
        String result = Metodes.introduirNomBuscat();
        assertEquals(1, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
