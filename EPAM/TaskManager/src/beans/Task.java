package beans;

public class Task {
    private String taskName;
    private String taskDate;
    private String taskNote;
    private String taskCreator;

    public String getName(){
        return taskName;
    }

    public String getTaskDate(){
        return taskDate;
    }

    public String getTaskNote(){
        return taskNote;
    }

    public String getTaskCreator(){
        return taskCreator;
    }

    @Override
    public String toString(){
        return "Task name: " + taskName + ", Date: " + taskDate + ", Note: " + taskNote + ", Creator: " + taskCreator;
    }

    @Override
    public boolean equals(Object task){
        if (task == this){
            return true;
        }
        if (task == null || task.getClass() != this.getClass()) {
            return false;
        }
        return taskName.equals(((Task) task).taskName)
                && taskDate == ((Task) task).taskDate
                && taskNote.equals(((Task) task).taskNote)
                && taskCreator.equals(((Task) task).taskCreator);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
        result = prime * result + ((taskDate == null) ? 0 : taskDate.hashCode());
        result = prime * result + ((taskNote == null) ? 0 : taskNote.hashCode());
        result = prime * result + ((taskCreator == null) ? 0 : taskCreator.hashCode());
        return result;
    }

    public Task(String name, String date, String note, String creator){
        this.taskName = name;
        this.taskDate = date;
        this.taskNote = note;
        this.taskCreator = creator;
    }
}
