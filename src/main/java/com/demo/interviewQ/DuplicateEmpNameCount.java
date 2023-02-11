package com.demo.interviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEmpNameCount {

	public static void main(String[] args) {

		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee("saif", 25, 000000));
		listEmp.add(new Employee("saif", 25, 65000));
		listEmp.add(new Employee("test", 20, 28000));
		listEmp.add(new Employee("waseem", 22, 30000));
		listEmp.add(new Employee("waseem", 30, 61000));
		listEmp.add(new Employee("waseem", 23, 33000));
		listEmp.add(new Employee("riz", 35, 47880));

		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;

		System.out.println("Output through Map concept");
		
		for (Employee employee : listEmp) {
			if (map.containsKey(employee.getName())) {
				cnt = map.get(employee.getName());
				cnt++;
				map.replace(employee.getName(), cnt);
			} else {
				map.put(employee.getName(), 1);
			}
		}

		System.out.println("Duplicate Name Count---");

		for (String key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + "  " + "Occured" + " " + map.get(key));
		}

		// through stream api

		System.out.println("Output through stream API concept");
		Map<String, Long> count = listEmp.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

		System.out.println(count);

	}
}
