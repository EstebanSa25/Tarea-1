/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosuh;


public class ArreglosUH {

 
    public static void main(String[] args) {
   int cont=1;
   int total=0;
   int totalInvertido=0;
    
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
        System.out.println(total); 
         
          System.out.println("Diagonal Principal");
         for (int F = 0; F < 3; F++) {
             for (int C = 0; C < 3; C++) {
                 if(F==C){
                     System.out.print("["+matriz[F][C]+"]");
                }
                
             }
             System.out.print("\t");
        }
          int totalInvertido2=0;
         System.out.println("\nDiagonal Secundaria");
        for (int F = 0; F < 3; F++) {
             for (int C = 0; C < 3; C++){
                 if ((F + C) == (3 - 1)) {
                    System.out.print("["+matriz[F][C] + "]");
                  totalInvertido2+=matriz[F][C];
                }
             }
             System.out.print("\t");
        }
        int totalFinal=totalInvertido2+totalInvertido;
        System.out.println("\nSuma de diagonal secundaria: "+totalInvertido2+"\nSuma de Diagonal Principal: "+totalInvertido+"\nTotal de suma de las diagonales: "+totalFinal);
    }//main

}//class

