package tasks;

import java.util.Objects;

public class Task {
    private static final String DEFAULT_DESCRIPTION = "Default Task Description";
    private static final String VERSION = "1.0";

    private String description;
    private boolean completed;

    public Task() {
        this.description = DEFAULT_DESCRIPTION;
        this.completed = false;
    }

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return completed == task.completed &&
                Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, completed);
    }

    public static String getVersion() {
        return VERSION;
    }
}
