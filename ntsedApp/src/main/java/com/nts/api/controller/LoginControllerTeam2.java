package com.nts.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControllerTeam2 {
@GetMapping("test")
public String textview() {
	return"login2";
}


}
