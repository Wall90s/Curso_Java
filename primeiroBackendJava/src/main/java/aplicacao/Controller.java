package aplicacao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/ola-mundo", method = RequestMethod.GET)
    public String dizOlaMundo(){
        return "Olá, mundo!";
    }

    @RequestMapping(path = "/soma", method = RequestMethod.GET)
    public  int somaDoisNumeros(@RequestParam int num1, @RequestParam int num2){
        return num1 + num2;
    }

}
