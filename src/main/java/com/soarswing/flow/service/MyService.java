package com.soarswing.flow.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soarswing.flow.model.Person;
import com.soarswing.flow.repository.PersonRepository;

@Service
@Transactional
public class MyService {

	@Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;
    
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void startProcess(String assignee) {
    	Person person = personRepository.findByUsername(assignee);
    	Map<String, Object> variables = new HashMap<String, Object>();
    	variables.put("person", person);
        runtimeService.startProcessInstanceByKey("oneTaskProcess", variables);
    }

    @Transactional
    public List<Task> getTasks(String assignee) {
        return taskService.createTaskQuery().taskAssignee(assignee).list();
    }
    
    public void createDemoUsers() {
    	if(personRepository.findAll().size()==0) {
    		personRepository.save(new Person("jbarrez", "Joram", "Barrez", new Date()));
    		personRepository.save(new Person("temi", "Tom", "Andrew", new Date()));
    	}
    }
}
