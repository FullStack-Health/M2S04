public class Medico extends Pessoa implements CalculoSalario{
    private double salario;
    private String crm;

    public Medico() {}

    public Medico(Integer id, String nome, Integer idade, double salario, String crm) {
        super(id, nome, idade);
        this.salario = salario;
        this.crm = crm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    //Implementação do método abstrato
    @Override
    public void metodoAbstrato() {

    }

    @Override
    public double calcularINSS() {
        return 0;
    }

    @Override
    public double calcularSalarioLiquido() {
        return 0;
    }

    @Override
    public String toString() {
        return "Medico{" +
                super.toString() +
                ", salario=" + salario +
                ", crm='" + crm + '\'' +
                '}';
    }
}
