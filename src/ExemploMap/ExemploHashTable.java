package ExemploMap;

import java.util.Hashtable;

public class ExemploHashTable {

    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Sandra", 19);
        estudantes.put("Taylor", 28);
        estudantes.put("Erik", 39);

        System.out.println(estudantes);

        //Remove
        estudantes.remove("Erik");

        //Recupera um estudante no segundo índice
        int idade = estudantes.get("Carlos");

        System.out.println(idade);
    }

}
