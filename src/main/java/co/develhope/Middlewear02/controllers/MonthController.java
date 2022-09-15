package co.develhope.Middlewear02.controllers;

import co.develhope.Middlewear02.entities.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping
    public Month getMonth(HttpServletRequest request){
        Month month = (Month)request.getAttribute("month");
        return month;
    }
}
