package com.vscode.project.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@SessionAttributes("name")
public class TodoController {

    
    private TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> todos = todoService.findByUsername("anil");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
    

    @RequestMapping(value="add-todo",method=RequestMethod.GET)
    public String showNewTodopage(ModelMap model){
        String username = (String)model.get("name");
        Todo todo = new Todo(0,username,"Default Desc",LocalDate.now().plusYears(1),false);
        model.put("todo",todo);
        return "todo";
    }
    

    @RequestMapping(value="add-todo",method=RequestMethod.POST)
    public String addNewTodo(ModelMap model,@Valid Todo todo,BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        String username = (String)model.get("name");
        todoService.addTodo(username,todo.getDescription(),LocalDate.now(),false);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id){
        
        todoService.deleteById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value="update-todo",method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id,ModelMap model){
        Todo todo = todoService.findById(id);
        model.addAttribute("todo",todo);
        return "todo";
    }

    @RequestMapping(value="update-todo",method=RequestMethod.POST)
    public String updateTodo(ModelMap model,@Valid Todo todo,BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        String username = (String)model.get("name");
        todo.setUsername(username);
        todoService.updatTodo(todo);
        return "redirect:list-todos";
    }
}
