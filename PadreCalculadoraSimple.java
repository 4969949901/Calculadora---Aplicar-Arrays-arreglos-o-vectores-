
package herenciacalculadora;


public class PadreCalculadoraSimple {
    private String [] vectorAlmacenar;
    private int contador;
    private double[] matriz;
    private int indiceVector;
   
    
    
    public PadreCalculadoraSimple(){
        this.contador=0;
        vectorAlmacenar= new String [300];
        this.indiceVector=0;
    }
   
    
  
    
    public int sumar (int no1, int no2){
     int resultado= no1 + no2;
     this.registrarOperaciones("sumar", no1, no2, resultado);
     return no1+no2;
    }
    
    public int restar (int no1, int no2){
     int resultado= no1 - no2;
     this.registrarOperaciones("restar", no1, no2, resultado);
     return no1-no2;
    }
    
    public int multiplicar (int no1, int no2){
     int resultado= no1 * no2;
     this.registrarOperaciones("multiplicar", no1, no2, resultado);
     return no1*no2;
    }
    
    public int dividir (int no1, int no2){
     int resultado= no1 / no2;
     this.registrarOperaciones("dividir", no1, no2, resultado);
     return no1/no2;
    }
    
   public void registrarOperaciones(String tipo,double primerValor,double segundoValor, double resultado){
        indiceVector=indiceVector+1;
        vectorAlmacenar[indiceVector]=primerValor+""+tipo+""+segundoValor+"resultado: "+resultado;
    
    }
   
   public void registrarOperacione(String tipo,double primerValor, double resultado){ //se utilizara en subclase hija para metodo raiz
        indiceVector=indiceVector+1;
        vectorAlmacenar[indiceVector]=primerValor+"  "+tipo+"  "+"resultado: "+resultado;
    
    }
   
   public void mostrarOperaciones(){
        try{       
            for (int i=1; i<vectorAlmacenar.length;i++){
                if(vectorAlmacenar[i] != null){
                    System.out.println(vectorAlmacenar[i]);
                }
            }
            System.out.println("\n // Mostrara  el vector // \n");
            for(String operacion : vectorAlmacenar){
                if(operacion != null){
                    System.out.println(operacion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    

}
   
}
