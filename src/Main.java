public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Paciente();

        Hospital hospital = new Hospital();

        Paciente paciente01 = new Paciente(1, "Lion", 25, 78.5, 1.70);
        Paciente paciente02 = new Paciente(2, "Sergio", 30, 80, 1.80);


        hospital.adicionarUser(paciente01);
        hospital.adicionarUser(paciente02);

        System.out.println(hospital.listarUser());
    }
}
