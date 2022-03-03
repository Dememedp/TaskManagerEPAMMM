package service;

import beans.PrivateTask;
import service.exception.ServiceException;

public interface PrivateTaskService {
    void addPrivateTask(PrivateTask privateTask) throws ServiceException;
}
