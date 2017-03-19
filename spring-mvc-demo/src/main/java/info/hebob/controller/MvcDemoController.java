package info.hebob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Henkka on 19.3.2017.
 */
@Controller
@RequestMapping("/demo")
public class MvcDemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String demo(ModelMap model, @RequestParam(name = "name") String name) {
        model.put("message", String.format("Hello, %s", name));
        return "demo";
    }
}
