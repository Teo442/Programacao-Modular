import java.util.Scanner;

/*
Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A.
Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são
par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar
 */

public class Q02{
    public static void main(String args[]){
        int[] A = new int[15]; //vetor com 10 inteiros
        int[] ParImpar = new int[2]; //vetor com 2 inteiros
        int par = 0; 
        int impar = 0;
        Scanner sc = new Scanner(System.in); //abertura do scanner

        for(int i = 1; i <= 10; i++){ 
            System.out.print("Digite a posição " + i + ": ");//leitura dos valores
            A[i] = sc.nextInt(); //armazenamento do dado
        } 
        
        //Par ou Impar
        for(int i = 0; i < 10; i++){ //percorre o array
            if(A[i] % 2 == 0){ //verifica par
                par++; 
            }else{
                impar++; 
            }
        }

        ParImpar[0] = par; 
        ParImpar[1] = impar; 

        System.out.println(ParImpar);

        sc.close();//fechamento do scanner
    }
}