package dao.impl;

import beans.PrivateTask;
import dao.PrivateTaskDAO;
import dao.exception.DAOException;

import java.util.List;

public class CollectionPrivateTaskDAO implements PrivateTaskDAO{
    private List<PrivateTask> privateTasks;

    @Override
    public void addPrivateTask(PrivateTask privateTask) throws DAOException {
        PrivateTask newPrivateTask = new PrivateTask();
    }
}
