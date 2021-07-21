package ExemploQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        for (String cliente: filaBanco) {
            System.out.println("--> " + cliente);
        }

        //Retorna o primeiro item da lista, se a fila estiver vazia, retorna null
        String atendimentoAoCliente = filaBanco.poll();
        System.out.println(atendimentoAoCliente);
        System.out.println(filaBanco);


        //Retorna mas não remove o primeiro item da lista, se a fila estiver vazia, retorna null
        String atendimentoAoCliente2 = filaBanco.peek();
        System.out.println(atendimentoAoCliente2);
        System.out.println(filaBanco);


        //Igual ao peek, porém se a fila estiver vazia retorna exceção
        String atendimentoAoCliente3 = filaBanco.element();
        System.out.println(atendimentoAoCliente3);
        System.out.println(filaBanco);

    }

}
