package com.soarswing.flow.service;

import java.util.List;
import java.util.Map;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProcessService {

	@Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;
    
    @Transactional
    public void startProcess(String assignee, 
    		String processInstanceKey, 
    		Map<String, Object> variables) {
    	runtimeService.startProcessInstanceByKey(processInstanceKey, variables);
    	
    }
    
    @Transactional
    public List<Task> getTask(String assignee) {
    	return taskService.createTaskQuery().taskAssignee(assignee).list();
    	
    }
}
