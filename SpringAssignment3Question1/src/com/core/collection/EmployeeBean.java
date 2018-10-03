package com.core.collection;

import java.util.Map;

import com.mdel.Address;
import com.mdel.Employee;

public class EmployeeBean {

	private Map<Employee, Address> maps;

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(Map<Employee, Address> maps) {
		super();
		this.maps = maps;
	}

	public Map<Employee, Address> getMaps() {
		return maps;
	}

	public void setMaps(Map<Employee, Address> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "EmployeeBean [maps=" + maps + "]";
	}

}
