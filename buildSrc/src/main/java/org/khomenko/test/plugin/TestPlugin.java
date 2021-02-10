package org.khomenko.test.plugin;


import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.TaskContainer;

import javax.annotation.Nonnull;

public class TestPlugin implements Plugin<Project> {
    @Override
    public void apply(@Nonnull Project project) {
        project.getLogger().warn("It's work!");

        TaskContainer tasks = project.getTasks();
        Task task = tasks.create("test-task", TestTask.class);
    }
}
