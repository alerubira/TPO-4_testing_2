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

/**
 *
 * @author Gabriel
 */
public class cuentaTest {
    
    public cuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       // BeforeClass muestra: Fecha de transacción y la fechaLocal → 2020, Month.NOVEMBER, 13

    }
    
    @AfterClass
    public static void tearDownClass() {
        //AfterClass: que muestra: FIN de la transacción
    }
    
    @Before
    public void setUp() {
       // Before: que instancia (micuenta) la cuenta origen y c3 (cuenta auxiliar). 
    }
    
    @After
    public void tearDown() {
       // After: que muestra: el saldo con que quedo la cuenta.
    }

    
    @Test
    public void testRetirarFallo(){
        /*B. Crear el método testRetirarFallo, que espera @Test(expected = Exception.class), que con micuenta llama a 
         retirarDinero(monto) pero intenta retirar un monto de 9000.0$, la prueba tendrá éxito al arrojar la Exeption
       desde cuenta.*/
    }
    @Test
    public void testRetirarExito(){
       /* C. Crear el método testRetirarExito, que llama a retirarDinero(monto) de la cuenta, la prueba tendrá éxito al 
        descontar saldo de la cuenta con normalidad.*/ 
    }
    @Test
    public void testDepositarDinero(){
       /* D. Crear el método testDepositarDinero un monto de 200.0$, utilice la aserción assertNotNull con la cuenta. 
         Luego llame a depositarDinero en cuenta, y use assertEquals donde su saldo esperado coincida con el real de 
        2200$. Use un delta de 0.2 centavos. */
    }
    @Test
    public void testTransferirCuentaNula(){
       /* E. Crear el método testTransferirCuentaNoNula que pueda arrojar Exception, utilice la aserción assertNull. Con 
         micuenta invocara a transferirDinero(c2, monto) , siendo c2 una variable local cuenta con 5000$ de saldo.*/
    }
    @Test
    public void testCuentasDiferentes(){
       /* F. Crear el método testCuentasDiferentes que con micuenta y la c3, llama a CuentasDiferentes en clase cuenta. 
     Luego usamos assertNotSame("SON la MISMA cuenta!! origen y destino",micuenta, micuenta. El mensaje se 
     muestra en caso de error, y le prueba debe FALLAR.*/
    }
    @Test
    public void testCuentasIguales (){
       /* G. Crear el método testCuentasIguales usamos assertSame("Las cuentas son diferentes---,micuenta, c3. El 
     mensaje se muestra en caso de error, y le prueba debe FALLAR.*/
    }
    @Test
    public void testOperacionTildada(){
      /* H. Creamos las @Test -timeout con 60 milisegundos, llamadas
    I. HtestOperacionTildada1: llama a OperacionTildada en clase cuenta, y le pasamos al Thread un 
      valor inferior a 50 milisegundos. Arroja una InterruptedException. Debe tener ÉXITO. */
    }
    @Test
    public void testOperacionTildada2(){
      /* II. testOperacionTildada2: llama a OperacionTildada en clase cuenta, y le pasamos al Thread un 
      valor superior a 50 milisegundos. Arroja una InterruptedException. Debe tener causar ERROR 
       TEST TIMED.*/ 
    }
}
