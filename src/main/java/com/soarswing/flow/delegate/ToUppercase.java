package com.soarswing.flow.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class ToUppercase implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		String var = (String) execution.getVariable("input");
		var = var.toUpperCase();
		execution.setVariable("input", var);

	}

}
