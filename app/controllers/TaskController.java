package controllers;

import models.Task;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class TaskController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public TaskController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    // List all tasks
    public Result listTasks() {
        List<Task> tasks = Task.find.all();
        return ok(views.html.index.render(tasks));
    }

    // Show add task form
    public Result addTask(Http.Request request) {
        return ok(views.html.addTask.render(request));
    }

    // Save a new task
    public Result saveTask(Http.Request request) {
        Form<Task> taskForm = formFactory.form(Task.class).bindFromRequest(request);
        if (taskForm.hasErrors()) {
            return badRequest(views.html.addTask.render(request));
        }
        Task task = taskForm.get();
        task.save();
        return redirect(routes.TaskController.listTasks());
    }

    // Delete a task
    public Result deleteTask(Long id) {
        Task task = Task.find.byId(id);
        if (task != null) {
            task.delete();
        }
        return redirect(routes.TaskController.listTasks());
    }

    // Show edit task form
    public Result editTask(Long id, Http.Request request) {
        Task task = Task.find.byId(id);
        if (task == null) {
            return notFound("Task not found");
        }
        return ok(views.html.editTask.render(task, request));
    }

    // Update an existing task
    public Result updateTask(Http.Request request) {
        Form<Task> taskForm = formFactory.form(Task.class).bindFromRequest(request);

        if (taskForm.hasErrors()) {
            return badRequest("Invalid data");
        }

        Task updatedTask = taskForm.get();
        Task existingTask = Task.find.byId(updatedTask.id);

        if (existingTask != null) {
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setNote(updatedTask.getNote());
            existingTask.setReminder(updatedTask.getReminder());
            existingTask.update();
        }

        return redirect(routes.TaskController.listTasks());
    }

}
