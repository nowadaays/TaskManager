public class Task {
    private String name;
    private String description;
    private boolean isComplete;

    public Task(String name, String description, boolean isComplete) {
        this.name = name;
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markAsComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return "Task" + " name = " + '\'' + " , complete = " + isComplete + '}';
    }
}
