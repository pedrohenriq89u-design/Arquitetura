package Controller;

import Model.TarefaService;

import java.util.List;

public class TarefaController {
    private static TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }
    public void Cadastrar(){
        tarefaService.cadastrarTarefa(1,"Bateria","Ele deve tocar bateria");
        tarefaService.cadastrarTarefa(2,"Piano","Ele deve tocar Piano");
        tarefaService.cadastrarTarefa(3,"Baixo","Ele deve tocar baixo");
        tarefaService.cadastrarTarefa(4,"Guitarra","Ele deve tocar Guitarra");
        tarefaService.cadastrarTarefa(5,"Teclado","Ele deve tocar Teclado");
        tarefaService.cadastrarTarefa(6,"Cantar" ,"Ele deve Cantar");
    }
    public List<?> mostrar(){
        return tarefaService.listarTarefa();
    }
    public void deletar(String nometarefa){
        tarefaService.deletarTarefa(nometarefa);
    }
    public void atualizar(int id, String nome){
        tarefaService.atualizarTarefa(id, nome);
    }
}
