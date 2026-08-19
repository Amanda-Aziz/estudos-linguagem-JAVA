// imprimindo uma matriz de inteiros 3x3 transposta

package MatrizT;

public class MatrizTrans { // cria uma classe chamada MatrizTrans
    public static void main(String[] args){  // esta linha diz basicamente que o metodo main esta sendo executado (main: metodo principal executado quando o programa é iniciado)
        int[][] matrizOriginal = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
                                                            //length: tamanho
        for(int i=0; i<matrizOriginal[0].length; i++){ 

            for(int j=0; j<matrizOriginal.length; j++){
                System.out.print(matrizOriginal[j][i] + " ");
            }
            System.out.println();
        }
    }
}
