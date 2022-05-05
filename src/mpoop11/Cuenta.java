/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;


/**
 *Clase que crea una cuenta
 * @author alumno
 */
public class Cuenta {
    private float saldo;
    private int contador;
    /**
     * Constructor vacío
     */
    public Cuenta() {//Todas las variables se inicializan en cero
    }
    public float getSaldo() {
        return saldo;
    }
    /**
     * Método que deposita el dinero seleccionado a la cuenta
     * @param saldo Valor que se quiere depositar a la cuenta
     * @throws IngresoMayorAVeinteMil 
     */
    public void depositar(float saldo) throws IngresoMayorAVeinteMil{
        System.out.println("Depositando...");
        if(saldo>=20000){
            throw new IngresoMayorAVeinteMil("Monto mayor a veinte mil pesos");
        }
        else{
        this.saldo += saldo;}
    }
    /**
     * Método que retira la cantidad seleccionada de la cuenta
     * @param monto Valor que se retira de la cuenta
     * @throws SaldoInsuficienteException
     * @throws MasDe3Retiros 
     */
    public void retirar(float monto) throws SaldoInsuficienteException, MasDe3Retiros{         
        System.out.println("Retirando...$"+monto);
        if (saldo<monto) {
            throw new SaldoInsuficienteException();
        }else{
            if (contador<3) {
                contador+=1;
            saldo-=monto;
            }else{
                throw new MasDe3Retiros();
            }
        }
    }
}
