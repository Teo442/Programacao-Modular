import java.util.Scanner; 

/*
Faça um programa que leia um vetor A com 15 elementos inteiros. Em seguida, construa
um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial
correspondente de cada elemento de A. Imprima na tela os vetores A e B.
*/

//declaração da classe
public class Q01{
    public static void main(String args[]){
        int[] A = new int[15]; //vetor com 15 inteiros
        float[] B = new float[15]; //vetor B também possui 15 inteiros
        Scanner sc = new Scanner(System.in); //abertura do scanner

        for(int i = 1; i <= 15; i++){ 
            System.out.print("Digite a posição " + i + ": ");//leitura dos valores
            A[i] = sc.nextInt(); //armazenamento do dado
        }

        //fatorial
        for(int i = 0; i < 15; i++){
            float total = 1; //resultado do fatorial 
            int range = A[i]; //range para repetição
            int fat = A[i]; 
            for(int j = 0; j < range; j++){
                total = total * fat; //realiza a fatoração
                fat--; 
            }
            B[i] = total; //atribui o fatorial a B
            System.out.println("O fatorial " + i + " é igual a " + B[i]);
        }

        sc.close();//fechamento do scanner
    }
}