package Model;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private static int id = 1;
    List<Tarefa> banco = new ArrayList<>();
    PessoaService pessoa = new PessoaService();

    public void cadastrarTarefa(int responsavel, String nometarefa, String descricao){
        Tarefa tarefa = new Tarefa(id++, pessoa.buscarpessoa(responsavel),nometarefa,descricao);
        banco.add(tarefa);
    }
    public List<Tarefa> listarTarefa(){
        return banco;
    }
    public void deletarTarefa(int id){
        for (Tarefa p : banco){
            if (p.getId() == id){
                banco.remove(p);
                IO.println("Tarefa excluida com sucesso!");
                break;
            }
        }
    }
    public void atualizarTarefa(int id, Pessoa responsavel, String nometarefa, String descricao){
        for (Tarefa p : banco){
            if (p.getId() == id){
                p.setNome(nometarefa);
                IO.println("Tarefa atualizada com sucesso! "+p);
                break;
            }
        }
    }
}
