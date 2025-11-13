package clases;
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    // Lista estatitca donde se guardan todas las instancias de cuentas bancarias
    private static ArrayList<CuentaBancaria> listaDeCuentasbancarias = new ArrayList<>();

    //Constructor ayudantia
    public CuentaBancaria(Double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuentaBancaria();
        listaDeCuentasbancarias.add(this);
    }

    //Getters y setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    // Generar numero de cuenta de 6 digitos 
    private int generarNumeroCuentaBancaria(){
        Random random = new Random();
        int numeroCuenta = 100000 + random.nextInt(900000);
        return numeroCuenta;
    }

    // Metodos de deposito, retiro, desplegar info
    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado de forma exitosa, por el monto de $" + monto);
        } else {
            System.out.println("Monto no valido para depositar");
            
        }
    }

    public void retirar (double monto){
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado de forma exitosa, por el monto de $" + monto);
        } else if(monto > saldo){
            System.out.println("Fondos insuficientes");
        } else{
            System.out.println("Monto no valido para el retiro");
        }
    }
        //Muestra la información de la cuenta incluyendo la información del titular.
    public void despliegaInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular.getNombre() + " (Edad: " + titular.getEdad() + ")");
        System.out.println("Saldo actual: $" + saldo);
    }

    //Método estático que recorre la lista de cuentas bancarias e imprime su información.
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("INFORMACIÓN DE TODAS LAS CUENTAS");
        for (CuentaBancaria cuenta : listaDeCuentasbancarias) {
            cuenta.despliegaInformacion();
        }
        System.out.println("------------------------------------");
    }


}
