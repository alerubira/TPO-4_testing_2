
package tpo.pkg2_testing_2;

/**
 *
 * @author Gabriel
 */
public class cuenta {
    int numeroCuenta;
  double saldo=2000;

    public cuenta() {
    }

    public cuenta(int numeroCuenta,double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo=saldo;
    }
    public double retirarDinero(double monto)throws Exception{
        if(monto>saldo){
            throw new Exception("!!OJO!!No hay saldo suficiente!!");
        }else{
            this.saldo-=monto;
        }
     return saldo;   
    }
    public void depositarDinero(cuenta c,double monto){
        c.saldo+=monto;
    }
    public void transferirDinero(cuenta c2,double monto)throws Exception{
       this.retirarDinero(monto);
       depositarDinero(c2,monto);
    }
    public boolean cuentasDiferentes(cuenta c2){
        return this.equals(c2);
    }
    public void operacionTildada(int mili){
        try{
           Thread.sleep(mili);
            System.out.println("El tiempo de operacion es coherente");
        }catch(InterruptedException ex){
            System.out.println("¡Tiempo de espera exedido..... "+mili+" mili segundos");
        }
    }
}
