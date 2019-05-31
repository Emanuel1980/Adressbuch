package de.etcomp.adressbuch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdressbuchController {
	
	@RequestMapping(path="/hello")
	public String sayHello() {
		return "Hello";
	}

}
