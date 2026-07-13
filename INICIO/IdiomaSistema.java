/******************************************************************************
 * DESCRIÇÃO:
 * Programa simples que captura o idioma padrão configurado no sistema 
 * operacional e exibe a informação no terminal do usuário.
 *
 * FUNCIONAMENTO:
 * 1. Importa a classe Locale da biblioteca padrão do Java.
 * 2. Consulta a máquina e armazena as configurações regionais do usuário.
 * 3. Recupera o código de identificação do idioma local e o imprime na tela.
 *
 * Autor: Amanda-Aziz
 * Data: 13 de Julho de 2026
 *******************************************************************************/

package com.mycompany.horadosistema;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault();
        System.out.println("A linguagem do seu computador é: ");
        System.out.print(linguagem);
    }
}
