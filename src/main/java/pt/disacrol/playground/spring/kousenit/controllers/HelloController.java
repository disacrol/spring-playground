package pt.disacrol.playground.spring.kousenit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring uses the MVC paradigm used for years in Java world.
 * A {@link Controller} is a class that receives HTTP requests and returns HTTP responses.
 *
 * Instead of returning HTTP responses to the client, the response can instead be forwarded to a certain destination.
 * For that example we'll be using a template engine called Thymeleaf.
 */
@RestController
public class HelloController {
}
