package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.CardService;

@Controller
public class WikiController {

	private CardService service;

	public void setService(CardService service) {
		this.service = service;
	}

	public WikiController() {
		
		// TODO Auto-generated constructor stub

	}

}// end class
