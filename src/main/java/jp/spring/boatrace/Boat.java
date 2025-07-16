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
	
	private List<String> racers = new ArrayList<>();
	
	private List<String> hoseiA = new ArrayList<>();

	private List<String> moter = new ArrayList<>();

	private List<String> hoseiB = new ArrayList<>();
	
	//順位
//	private List<Integer> number = new ArrayList<>();
//	//並び替え用
//	private List<Double> result = new ArrayList<>();
////	並び替え後の順位
//	private List<Integer> sortedNumber = new ArrayList<>();
	
//	Map試し
	private Map<Double,Integer> sorted = new TreeMap<>(Collections.reverseOrder());

}
