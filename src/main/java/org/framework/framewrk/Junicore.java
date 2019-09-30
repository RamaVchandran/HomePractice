package org.framework.framewrk;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Junicore extends BaseClass {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(Searchhotel.class,Selecthotel.class,Book.class,Orderid.class);
		rs.getFailureCount();
		rs.getRunCount();
		rs.getIgnoreCount();
		rs.getRunTime();
		List<Failure> f = rs.getFailures();
		for (Failure fr : f) {
		System.out.println(fr);
			
		}
	}

}
