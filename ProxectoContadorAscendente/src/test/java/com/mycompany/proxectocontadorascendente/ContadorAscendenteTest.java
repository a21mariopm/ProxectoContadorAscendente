/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a21mariopm
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }

    /**
     * Test of incrementar method, of class ContadorAscendente.
     */
@Test
    public void testIncrementar() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(1);
        int expResult = 2;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
      
    /**
     * Test of reiniciar method, of class ContadorAscendente.
     */
@Test
    public void testReiniciar() {
        System.out.println("reiniciar");
        ContadorAscendente instance = new ContadorAscendente(0);
        instance.reiniciar();
    }

    /**
     * Test of cambiarValor method, of class ContadorAscendente.
     */
@Test
    public void testCambiarValor() {
        System.out.println("cambiarValor");
        int modificador = 2;
        ContadorAscendente instance = new ContadorAscendente(1);
        int expResult = 3;
        int result = instance.cambiarValor(modificador);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ContadorAscendente.
     */
@Test
    public void testToString() {
        System.out.println("toString");
        ContadorAscendente instance = new ContadorAscendente(1);
        String expResult = "ContadorAscendente{" + "valorActual=" + 1 + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
    }


  
@Test
    public void testIncrementar900() {
        System.out.println("incrementar valor 900");
        ContadorAscendente instance = new ContadorAscendente(900);
        int expResult = 901;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }

@Test
    public void testIncrementar1100() {
        System.out.println("incrementar valor 1100");
        ContadorAscendente instance = new ContadorAscendente(1100);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
@Test
    public void testIncrementar999() {
        System.out.println("incrementar valor 999");
        ContadorAscendente instance = new ContadorAscendente(999);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }   
    
 @Test
    public void testIncrementar0() {
        System.out.println("incrementar valor 0");
        ContadorAscendente instance = new ContadorAscendente(0);
        int expResult = 1;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }   
@Test
    public void testIncrementarmenos100() {
        System.out.println("incrementar valor -100");
        ContadorAscendente instance = new ContadorAscendente(-100);
        int expResult = -99;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }      
@Test
    public void testIncrementar1000() {
        System.out.println("incrementar valor 1000");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }     
    @Test
    public void testIncrementar99() {
        System.out.println("incrementar valor 99");
        ContadorAscendente instance = new ContadorAscendente(99);
        int expResult = 100;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }     
    
@Test
    public void testIncrementar1001() {
        System.out.println("incrementar valor 1001");
        ContadorAscendente instance = new ContadorAscendente(1001);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }     

}
