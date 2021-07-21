package ExemploList;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Vôlei");
        esportes.add("Skate");


        System.out.println(esportes);


        //Muda o valor
        esportes.set(1, "Basebal");

        //Remove o valor da posição
        esportes.remove(2);

        //Printa apenas o valor da posição desejada
        System.out.println(esportes.get(0));


        System.out.println(esportes);

        //Printa linha por linha dos valores
        for(String esporte: esportes) {
            System.out.println(esporte);
        }

    }

}
