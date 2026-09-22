/******************************************************************************
 * DESCRIÇÃO:
 * Programa simples que captura a data e a hora atual do sistema operacional 
 * e exibe as informações formatadas no terminal do usuário.
 *
 * FUNCIONAMENTO:
 * 1. Importa a classe Date da biblioteca padrão do Java.
 * 2. Instancia o objeto 'relogio' para coletar o horário atual da máquina.
 * 3. Converte os dados para texto e imprime o resultado na tela.
 *
 * Autor: Amanda-Aziz
 * Data: 13 de Julho de 2026
 *******************************************************************************/

import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();   /*Cria um objeto chamado 'relogio' baseado na ferramenta Date que foi importado no inicio.*/
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
}
