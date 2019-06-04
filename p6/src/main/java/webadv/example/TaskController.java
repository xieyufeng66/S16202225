package webadv.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import webadv.example.rest.Task;

@RestController
public class TaskController {
	  private List<String> tasks = Arrays.asList("HTML��ȫ�ơ�Hyper Text Markup Language�����ı�������ԣ���������˵����ҳ������HTML���������ġ�HTML��һ�����������ԣ���һ�ŷǳ��������ŵ����ԡ�", 
			  "TypeScript��΢����������JavaScript��һ�����������ɺͿ�Դ�ı�����ԡ�����������У�����˿�ѡ�ľ�̬���ͺͻ��������������̡�����ͼ˵��typeScript��JavaScript�Ĺ�ϵ��", 
			  "PWA(Progressive Web Apps)�ɹȸ��������ǰ�صļ�������������ҳʹ����ͬApp��������һϵ�з�������ȷ��һ����ǣ�PWA����һ����ҳ, ����ͨ��ǰ�صļ���������һ����ҳӦ�á�");
       @GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
       
      
}
      
 