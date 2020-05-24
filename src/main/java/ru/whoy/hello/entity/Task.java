package ru.whoy.hello.entity;

import java.time.LocalDate;

public class Task {

    private String name;
    private String description;
    private Resource owner;

    private LocalDate startDate;
    private LocalDate endDate;

    private int hours;

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Resource getOwner() {
        return owner;
    }

    public void setOwner(Resource owner) {
        this.owner = owner;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static class TaskBuilder {
        private Task task;

        public TaskBuilder() {
            task = new Task();
        }

        public TaskBuilder setName(String name) {
            task.name = name;
            return this;
        }

        public TaskBuilder setDescription(String description) {
            task.description = description;
            return this;
        }

        public TaskBuilder setOwner(Resource owner) {
            task.owner = owner;
            return this;
        }

        public TaskBuilder setStartDate(LocalDate startDate) {
            task.startDate = startDate;
            return this;
        }

        public TaskBuilder setEndDate(LocalDate endDate) {
            task.endDate = endDate;
            return this;
        }

        public TaskBuilder setHours(int hours) {
            task.hours = hours;
            return this;
        }

        public Task build() {
            return task;
        }

    }
}
