package de.etcomp.adressbuch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdressbuchController {
	
	//URL-Example = http://localhost:8080/hello?vorname=Emanuel&nachname=Tebbe
	@RequestMapping(path="/hello")
	public String sayHello(@RequestParam(value="nachname", defaultValue="Nachname") String nachname,
			@RequestParam(value="vorname", defaultValue="Vorname") String vorname) {
		return String.format("Hallo %s %s", vorname, nachname);
	}

}
