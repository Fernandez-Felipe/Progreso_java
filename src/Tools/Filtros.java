package Tools;

import java.util.ArrayList;

public class Filtros {

    public static ArrayList<String> ContainsWord(ArrayList<String> words, String element){

        ArrayList<String> filtro = new ArrayList<>();

        words.stream().filter(word -> word.contains(element)).forEach(word -> filtro.add(word));

        return filtro;
    }

    public static int[] div(int num[], int filtro){

        int n = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i]%filtro == 0){
               n++;
            }
        }
        int n1 = n;
        int num_Filt[] = new int[n1];

        n = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i]%filtro == 0){
               num_Filt[n] = num[i];
               ++n;
            }
        }

        return num_Filt;
    }

}
