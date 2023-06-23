package Tools;

import java.util.ArrayList;

public class orden {


    public int[] Mayor_Menor(int [] num){

        for(int i = 0; i < num.length; i++){
            for(int e = 0; e < num.length-1; e++){
                if(num[e] < num[e+1]) {
                    int cont;
                    cont = num[e];
                    num[e] = num[e+1];
                    num[e+1] = cont;
                }
            }
        }
        return num;
    }

    public int[] Menor_Mayor(int[] num){

        for(int i = 0; i < num.length; i++){
            for(int e = 0; e < num.length-1; e++){
                if(num[e] > num[e+1]) {
                    int cont;
                    cont = num[e];
                    num[e] = num[e+1];
                    num[e+1] = cont;
                }
            }
        }

        return num;
    }

}
