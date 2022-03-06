package dao.impl;

import beans.Task;
import dao.TaskDAO;

import java.util.ArrayList;

public class CollectionTaskDAO implements TaskDAO{
    private final ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task){
        tasks.add(task);
    }

    @Override
    public ArrayList<Task> showTasks() {
        return tasks;
    }

    @Override
    public void doTask(String name) {
        tasks.remove(findTask(name));
    }

    @Override
    public Task findTask(String name) {
        int i;
        for (i = 0; i < tasks.size(); i++){
            if (tasks.get(i).getName().equals(name)){
                break;
            }
        }
        return tasks.get(i);
    }

}