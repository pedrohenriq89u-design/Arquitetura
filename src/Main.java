import Controller.PessoaController;
import Model.PessoaService;

void main(){
    PessoaService service = new PessoaService();
    PessoaController controller = new PessoaController(service);
    controller.cadastrar();
    IO.println(controller.mostrar());
    controller.atualizar(1,"Serginho");
    IO.println(controller.mostrar());
    controller.deletar(6);
    IO.println(controller.mostrar());
}
