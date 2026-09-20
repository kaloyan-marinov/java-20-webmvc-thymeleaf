package com.github.tutorial_about_java_20;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
[This class] handles GET requests for `/greeting` by returning the name of a `View`
[- look for the HTML file with whose name matches the return value.]
*/
@Controller
public class GreetingController {

    /*
    [This] annotation ensures that
    HTTP GET requests to `/greeting` are mapped to the `greeting()` method.
    (
    There are companion annotations for other HTTP verbs (e.g. `@PostMapping` for POST).
    There is also a `@RequestMapping` annotation that
    they all derive from,
    and can serve as a synonym (e.g. `@RequestMapping(method=GET)`).
    )

    The implementation of the method body relies on a view technology (in this case, Thymeleaf)
    to perform server-side rendering of the HTML.
    */
    @GetMapping("/greeting")
    public String greeting(
        /*
        [This annotation] binds the value of the query string parameter `name`
        into the `name` parameter of the ... method.
        */
        @RequestParam(name="name", required=false, defaultValue="World")
        String name,
        Model model
    ) {
        // [The next statement is responsible for]
        // ultimately making [the value of the `name` parameter] accessible to the view template.
        model.addAttribute("name", name);
        // Thymeleaf parses the [HTML] template (whose name matches the return value)
        // and
        // evaluates the `th:text` expression to render the value of the `${name}` parameter that was set in the preceding statement.
        return "greeting";
    }
    
}
