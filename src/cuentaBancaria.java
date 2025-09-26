
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cuentaBancaria {

    private int numeroCuenta;
    private int ccCliente;
    private int saldoActual;

    //CONSTRUCTOR


    public cuentaBancaria() {
    }

    //CONSTRUCTOR PARAMETROS

    public cuentaBancaria(int numeroCuenta, int ccCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.ccCliente = ccCliente;
        this.saldoActual = saldoActual;
    }
    //SET AND GET


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getCcCliente() {
        return ccCliente;
    }

    public void setCcCliente(int ccCliente) {
        this.ccCliente = ccCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    //TO STRING


    @Override
    public String toString() {
        return "cuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", ccCliente=" + ccCliente +
                ", saldoActual=" + saldoActual +
                '}';
    }

    //METODOS PROPIOS
    public int b1(int monto) {

       return this.saldoActual+=monto;



    }

    public int revisar(){
        return saldoActual;

    }
    public int retiro(int sacar) {


        if(saldoActual>=sacar){
            saldoActual = saldoActual - sacar;

        }else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldoActual-=sacar;




    }
    public int retiro2(){

        if(saldoActual>10000){

            saldoActual= saldoActual - (saldoActual/100*20);
            System.out.println("Usted acaba de retirar: " +this.saldoActual*20/100);

        }else{
            System.out.println("Saldo insuficiente");

        }
        return this.saldoActual-=(saldoActual/100*20);

    }






}

