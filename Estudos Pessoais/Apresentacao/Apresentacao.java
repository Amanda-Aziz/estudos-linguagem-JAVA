/******************************************************************************
 * DESCRIÇÃO:
 * Programa simples que captura informações pessoais do usuário, como nome,
 * idade, peso e altura, e exibe os dados informados no terminal.
 *
 * FUNCIONAMENTO:
 * 1. Importa a classe Scanner da biblioteca padrão do Java para permitir
 *    a entrada de dados pelo teclado.
 * 2. Cria o objeto 'entrada' para receber as informações digitadas pelo usuário.
 * 3. Declara as variáveis 'nome', 'idade', 'peso' e 'altura' para armazenar
 *    os dados informados.
 * 4. Solicita ao usuário cada informação e armazena os valores nas variáveis.
 * 5. Exibe todas as informações coletadas no terminal.
 * 6. Fecha o objeto Scanner após o término da execução.
 *
 * Autor: Amanda-Aziz
 * Data: 14 de Agosto de 2026
 *******************************************************************************/

import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] arguments){
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double peso;
        double altura;
        
        System.out.print("\nDigite seu nome: ");
        nome = entrada.nextLine(); //O nextLine() pega o texto que o usuário digitou e coloca dentro da variável X

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt(); //idade é um número inteiro, para isso usa-se nextInt()

        System.out.print("Digite seu peso: ");
        peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("\n===============================\n");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");

        entrada.close();
    }
}

// Scanner é uma classe usada para ler dados digitados pelo usuário.
// "entrada" é o nome da variável que criamos para o Scanner.
// new Scanner(System.in) cria um leitor conectado ao teclado (entrada padrão).
//Scanner entrada = new Scanner(System.in);

// nextLine() lê uma linha de texto digitada pelo usuário.
// nextInt() lê um número inteiro digitado pelo usuário.
// nextDouble() lê um número decimal digitado pelo usuário.

// close() fecha o Scanner quando terminamos de usá-lo, liberando o recurso de entrada do teclado.

