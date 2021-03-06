package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import com.cts.ba2.model.Project;

public interface IProject {
	
	public void addProject(Project project);

	public List<Project> listOfProject();

	public String updateProject(Long id, Project project);

	public String deleteProject(Long id);

}
