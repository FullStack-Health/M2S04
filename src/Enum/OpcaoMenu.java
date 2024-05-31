package Enum;

public enum OpcaoMenu {
    CADASTRAR(1),
    LISTAR(2),
    EXCLUIR(3),
    SAIR(4);

    private int codigo;

    OpcaoMenu(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }
}
