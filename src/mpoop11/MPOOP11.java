/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;


/**
 *Clase principal
 * @author alumno
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     * @throws mpoop11.MasDe3Retiros
     */
    public static void main(String[] args) throws MasDe3Retiros, IngresoMayorAVeinteMil {
        try{
            String[] mensajes = {"mensaje 1","mensaje 2", "mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());//Hablar del getMessage
        }
        System.out.println("Sigue el código");
        System.out.println("####División entre 0######");
        System.out.println("#####Catch anidados#######");
        try{
            float x= 10/0;
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error"+ex.getMessage());//Hablar del getMessage
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Apesar de todo se ejecuta el finally");//Linea del finally si se ocupa aunque haya error catastrofico y se tiene que cerrar el programa
        }
        System.out.println("#######Propagación de excepciones#########");
        try{
            double division = miMetodoDivision(20.0f,0); 
            System.out.println(division);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("#####Mi cuenta####");
        Cuenta cuenta= new Cuenta();
        try{
            System.out.println(cuenta.getSaldo());
            cuenta.depositar(1_000f);
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(50);
            cuenta.retirar(45);
            cuenta.retirar(20);
            //cuenta.retirar(1_000); retirar más de lo que hay en la cuenta
            //cuenta.retirar(20); caso más de 3 retiros
            System.out.println(cuenta.getSaldo());
            cuenta.depositar(20_000);
            System.out.println(cuenta.getSaldo());
        }catch(SaldoInsuficienteException | MasDe3Retiros| IngresoMayorAVeinteMil ex){
            System.out.println(ex.getLocalizedMessage());
        }
        System.out.println("saldo final "+cuenta.getSaldo());
    }
    /**
     * Método que divide dos números y regresa su resultado
     * @param f numerador de la división
     * @param d denomindor de la división
     * @return resultado de la división
     * @throws ArithmeticException 
     */
    private static double miMetodoDivision(float f, double d) throws ArithmeticException{
        return f/d;
    }
}
