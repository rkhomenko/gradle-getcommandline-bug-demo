package org.khomenko.test.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.JavaExec;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

public class TestTask extends DefaultTask {
    @TaskAction
    void run() {
        var log = getLogger();
        log.warn("Task started!");

        TaskContainer tasks = getProject().getTasks();
        JavaExec bootRun = (JavaExec) tasks.findByName("bootRun");
        bootRun.getCommandLine().stream().forEach(l -> log.warn(l));
    }
}
