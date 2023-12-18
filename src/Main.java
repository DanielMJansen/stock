
import java.util.*;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            int selecionaItem;

        /**
         * Array criado como um menu de console inicial do sistema.
         */
        final ArrayList<String> menu = new ArrayList<String>();
            menu.add("Criar Produto");
            menu.add("Alterar Produto");
            menu.add("Remover Produto");
            menu.add("Sair");


        /**
         * solicitação para o usuário de qual a opção do menu do console o mesmo deseja acessar
         */
        System.out.println("Selecione uma das opções do menu abaixo: \n");
            try {
                do {
                    /**
                     * Esse for percorrerá cada item dentro do array do menu e imprimirá na tela do usuário as opções que o mesmo tem de acesso.
                     */
                    for (String i : menu) {
                        System.out.println(i);
                    }

                    System.out.println("Selecione a opção desejada: Entre 1 e " + menu.size());
                    System.out.println();
                    selecionaItem = Integer.parseInt(sc.nextLine()) - 1;


                    System.out.println("Opção de número " + (selecionaItem + 1) + " - " + menu.get(selecionaItem));

                    /**
                     * Validação de se o usuário acessou a última opção do Menu, que será sempre a opção "Sair", a qual encerra a execução do sistema.
                     */
                    if (menu.get(selecionaItem).equals("Sair")) {
                        System.out.println("Você decidiu sair do menu. Programa encerrado.");
                        System.exit(0);
                    }

                    /**
                     * validação de se a opção selecionada pelo usuário foi a primeira, que será sempre a opção "Criar Produto", a qual adiciona um novo item ao menu do console na posição anterior a última.
                     */
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