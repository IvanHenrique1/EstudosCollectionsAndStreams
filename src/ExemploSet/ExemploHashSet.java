package ExemploSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(1.5);
        notasAlunos.add(7.2);
        notasAlunos.add(9.3);
        notasAlunos.add(6.8);
        notasAlunos.add(5.4);
        notasAlunos.add(7.1);
        notasAlunos.add(10.0);

        System.out.println(notasAlunos); //não trás o set na ordem em que foram adicionados

        System.out.println("quantidade de itens no set: " + notasAlunos.size());

        notasAlunos.remove(6.8); //remove a nota do set
        System.out.println("Removendo nota...");
        System.out.println(notasAlunos);

        System.out.println("quantidade de itens no set: " + notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while ((iterator.hasNext())) {
            System.out.println("Nota: " + "\n" + iterator.next());
        }

        for(Double nota: notasAlunos) {
            System.out.println("Nota: " + "\n" + nota);
        }

    }

}
