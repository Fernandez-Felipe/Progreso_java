import Tools.Filtros;

import java.util.ArrayList;

public class FiltroDeStrings {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<String>();

        Filtros filtro = new Filtros();

        palabras.add("Belgica");
        palabras.add("Brademburgo");
        palabras.add("Peru");

        ArrayList<String> words = filtro.ContainsWord(palabras, "burgo");

        words.stream().forEach(word -> System.out.println(word));

    }
}