/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moajava;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class MOAJAVA {
    public static void main(String args[]){
    int[][] caso1 = {{1, 5, 9, 13},
        {6, 3, 10, 14},
        {4, 11, 0, 15},
        {7, 2, 8, 12}};

        int[][] caso2 = {{1, 6, 0, 11},
        {2, 9, 13, 5},
        {3, 7, 14, 10},
        {4, 8, 12, 15}};

        int[][] caso3 = {{9, 8, 0, 14},
        {7, 6, 5, 1},
        {2, 4, 11, 10},
        {3, 12, 13, 15}};

        int[][] caso4 = {{1, 13, 7, 10},
        {2, 0, 12, 11},
        {3, 14, 6, 9},
        {8, 4, 5, 15}};

        int[][] caso5 = {{4, 7, 0, 13},
        {5, 9, 10, 14},
        {6, 11, 3, 1},
        {8, 2, 15, 12}};
        
        int[][][]casos = {caso1, caso2, caso3, caso4, caso5};
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Digite Heuristica Desejada:\n0 - Sair\n1 - Peças fora do lugar!\n2 - Peças fora da ordem de sequencia!\n3 - Distancia até o ponto correto (Manhattan)\n4 - Combinação das três heuristicas!\n5 - Maximo dentre as heuristicas!");
            System.out.print("Opcao: ");
            int opcao = in.nextInt();
            System.out.println();
            if (opcao==0){
                System.exit(0);
            }
            else if(opcao==1){
                for(int[][] caso : casos){
                    MOAH12014.principal(caso);
                }
            }
            else if(opcao==2){
                for(int[][] caso : casos){
                    MOAH22014.principal(caso);
                }
            }
            else if(opcao==3){
                for(int[][] caso : casos){
                    MOAH32014.principal(caso);
                }
            }
            else if(opcao==4){
                System.out.print("Digite primeira constante: ");
                double c1 = in.nextDouble();
                System.out.println();
                System.out.print("Digite segunda constante: ");
                double c2 = in.nextDouble();
                System.out.println();
                System.out.print("Digite terceira constante: ");
                double c3 = in.nextDouble();
                System.out.println();
                if (c1 + c2 + c3 == 1.00){
                    for(int[][] caso : casos){
                        MOAH42014.principal(caso,c1, c2, c3);
                    }
                }
                else{
                    System.out.println("Soma das constantes não é um!");                }
                    
            }
            else if(opcao==5){
                for(int[][] caso : casos){
                    MOAH52014.principal(caso);
                }
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        }
        
    }
        
}
