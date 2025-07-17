package jp.spring.boatrace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.Data;

@Data
public class Boat implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//階級List
	private List<String> rank = new ArrayList<>();
	
	private List<String> racers = new ArrayList<>();
	
	private List<String> hoseiA = new ArrayList<>();

	private List<String> moter = new ArrayList<>();

	private List<String> hoseiB = new ArrayList<>();
	
//	順位sort機能
	private Map<Double,Integer> sorted = new TreeMap<>(Collections.reverseOrder());

}
