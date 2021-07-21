package ExemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploListArrayCollectionsIterrator {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
            nomes.add("Humberto");
            nomes.add("Júlio");
            nomes.add("Maria");
            nomes.add("Ivan");
            nomes.add("Fábio");

        System.out.println("Array mãe: " + nomes);


        //Distribuir os nomes de forma aleatória
        Collections.sort(nomes);
        System.out.println("Nomes aleatórios rodando... " + nomes);


        //Trocar um nome por outro
        nomes.set(2, "João");
        System.out.println("Trocando algum nome... " + nomes);


        //Remover um valor pela posição numérica do array
        nomes.remove(1);
        System.out.println("Removendo um valor pela posição numérica do array: " + nomes);


        //Remover um valor do array
        nomes.remove("Humberto");
        System.out.println("Removendo um valor do Array: " + nomes);


        //Pegar um valor específico do array
        String get = nomes.get(1);
        System.out.println("Pegando apenas um valor do Array: " + get);


        //Pegar a posição de um valor
        int posicao = nomes.indexOf("Fábio");
        System.out.println("Pegando a posição específica do nome Fábio:" + posicao);


        //Tamanho do array
        int tamanho = nomes.size();
        System.out.println("Tamanho do array: " + tamanho);


        //Verifica se o nome digitado pertence a lista
        Boolean temNome = nomes.contains("Júlio");
        System.out.println("O nome Júlio existe no Array? " + temNome);


        //Verifica se a lista está vazia
        Boolean listaVazia = nomes.isEmpty();

        if(listaVazia == true) {

            System.out.println("A lista está vazia! ");

        }else {

            System.out.println("A lista não está vazia! ");

        }


        //Laço para retornar todos os itens da lista
        for (String nomeDoItem: nomes) {

            System.out.println("-->" + nomeDoItem);

        }

        //Laço que retorna booleano até os itens da lista acabarem
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {

            System.out.println("---->" + iterator.next());

        }


        //Limpa a lista
        nomes.clear();
        System.out.println("Limpando a lista... " + nomes);

        //Verifica se a lista está vazia
        Boolean listaVazia2 = nomes.isEmpty();

        if(listaVazia2 == true) {

            System.out.println("A lista está vazia! ");

        }else {

            System.out.println("A lista não está vazia! ");

        }
    }

}
