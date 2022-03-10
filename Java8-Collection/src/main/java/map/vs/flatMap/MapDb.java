package map.vs.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDb {
	
	public List<Customer> getAll(){
		return Stream.of(
				new Customer(100, "a", "a@gmail", Arrays.asList("111111111","111111112")),
				new Customer(101, "b", "b@gmail", Arrays.asList("222222222","222222223")),
				new Customer(102, "c", "c@gmail", Arrays.asList("333333333","333333334")),
				new Customer(103, "d", "d@gmail", Arrays.asList("444444444","444444445"))).collect(Collectors.toList());
				
	}

}
