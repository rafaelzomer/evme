package app;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ExampleController {
    public String mensagem = "inici";
    public void criar() {
//        this.mensagem = "zomer"+new Date();
        setMensagem("zoemr");
        System.out.println("log");
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
