package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
	private CarServiceImpl carservice;

	public CarController(CarServiceImpl carservice) {
		this.carservice = carservice;
	}


	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(value = "count" , defaultValue = "5") int count,ModelMap model ) {
		model.addAttribute("car", carservice.from(count));
		return "cars";
	}
	
}