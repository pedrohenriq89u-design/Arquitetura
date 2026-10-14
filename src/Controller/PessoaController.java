package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {

    private static PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    public void cadastrar(){
        pessoaService.cadastrarPessoa("Sergio Herval","serginhobatera@gmail.com");
        pessoaService.cadastrarPessoa("Cleberson","clebs@gmail.com");
        pessoaService.cadastrarPessoa("Nando","nandinho@gmail.com");
        pessoaService.cadastrarPessoa("Kiko","kikinho@gmail.com");
        pessoaService.cadastrarPessoa("Ricardo","ricardinho@gmail.com");
        pessoaService.cadastrarPessoa("Paulinho","paulinho@gmail.com");

    }
    public List<?> mostrar(){
        return pessoaService.listarPessoa();
    }
    public void deletar(int id){
        pessoaService.deletarPessoa(id);
    }
    public void atualizar(int id, String nome){
        pessoaService.atualizarPessoa(id, nome);
    }
}
