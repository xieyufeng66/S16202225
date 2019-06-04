package webadv.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import webadv.example.rest.Task;

@RestController
public class TaskController {
	  private List<String> tasks = Arrays.asList("HTML，全称“Hyper Text Markup Language（超文本标记语言）”，简单来说，网页就是用HTML语言制作的。HTML是一门描述性语言，是一门非常容易入门的语言。", 
			  "TypeScript由微软开发。它是JavaScript的一个超集，自由和开源的编程语言。在这个语言中，添加了可选的静态类型和基于类的面向对象编程。由下图说明typeScript和JavaScript的关系！", 
			  "PWA(Progressive Web Apps)由谷歌提出，用前沿的技术开发，让网页使用如同App般的体验的一系列方案。明确的一点就是：PWA就是一个网页, 可以通过前沿的技术开发出一个网页应用。");
       @GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
       
      
}
      
 