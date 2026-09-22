//package MaiorMenor;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: "); // solicitando o tamanho do vetor para o usuario, qtd de caracteres 
        int tamanho = leitor.nextInt();
        int[] vetor = new int[tamanho]; // new int[] é um comando que cria o vetor com o tamanho que foi digitado

        System.out.println("\n");

        for(int i=0; i<tamanho; i++){
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            vetor[i] = leitor.nextInt();
        }
        int maior = vetor[0];
        int menor = vetor[0];

        for(int i=0; i<tamanho; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("\nO maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);

    }
}
