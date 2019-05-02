package Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JSON.importa;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Operacoes.Calculo;

/**
 *
 * @author debor
 */
public class JUnitTeste extends TestCase{
    
    Calculo cal  = new Calculo();
    importa json = new importa();
    
    public JUnitTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMedia(){
       assertEquals(7.5, cal.media(json.importaJson()));
    }
    @Test
    public void testModa(){
       assertEquals(0.0, cal.moda(json.importaJson()));
    }
    @Test
    public void testMediana(){
       assertEquals(7.5, cal.mediana(json.importaJson()));
    }
    
    @Test
    public void testVariancia(){
       assertEquals(4.33, cal.variancia(json.importaJson()));
    }
    @Test
    public void testDesvioPadrao(){
       assertEquals(2.08, cal.desvioPadrao(json.importaJson()));
    }
    
}
