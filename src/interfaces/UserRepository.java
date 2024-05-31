package interfaces;

import model.Pessoa;

public interface UserRepository {

    void adicionarUser(Pessoa pessoa);
    Pessoa buscarUser(String nome);
    String listarUser();
    void excluirUser(Integer key);
}
