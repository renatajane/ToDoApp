package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.util.List;
import model.Project;
import model.Task;

public class App {

    public static void main(String[] args) {
       
       ProjectController projectController = new ProjectController();
       
//       Project project = new Project();
//       project.setName ("Projeto teste");
//       project.setDescription ("description");
//       projectController.save(project);
       
//       Project project = new Project();        
//       projectController.removeById(1);
       
//       project.setName("Novo nome do projeto"); 
//       project.setDescription("LALLAA");
//       project.setId(1);
//       projectController.update(project);

        
      TaskController taskController = new TaskController();

         Task task = new Task();
         task.setName("Tarefas do dia");
         taskController.update(task);
         
         
        
       List <Project> projects = projectController.getAll();
       System.out.println("Total de projetos = " + projects.size());



       
    }
}
