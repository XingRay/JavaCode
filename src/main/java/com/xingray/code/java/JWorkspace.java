package com.xingray.code.java;

import java.util.List;

public class JWorkspace {
    private List<com.xingray.code.java.JProject> projects;

    public List<com.xingray.code.java.JProject> getProjects() {
        return projects;
    }

    public void setProjects(List<JProject> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JWorkspace{" +
                "projects=" + projects +
                '}';
    }
}
