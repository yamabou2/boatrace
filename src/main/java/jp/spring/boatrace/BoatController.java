package jp.spring.boatrace;

import java.util.Comparator;

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
	public String index(Boat boat) {
		//確認用
//		System.out.println(boat.getResult().get(0));
		return "index";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute Boat boat) {//,String racers,String ha,String moter,String hb) {
//ArrayListが多重配列になっていたため変更
//		boat.getRacers().add(racers);
//		boat.getHoseiA().add(ha);
//		boat.getMoter().add(moter);
//		boat.getHoseiB().add(hb);
		for(int i=1;i<=6;i++) {
			boat.getNumber().add(i);
		}
//		確認用
//		for(int i=0;i< boat.getRacers().size();i++) {
//			System.out.println(boat.getRacers().get(i));
//		}
		
		//期待値計算
		//P=(1-ha-hb)*0.53+ha*racer+hb*moter
		if(1<=boat.getRacers().size()) {
		for(int i=0;i<boat.getRacers().size();i++) {
			if(i==0) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(0))*0.53);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(0))-Double.parseDouble(boat.getHoseiB().get(0)))*0.53
						+Double.parseDouble(boat.getHoseiA().get(0))*Double.parseDouble(boat.getRacers().get(0))
						+Double.parseDouble(boat.getHoseiB().get(0))*Double.parseDouble(boat.getMoter().get(0))
						);
			}else if(i==1) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(1))*0.16);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(1))-Double.parseDouble(boat.getHoseiB().get(1)))*0.16
						+Double.parseDouble(boat.getHoseiA().get(1))*Double.parseDouble(boat.getRacers().get(1))
						+Double.parseDouble(boat.getHoseiB().get(1))*Double.parseDouble(boat.getMoter().get(1))
						);
			}else if(i==2) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(2))*0.13);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(2))-Double.parseDouble(boat.getHoseiB().get(2)))*0.13
						+Double.parseDouble(boat.getHoseiA().get(2))*Double.parseDouble(boat.getRacers().get(2))
						+Double.parseDouble(boat.getHoseiB().get(2))*Double.parseDouble(boat.getMoter().get(2))
						);
			}else if(i==3) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(3))*0.10);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(3))-Double.parseDouble(boat.getHoseiB().get(3)))*0.10
						+Double.parseDouble(boat.getHoseiA().get(3))*Double.parseDouble(boat.getRacers().get(3))
						+Double.parseDouble(boat.getHoseiB().get(3))*Double.parseDouble(boat.getMoter().get(3))
						);
			}else if(i==4) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(4))*0.05);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(4))-Double.parseDouble(boat.getHoseiB().get(4)))*0.05
						+Double.parseDouble(boat.getHoseiA().get(4))*Double.parseDouble(boat.getRacers().get(4))
						+Double.parseDouble(boat.getHoseiB().get(4))*Double.parseDouble(boat.getMoter().get(4))
						);
			}else if(i==5) {
//				boat.getResult().add(Double.parseDouble(boat.getRacers().get(5))*0.01);
				boat.getResult().add(
						(1-Double.parseDouble(boat.getHoseiA().get(5))-Double.parseDouble(boat.getHoseiB().get(5)))*0.01
						+Double.parseDouble(boat.getHoseiA().get(5))*Double.parseDouble(boat.getRacers().get(5))
						+Double.parseDouble(boat.getHoseiB().get(5))*Double.parseDouble(boat.getMoter().get(5))
						);
			}
		}
		boat.getResult().sort(Comparator.reverseOrder());
		}
		return "redirect:/";
	}
	
	@GetMapping("/clear")
	public String clear(SessionStatus sessions) {
		sessions.setComplete();
		return "redirect:/";
	}

}
