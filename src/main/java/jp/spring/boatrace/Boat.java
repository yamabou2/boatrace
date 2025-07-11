package jp.spring.boatrace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Boat implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<String> racers = new ArrayList<>();
	
	private List<String> hoseiA = new ArrayList<>();

	private List<String> moter = new ArrayList<>();

	private List<String> hoseiB = new ArrayList<>();

}
