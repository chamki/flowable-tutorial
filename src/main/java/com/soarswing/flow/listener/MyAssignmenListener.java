package com.soarswing.flow.listener;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

public class MyAssignmenListener implements TaskListener {

	private static final long serialVersionUID = -7509340768311373399L;

	@Override
	public void notify(DelegateTask delegateTask) {
		// Execute custom identity lookups here

	    // and then for example call following methods:
	    delegateTask.setAssignee("kermit");
	    delegateTask.addCandidateUser("fozzie");
	    delegateTask.addCandidateGroup("management");
		
	}

}
