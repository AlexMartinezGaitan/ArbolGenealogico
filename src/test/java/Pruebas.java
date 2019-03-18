/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.arbolgenealogico.Inicio;

/**
 *
 * @author Alexander Martinez
 */
public class Pruebas {
    
    public Pruebas() {
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
    public void pruebas(){
    Inicio inicio = new Inicio();
    String resultadoEsperado;
    resultadoEsperado=("Juan,Andres,Juana,Paola");
    String resultadoObtenido= inicio.IngresarPersona();
    assertEquals(resultadoEsperado,resultadoObtenido);
    
    
    }    

// TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
