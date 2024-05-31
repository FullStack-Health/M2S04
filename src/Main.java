import java.util.Scanner;
import Enum.OpcaoMenu;
import model.*;

public class Main {

    private static OpcaoMenu menu = null;
    private static Scanner scan = new Scanner(System.in);
    private static Hospital hospital = new Hospital();
    private static int cont = 0;

    public static void main(String[] args) {
        do {

            System.out.print(
                            "1 - CADASTRAR\n" +
                            "2 - LISTAR\n" +
                            "3 - EXCLUIR\n" +
                            "4 - SAIR\n" +
                            "-> "
            );
            int opcao = Integer.parseInt(scan.nextLine());

            menu = OpcaoMenu.values()[opcao - 1];

            switch (menu){
                case CADASTRAR:

                    System.out.print("Nome do Paciente: ");
                    String nome = scan.nextLine();
                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(scan.nextLine());
                    System.out.print("Peso: ");
                    double peso = scan.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scan.nextDouble();

                    scan.nextLine();

                    Paciente paciente = new Paciente(cont++, nome, idade, peso, altura);

                    hospital.adicionarUser(paciente);

                    break;
                case LISTAR:
                    System.out.println("Lista de Usuários Cadastrados\n" +
                            hospital.listarUser());
                    break;
                case EXCLUIR:
                    System.out.println("Lista de Usuários Cadastrados\n" +
                            hospital.listarUser());

                    System.out.print("Digite o ID do paciente que deseja EXCLUIR: ");
                    Integer key = scan.nextInt();
                    scan.nextLine();
                    hospital.excluirUser(key);
                    break;
                case SAIR:
                    System.out.println("Bye : )");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(menu != OpcaoMenu.SAIR);
    }
}
