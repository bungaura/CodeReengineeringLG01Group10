
import java.util.ArrayList;
import java.util.List;

public class Employee {
	
    private String name;
    private List<Employee> subordinates;

    public Employee(String name) {
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
    
    public void traverseHierarchy(int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("  "); // Two spaces per level
        }
        
        System.out.println(indentation + getName());
        
        for (Employee subordinate : subordinates) {
            subordinate.traverseHierarchy(level + 1);
        }
    }
}

