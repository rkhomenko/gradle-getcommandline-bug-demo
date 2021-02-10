package org.khomenko.test.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import javax.annotation.Nonnull;

public class TestPlugin implements Plugin<Project> {
    @Override
    public void apply(@Nonnull Project project) {
        project.getLogger().warn("It's work!");
    }
}
