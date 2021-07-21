package ExemploMap;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Adiciona valores
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);

        //Retorna um valor
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe ou não
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Remove
        campeoesMundiaisFifa.remove("França");

        //Retorna se existe ou não
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Retorna se existe uma seleção x vezes campeã
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println(campeoesMundiaisFifa);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Navega nos registros do mapa
        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
        }

        System.out.println(campeoesMundiaisFifa);

        //Retorna se existe ou não
        System.out.println("Os EUA tem copa? " + campeoesMundiaisFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contém o valor 5
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //Limpa o map
        campeoesMundiaisFifa.clear();
        System.out.println(campeoesMundiaisFifa.size());
        System.out.println(campeoesMundiaisFifa);

    }

}
