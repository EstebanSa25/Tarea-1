/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosuh;


public class ArreglosUH {

 
    public static void main(String[] args) {
        int num1=5;
        float flotante =24.33f;//32 bits
        double doble =64.23d;//64 btis
        boolean boleana=true;
        byte b=0;//8 bits
        short s=36;//16 bits
        long l=455;
        String cadena="Hoy es un excelente dia";
        char caracter='c';
   //System.out.println(num1);
   // System.out.println(cadena.length());
    int [] edad=new int[num1];
    
   int[] notas=new int[3];
   String [] estudiantes=new String[]{"Maria","Marta","Jesus","Pedro"};
   notas[0]=100;
   notas[1]=70;
   notas[2]=90;
   
   float sumatoria=0;
   int cont=1;
   int total=0;
   int totalInvertido=0;
      //  for (int i = estudiantes.length-1; i >= 0; i--) {
       //     System.out.println("Esdiantes: " +estudiantes[i]);
        //}
  
        //  for (int i = 0; i < notas.length; i++) {
           // sumatoria+=notas[i];
       // }
       //   sumatoria/=notas.length;
         // System.out.println("promedio: "+sumatoria);
          int[][]matriz=new int[3][3];
          for (int f = 0; f < 3; f++) {
              for (int c = 0; c < 3; c++) {
                  matriz[f][c]+=cont++;
                  if(c==2){
                  total+=matriz[f][c];
                  }
                  if(c==f){
                  totalInvertido+=matriz[f][c];
                  }
              }
        }
          for (int f = 0; f < 3; f++) {
              for (int c = 0; c < 3; c++) {
                  System.out.print("["+matriz[f][c]+"]");
              }
              
              System.out.println("");
        }
        // System.out.println(total); 
         
          System.out.println("Diagonal Principal");
         for (int F = 0; F < 3; F++) {
             for (int C = 0; C < 3; C++) {
                 if(F==C){
                     System.out.print("["+matriz[F][C]+"]");
                }
                
             }
             System.out.print("\t");
        }
         System.out.println("\nDiagonal Secundaria");
        for (int F = 0; F < 3; F++) {
             for (int C = 0; C < 3; C++){
                 if ((F + C) == (3 - 1)) {
                    System.out.print("["+matriz[F][C] + "]");
                }
             }
             System.out.print("\t");
        }
    }//main

}//class

