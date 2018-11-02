import javax.swing.JOptionPane;

public class TesteEstagio {
    
    public static void main(String[] args){
        //casos de teste
        imprimeLetra("abcde");
        imprimeLetra("aakkce");
        imprimeLetra("aabcde");
    }
    
    public static void imprimeLetra(String palavra){
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
        int[] quantidades = new int[26];
        for(int i = 0; i < quantidades.length; i++){
            quantidades[i] = 0;
        }
        
        String pMinuscula = palavra.toLowerCase();
        for(int i = 0; i < pMinuscula.length(); i++){
            for(int j = 0; j < letras.length; j++){
                if(pMinuscula.charAt(i) == letras[j]){
                    quantidades[j]++;
                }
            }    
        }
        
        int contador = 0;
        char resposta = ' ';
        for(int k = 0; k < quantidades.length; k++){
            if(quantidades[k] == 2){
                resposta = letras[k];
                contador ++;
            }
        }
        if(contador == 1){
            JOptionPane.showMessageDialog(null,resposta);
        }else{
            JOptionPane.showMessageDialog(null,"--");
        }
    }
}
