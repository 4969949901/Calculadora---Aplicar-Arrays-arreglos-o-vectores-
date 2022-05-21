
package herenciacalculadora;


public class HijaCalculadoraEspecial extends PadreCalculadoraSimple{
    
   
     public double potencia (double no1, double no2){
         double resultado=Math.pow(no1, no2);
         this.registrarOperaciones("potencia", no1, no2, resultado);
        return Math.pow(no1, no2);
    }

    public double raiz(int no1){
        double resultado=Math.sqrt(no1);
        this.registrarOperacione("raiz", no1, resultado); // este metodo se encuentra en la clase PadreCalculadoraSimple
        return Math.sqrt(no1);
    }
    
   
    
}


/*int resultado= no1 * no2;
     this.registrarOperaciones("multiplicar", no1, no2, resultado);
     return no1*no2;*/