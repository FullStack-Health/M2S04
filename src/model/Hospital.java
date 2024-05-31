package model;

import interfaces.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class Hospital implements UserRepository {

    private Map<Integer, Pessoa> pacientes;

    public Hospital(){
        pacientes = new HashMap<>();
    }

    @Override
    public void adicionarUser(Pessoa pessoa){
        if(pessoa != null && !pacientes.containsKey(pessoa.getNome())){
            pacientes.put(pessoa.getId(), pessoa); //Armazenar o dado no Map
        }else{
            throw new RuntimeException("Key{"+ pessoa.getNome() +"} já se encontra armazenada no Map.");
        }
    }

    @Override
    public Pessoa buscarUser(String nome) {
        return pacientes.get(nome);
    }

    @Override
    public String listarUser(){
        String relatorio = "";
        for(Pessoa pessoa : pacientes.values()){
            relatorio += pessoa.toString() + "\n";
        }
        //return String.format("%s", relatorio);
        return relatorio;
    }

    @Override
    public void excluirUser(Integer key){
        pacientes.remove(key);
    }

}
