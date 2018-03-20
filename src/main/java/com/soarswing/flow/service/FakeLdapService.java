package com.soarswing.flow.service;

import java.util.Arrays;
import java.util.List;

public class FakeLdapService {

	public String findManagerForEmployee(String employee) {
		return "Kermit The Frog";
	}
	
	public List<String> findAllSales() {
		return Arrays.asList("kermit", "gonzo", "fozzie"); 
	}
}
