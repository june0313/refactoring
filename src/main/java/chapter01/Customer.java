package chapter01;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Wayne on 2016. 8. 23..
 *
 */
public class Customer {
	private String name;
	private List<Rental> rentals = Lists.newArrayList();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}
}
