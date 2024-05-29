public class Paciente extends Pessoa{
    private double peso;
    private double altura;

    //Construtor vazio
    public Paciente(){
    }

    //Construtor parametrizado
    public Paciente(Integer id, String nome, Integer idade, double peso, double altura) {
        super(id, nome, idade);//Utilizando do construtor parametrizado da superclasse
        if (peso > 0 && peso < 300) {
            this.peso = peso;
        }
        if (altura > 0 && altura < 4) {
            this.altura = altura;
        }
    }

    //Métodos Getters

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //Métodos Setters
    public void setPeso(double peso) {
        if (peso > 0 && peso < 300) {
            this.peso = peso;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura < 4) {
            this.altura = altura;
        }
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public double calcularIMC(double peso, double altura){
        return peso / (altura * altura);
    }

    //Implementação do método abstrato
    @Override
    public void metodoAbstrato() {

    }

    @Override
    public String toString() {
        return "Paciente{" +
                super.toString() +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
