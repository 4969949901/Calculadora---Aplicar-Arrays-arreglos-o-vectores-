
package herenciacalculadora;

import java.util.Scanner;


public class HerenciaCalculadora {

   
    public static void main(String[] args) {
        Scanner inside= new Scanner(System.in);
        PadreCalculadoraSimple papure=new PadreCalculadoraSimple();
        HijaCalculadoraEspecial nueva=new HijaCalculadoraEspecial();
        int no1,no2,resultado,opc;
        boolean op=true;
        while (op){
            System.out.println("=================");
            System.out.println("Menú");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Potencia");
            System.out.println("6.Raiz");
            System.out.println("7.Salir");
            opc = inside.nextInt ();
            
            if (opc ==7){
                System.out.println("Finalizo.");
                break;
            } else {
                
                switch(opc){
                    case 1:
                        System.out.print("Ingrese un primer valor: ");
                         no1 =inside.nextInt();
                         System.out.print("Ingrese un segundo valor: ");
                         no2 =inside.nextInt();
                         resultado =papure.sumar (no1,no2);
                         System.out.println ("La suma es: " + resultado);
                          papure.mostrarOperaciones(); // aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.                   
                         break;
                    case 2:
                        System.out.print("Ingrese un primer valor: ");
                         no1 =inside.nextInt();
                         System.out.print("Ingrese un segundo valor: ");
                         no2 =inside.nextInt();
                         resultado =papure.restar (no1,no2);
                         System.out.println ("La resta es: " + resultado);
                          papure.mostrarOperaciones();// aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.
                    case 3:
                        System.out.print("Ingrese un primer valor: ");
                         no1 =inside.nextInt();
                         System.out.print("Ingrese un segundo valor: ");
                         no2 =inside.nextInt();
                         resultado =papure.multiplicar (no1,no2);
                         System.out.println ("La multiplicacion es de: " + resultado);
                         papure.mostrarOperaciones();// aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.
                         break;
                    case 4:
                        System.out.print("Ingrese un primer valor: ");
                         no1 =inside.nextInt();
                         System.out.print("Ingrese un segundo valor: ");
                         no2 =inside.nextInt();
                         resultado =papure.dividir (no1,no2);
                         System.out.println ("La division es de: " + resultado);
                         papure.mostrarOperaciones();// aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.
                         break;
                    case 5:
                        System.out.print("Ingrese un primer valor para la base: ");
                         no1 =inside.nextInt();
                         System.out.print("Ingrese un segundo valorpara el exponente: ");
                         no2 =inside.nextInt();
                         resultado = (int) nueva.potencia(no1,no2);
                         System.out.println ("La potencia  es de: " + resultado);
                         papure.mostrarOperaciones();// aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.
                         nueva.mostrarOperaciones();
                         break;
                    case 6:
                        System.out.print("Ingrese un primer valor: ");
                         no1 =inside.nextInt();
                        resultado = (int)nueva.raiz(no1);
                         System.out.println ("La raiz es de: " + resultado);
                         papure.mostrarOperaciones();// aca se mostrararan los datos almacenados en clase padre y subclase hija por medio de array o areglos.
                         nueva.mostrarOperaciones();
                         break;
                    
                }
            
            
            }
            
    }
        
}
}
