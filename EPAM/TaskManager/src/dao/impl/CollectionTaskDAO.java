package dao.impl;

import beans.Task;
import dao.TaskDAO;

import java.util.ArrayList;
import java.util.List;

public class CollectionTaskDAO implements TaskDAO{
    private final ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task){
        this.tasks.add(task);
    }

    @Override
    public List<Task> showTasks() {
        return this.tasks;
    }
}
