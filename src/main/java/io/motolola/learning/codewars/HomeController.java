package io.motolola.learning.codewars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * This will only display a message on home screen
 */
@Controller
public class HomeController
{
    @GetMapping("/")
    @ResponseBody
    public String hello()
    {
        return "<h1>Welcome to my Codewars stuff!</h1>";
    }
}
