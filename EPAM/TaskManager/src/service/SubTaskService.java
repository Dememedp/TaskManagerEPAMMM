package service;

import beans.SubTask;
import service.exception.ServiceException;

public interface SubTaskService {
    void addSubTask(SubTask subTask) throws ServiceException;
}
