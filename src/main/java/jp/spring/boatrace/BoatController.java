package jp.spring.boatrace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("boat")
public class BoatController {
	
	@ModelAttribute("boat")
	public Boat boat() {
		return new Boat();
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/add")
	public String add(Boat boat,String racer,String ha,String moter,String hb) {
		boat.getRacers().add(racer);
		boat.getHoseiA().add(ha);
		boat.getMoter().add(moter);
		boat.getHoseiB().add(hb);
		
		
		for(int i=0;i< boat.getRacers().size();i++) {
			System.out.println(boat.getHoseiA().get(i));
		}
		return "redirect:/";
	}
	
	@GetMapping("/clear")
	public String clear(SessionStatus sessions) {
		sessions.setComplete();
		return "redirect:/session";
	}

}
