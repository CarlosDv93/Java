/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vogalrecursão;

/**
 *
 * @author CarlosDv93
 */
public class VogalRecursão {

    /**
     * Variaveis Globais que mantém o valor de cada vogal no texto.
     */
    static int a=0, e=0, i=0, o=0, u=0;
           
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char lista[] = {  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                            'U', 'V', 'W', 'X', 'Y', 'Z' };
        
        buscaRecursivaVogal(lista, 0);
        System.out.println("..::Quantidade de Vogais::..");
        System.out.println("\tA..........: " + a);
        System.out.println("\tE..........: " + e);
        System.out.println("\tI..........: " + i);
        System.out.println("\tO..........: " + o);
        System.out.println("\tU..........: " + u);
        
        System.out.println("Total....................: " + (a+e+i+o+u));
    }

    private static char buscaRecursivaVogal(char[] lista, int pos) {
        
        /**
         * O primeiro IF verifica se chegamos ao final do arquivo que estamos lendo. 
         * Por Arquivo quero dizer qualquer coisa. rsrsrsrsr
         * 
         * o else faz a brincadeira da recursividade. Explico linha a linha
         */
        if(pos >= (lista.length) ) {
            return lista[pos-1];
        } else {
            char letra = lista[pos]; //para testar as vogais.
            System.out.println("Posição: " + pos + " Letra: " + lista[pos] + "!"); //Só dá um print de teste
            buscaRecursivaVogal(lista, pos+1); //Faz a recursidade com a proxima posição do arquivo.
            if(eVogal(letra)){ //Testa para saber se é vogal.
                System.out.println("Vogal " + letra); 
            }
            return lista[pos]; //retorna a letra que está no momento.
        }
        
    }

    private static boolean eVogal(char letra) { //Varifica se é vogal e incrementa a variavel respectiva da vogal.
        if(letra == 'A'){
            a++;
            return true;
        } else if (letra == 'E'){
            e++;
            return true;
        } else if (letra == 'I'){
            i++;
            return true;
        } else if (letra == 'O'){
            o++;
            return true;
        } else if ( letra == 'U'){
            u++;
            return true;
        } else
            return false;
    }
}
