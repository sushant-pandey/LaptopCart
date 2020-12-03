package testdao;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.LaptopDao;
import model.Laptop;

public class FetchAllLaptops {

	@Test
	public void test() {
		LaptopDao dao = new LaptopDao();
		List<Laptop> list =dao.fetchAllLaptops();
		for(Laptop laptop : list) {
			System.out.println(laptop);
		}
	}

}
