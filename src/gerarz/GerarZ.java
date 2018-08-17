/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarz;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GerarZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o valor da matriz quadrada: ");
        int valor = scan.nextInt();
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String matriz[][] = new String[valor][valor];
        int aux = valor - 2;
        int aux_alfabeto = 0;
        for(int l = 0; l<valor;l++){
            for(int c = 0; c<valor; c++){
                    if(l == 0 || l == valor -1){
                            matriz[l][c] = alfabeto[aux_alfabeto];
                            System.out.print(matriz[l][c]);
                            if(aux_alfabeto == 25){
                                aux_alfabeto = 0;
                            }else{
                                aux_alfabeto++;
                            }
                    }else{
                            if(c == aux){
                                    matriz[l][c] = alfabeto[aux_alfabeto];
                                    System.out.print(matriz[l][c]);
                                    aux = aux - 1;
                                    if(aux_alfabeto == 25){
                                        aux_alfabeto = 0;
                                    }else{
                                        aux_alfabeto++;
                                    }
                            }else{
                                    matriz[l][c] = " ";
                                    System.out.print(matriz[l][c]);
                            }
                    }
            }
            System.out.print("\n");
        }
        scan.close();

    }
    
}
