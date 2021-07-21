package ExemploSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna o topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna o último valor da árvore
        System.out.println(treeCapitais.last());

        //Retorna o primeiro valor abaixo da árvore do parâmetro indicado
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna o primeiro valor acima da árvore do parâmetro indicado
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna o primeiro valor da árvore removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna o último valor da árvore removendo do set
        System.out.println(treeCapitais.pollLast());

        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        for (String capital: treeCapitais) {
            System.out.println("----> " + capital);
        }


    }

}
