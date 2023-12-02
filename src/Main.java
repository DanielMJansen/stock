
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int selecionaItem;

        final ArrayList<String> menu = new ArrayList<String>();
        menu.add("Criar Produto");
        menu.add("Alterar Produto");
        menu.add("Remover Produto");
        menu.add("Sair");

        System.out.println("Selecione uma das opções do menu abaixo: \n");
        try {
            do {
                for (String i : menu) {
                    System.out.println(i);
                }

                //Collections.rotate(menu.subList(menu.size() - 2, menu.size()), -1); Essa parte era um teste para realocar as posições do ArrayList
                System.out.println("Selecione a opção desejada: Entre 1 e " + menu.size());
                System.out.println();
                selecionaItem = Integer.parseInt(sc.nextLine()) - 1;


                System.out.println("Opção de número " + (selecionaItem + 1) + " - " + menu.get(selecionaItem));

                if (menu.get(selecionaItem).equals("Sair")) {
                    System.out.println("Você decidiu sair do menu. Programa encerrado.");
                    System.exit(0);
                }

                if (menu.get(selecionaItem).equals("Criar Produto")) {
                    System.out.println("Qual o item que você deseja adicionar ao menu?");
                    String adicional = sc.nextLine();
                    menu.add(menu.size() - 1, adicional);
                    System.out.println(menu.size());
                }
            } while (menu.get(selecionaItem).startsWith("Sair") == false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}