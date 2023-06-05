package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAnalyzer {

    public static void main(String[] args) {
        // Sample employee table
        List<Map<String, String>> employeeTable = new ArrayList<>();

        // Employee 1
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Name", "John");
        employee1.put("Age", "30");
        employee1.put("Department", "Sales");
        employeeTable.add(employee1);

        // Employee 2
        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Name", "Alice");
        employee2.put("Age", "25");
        employee2.put("Department", "Marketing");
        employeeTable.add(employee2);

        // Find differences between Employee 1 and Employee 2
        List<String> differences = new ArrayList<>();

        for (String key : employee1.keySet()) {
            if (!employee1.get(key).equals(employee2.get(key))) {
                differences.add(key);
            }
        }

        // Print differences
        if (differences.isEmpty()) {
            System.out.println("No differences found between the employees.");
        } else {
            System.out.println("differences = " + differences);
        }
    }
}
