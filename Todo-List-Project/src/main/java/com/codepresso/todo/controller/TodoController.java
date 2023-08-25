package com.codepresso.todo.controller;

import java.util.List;
import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    //todo TodoService를 활용하기 위해 의존성 주입 코드를 작성하세요
    // final이랑 의존성주입이랑 뭔상관...
    // 의존성주입이랑 클래스생성자는 상관 없나...
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //todo API문서를 확인하여 GET /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @GetMapping
    public List<Todo> getTodoList(){
        return todoService.getTodoList();
    }

    //todo API문서를 확인하여 POST /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @PostMapping
    public ResultDto addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

    //todo API문서를 확인하여 DELETE /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @DeleteMapping
    @RequestMapping(value = "/{id}")
    public ResultDto deleteTodo(@PathVariable("id") String id) {
        todoService.deleteTodo(Integer.parseInt(id));
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

}
