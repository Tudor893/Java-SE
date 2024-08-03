package eu.deic.fp.fi_processing_streams;

import java.util.ArrayList;
import java.util.List;

public class ProgMainStreams {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();
		places.add("Romania - Bucharest");
		places.add("France - Paris");
		places.add("France - Nice");
		places.add("UK - London");
		
		places.stream()
		.filter(s -> s.startsWith("France")) //Predicate
		.map(p -> p.toUpperCase()) //Function
		.sorted()
		.forEach(p -> System.out.println(p)); //Consumer
	}

}
