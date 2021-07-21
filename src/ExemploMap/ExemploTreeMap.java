package ExemploMap;

import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital do topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na árvore da capital em parâmetro
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima na árvore da capital em parâmetro
        System.out.println(treeCapitais.higherKey("SC"));

        //Retorna a primeira capital no topo da árvore, removendo do map
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a última capital no final da árvore, removendo do map
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getKey());

        System.out.println(treeCapitais);
    }

}
