package model;

import interfaces.CalculoSalario;

public class Medico extends Pessoa implements CalculoSalario {
    private double salario;
    private String crm;

    public Medico() {}

    public Medico(Integer id, String nome, Integer idade, double salario, String crm) {
        super(id, nome, idade);
        if(salario > 0){
            this.salario = salario;
        }else{
            throw new RuntimeException("Salario não corresponde a um valor > 0");
        }
        if(crm.length() == 6){
            this.crm = crm;
        }else {
            throw new RuntimeException("CRM não corresponde ao tamanho de digitos validos!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }else{
            throw new RuntimeException("Salario não corresponde a um valor > 0");
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if(crm.length() == 6){
            this.crm = crm;
        }else{
            throw new RuntimeException("CRM não corresponde ao tamanho de digitos validos!");
        }
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
        return "model.Medico{" +
                super.toString() +
                ", salario=" + salario +
                ", crm='" + crm + '\'' +
                '}';
    }
}
