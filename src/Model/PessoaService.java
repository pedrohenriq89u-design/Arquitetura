package Model;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    private static int id = 1;
    List<Pessoa> banco = new ArrayList<>();

    public void cadastrarPessoa(String nome, String email){
     Pessoa pessoa = new Pessoa(id++, nome, email);
     banco.add(pessoa);
    }
    public List<Pessoa> listarPessoa(){
        return banco;
    }
    public void deletarPessoa(int id){
        for (Pessoa p : banco){
            if (p.getId() == id){
                banco.remove(p);
                IO.println("Pessoa excluida com sucesso!");
                break;
            }
        }
    }
    public void atualizarPessoa(int id, String nome){
        for (Pessoa p : banco){
            if (p.getId() == id){
                p.setNome(nome);
                IO.println("Pessoa atualizada com sucesso! "+p);
                break;
            }
        }
    }
    public Pessoa buscarpessoa(int id){
        for (Pessoa p : banco){
            if (p.getId() == id){
               return p;
            }
        } return null;
    }
}
