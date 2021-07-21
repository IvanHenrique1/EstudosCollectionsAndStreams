package ExemploStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Jairo");
        estudantes.add("Guilherme");
        estudantes.add("Larissa");
        estudantes.add("Airton");
        estudantes.add("Carol");
        estudantes.add("Ana");

        //COUNT
        //Retorna a contagem de elementos da Stream
        System.out.println("Existem " + estudantes.stream().count() + " estudantes cadastrados!");



        //MAX
        //Retorna o elemento com maior número de letras (Compara todos da lista)
        System.out.println("Maior nome da lista: " + estudantes.stream().max(Comparator.comparingInt(String::length)));



        //MIN
        //Retorna o elemento com menor número de letras (Compara todos da lista)
        System.out.println("Menor nome da lista: " + estudantes.stream().min(Comparator.comparingInt(String::length)));



        //FILTER
        //Retorna os elementos que tem a leta R no nome
        System.out.println("Estudantes com a letra a em seu nome: " + estudantes.stream().filter(estudante -> estudante.toLowerCase().contains("a")).collect(Collectors.toList()));



        //MAP
        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letras em cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));



        //LIMIT
        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("3 primeiros nomes: " + estudantes.stream().limit(3).collect(Collectors.toList()));



        //PEEK
        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Elementos da coleção: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));



        //FOREACH
        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retornando os elementos forEach...");
        estudantes.stream().forEach(System.out::println);



        //ALLMATCH
        //Retorna true se TODOS os elementos tiverem a letra a
        System.out.println("Todos os elementos tem a letra a? " + estudantes.stream().allMatch(elemento -> elemento.contains("A")));



        //ANYMATCH
        //Retorna true se algum dos elementos possue a letra a
        System.out.println("Tem algum elemento com a letra a no nome? " + estudantes.stream().anyMatch((elemento -> elemento.contains("a"))));



        //NONEMATCH
        //Retorna true se nenhum elemento possue a letra y
        System.out.println("Tem algum elemento com a letra y no nome? " + estudantes.stream().noneMatch((elemento -> elemento.contains("y"))));



        //FINDFIRST
        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);




        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante ->
                estudante.toLowerCase().contains("r")))
        .collect(Collectors.toList()));

      //.collect(Collectors.joining(", ")));
      //.collect(Collectors.toSet()));
      //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));



    }

}
