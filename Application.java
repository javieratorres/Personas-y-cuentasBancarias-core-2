import clases.CuentaBancaria;
import clases.Persona;

public class Application{
    public static void main(String[] args) {

        //Clientes 
        Persona persona1 = new Persona("Javiera Torres", 27);
        Persona persona2 = new Persona("Diego Ramírez", 34);
        Persona persona3 = new Persona("Camila Soto", 30);

        //Cuentas bantarias 
        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(2500.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(500.0, persona3);

        //Retiros, fondos induficientes
        System.out.println("----------------------");
        cuenta1.depositar(500.0);
        System.out.println(cuenta1.getSaldo());
        System.out.println("----------------------");
        cuenta2.retirar(1000.0);
        System.out.println(cuenta2.getSaldo());
        System.out.println("----------------------");
        cuenta3.depositar(200.0);
        System.out.println(cuenta3.getSaldo());
        cuenta3.retirar(1000.0); 
        System.out.println(cuenta3.getSaldo());
        System.out.println("----------------------");

        //Mostrar saldo actual
        System.out.println("-----SALDOS ACTUALES----");
        System.out.println(persona1.getNombre() + ": $" + cuenta1.getSaldo());
        System.out.println(persona2.getNombre() + ": $" + cuenta2.getSaldo());
        System.out.println(persona3.getNombre() + ": $" + cuenta3.getSaldo());

        //Informaacion de las cuentas
        System.out.println();
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
