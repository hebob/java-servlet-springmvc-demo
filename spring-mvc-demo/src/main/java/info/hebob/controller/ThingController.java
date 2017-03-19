package info.hebob.controller;

import info.hebob.model.Thing;
import info.hebob.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Henkka on 19.3.2017.
 */
@Controller
@RequestMapping("/thing")
public class ThingController {

    @Autowired
    ThingService thingService;

    @RequestMapping(method = RequestMethod.GET)
    public String getThings(ModelMap model) {
        model.addAttribute("things",thingService.getThings());
        model.addAttribute("thingForm", new Thing());
        return "things";
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String addThing(ModelMap model,@ModelAttribute() Thing thing) {
        thingService.addThing(thing);
        return getThings(model);
    }
}
