/******************************************************************************
 * DESCRIÇÃO:
 * Programa simples que identifica a resolução gráfica atual do monitor do 
 * usuário e exibe os valores de largura e altura no terminal.
 *
 * FUNCIONAMENTO:
 * 1. Acessa as ferramentas de interface gráfica do sistema operacional.
 * 2. Captura a quantidade total de pixels (largura e altura) da tela física.
 * 3. Exibe as dimensões encontradas formatadas no console de saída.
 *
 * Autor: Amanda-Aziz
 * Data: 13 de Julho de 2026
 *******************************************************************************/

package com.mycompany.horadosistema;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HoraDoSistema {

    public static void main(String[] args) {
      
      // EXPLICANDO DIMENSION E O TOOLKIT
      // 1. Dimension tela -> Cria uma variável que guarda dois valores: largura (width) e altura (height).
      // 2. Toolkit -> Classe do Java que serve de ponte entre o seu código e os recursos visuais do sistema operacional.
      // 3. .getDefaultToolkit() -> Ativa a caixa de ferramentas gráfica padrão do seu próprio computador (Windows, Mac ou Linux).
      // 4. .getScreenSize() -> É a ferramenta específica que mede o tamanho físico do seu monitor em pixels e entrega o resultado.
      Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
      
      System.out.println("A resolução geral do seu monitor é " + tela.width + "x" + tela.height);
    }   
}
