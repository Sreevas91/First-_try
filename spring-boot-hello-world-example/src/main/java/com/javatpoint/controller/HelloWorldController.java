package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;


@Controller
public class HelloWorldController 
{
@RequestMapping("/login")
@ResponseBody
public String hello() 
{
return "Hello javaTpoint";
}
}
