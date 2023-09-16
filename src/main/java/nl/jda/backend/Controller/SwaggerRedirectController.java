package nl.jda.backend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class SwaggerRedirectController {
    @RequestMapping(value = {"/", "/api-docs"})
    public RedirectView redirect(){
        return new RedirectView("/swagger-ui.html");
    }
}
