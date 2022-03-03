package view;

import service.exception.ServiceException;

import java.io.IOException;

public interface View {
  View show() throws IOException, ServiceException;
}