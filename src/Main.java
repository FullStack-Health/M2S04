import java.util.Scanner;

import Enum.OpcaoMenu;

public class Main {

    private static OpcaoMenu op = null;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println(
                    "1 - CADASTRAR\n" +
                            "2 - LISTAR\n" +
                            "3 - EXCLUIR\n" +
                            "4 - SAIR\n" +
                            "->"
            );
            int opcao = scan.nextInt();

            op = OpcaoMenu.values()[opcao - 1];

            switch (op){
                case CADASTRAR:
                    break;
                case LISTAR:
                    break;
                case EXCLUIR:
                    break;
                case SAIR:
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente.");
            }
        }while(op != OpcaoMenu.SAIR);


    }
}
