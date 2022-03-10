package comparator.ss.it.beans;

import java.util.ArrayList;
import java.util.List;

public class ITDao {

	public List<IT> getIt() {
		List<IT> it = new ArrayList<IT>();
		it.add(new IT(102,"Net"));
		it.add(new IT(104,"RWS"));
		it.add(new IT(101,"Java"));
		it.add(new IT(103,"UI"));
		it.add(new IT(105,"SAP"));
		return it;
	}

}
