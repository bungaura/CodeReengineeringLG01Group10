package leaky_Encapsulation_Before;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
   
    private List<ToDo> list;

    public ToDoList() {
        list = new ArrayList<>();
    }

    public List<ToDo> getlist() {
    	List<ToDo> copyList = new ArrayList<>(list.size());
        for (ToDo toDo : list) {
            ToDo copyToDo = new ToDo(toDo.getName());
            copyList.add(copyToDo);
        }
        return copyList;
    }

    public ToDo getByName(String name) {
        for (ToDo toDo : list) {
            if(toDo.getName().equals(name)) return toDo;
        }

        return null;
    }

    public void add(ToDo todo) {
        list.add(todo);
    }
    
}

