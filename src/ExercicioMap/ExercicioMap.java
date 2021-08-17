package ExercicioMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {


        Map<String, String> estadosBrasileiros = new HashMap<>();

        estadosBrasileiros.put("Acre", "AC");
        estadosBrasileiros.put("Alagoas", "AL");
        estadosBrasileiros.put("Amapá", "AP");
        estadosBrasileiros.put("Amazonas", "AM");
        estadosBrasileiros.put("Bahia", "BA");
        estadosBrasileiros.put("Ceará", "CE");
        estadosBrasileiros.put("Espírito Santo", "ES");
        estadosBrasileiros.put("Goiás", "GO");
        estadosBrasileiros.put("Maranhão", "MA");
        estadosBrasileiros.put("Mato Grosso", "MT");
        estadosBrasileiros.put("Mato Grosso do Sul", "MS");
        estadosBrasileiros.put("Minas Gerais", "MG");
        estadosBrasileiros.put("Pará", "PA");
        estadosBrasileiros.put("Paraíba", "PB");
        estadosBrasileiros.put("Paraná", "PR");
        estadosBrasileiros.put("Pernambuco", "PE");
        estadosBrasileiros.put("Piauí", "PI");
        estadosBrasileiros.put("Rio de Janeiro", "RJ");
        estadosBrasileiros.put("Rio Grande do Norte", "RN");
        estadosBrasileiros.put("Rio Grande do Sul", "RS");
        estadosBrasileiros.put("Rondônia", "RO");
        estadosBrasileiros.put("Roraima", "RR");
        estadosBrasileiros.put("Santa Catarina", "SC");
        estadosBrasileiros.put("São Paulo", "SP");
        estadosBrasileiros.put("Sergipe", "SE");
        estadosBrasileiros.put("Tocantins", "TO");

        System.out.println(estadosBrasileiros);

        estadosBrasileiros.remove("Minas Gerais", "MG");

        System.out.println(estadosBrasileiros);

        estadosBrasileiros.put("Distrito Federal", "DF");

        int tamanhomapa = estadosBrasileiros.size();

        System.out.println(tamanhomapa);

        estadosBrasileiros.remove("Mato Grosso do Sul");

        System.out.println(estadosBrasileiros);

        boolean temSantaCatarina = estadosBrasileiros.containsValue("SC");

        System.out.println(temSantaCatarina);

        boolean temMaranhao = estadosBrasileiros.containsKey("Maranhão");

        System.out.println(temMaranhao);






    }

}
