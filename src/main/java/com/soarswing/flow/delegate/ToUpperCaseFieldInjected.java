package com.soarswing.flow.delegate;

import org.flowable.engine.common.api.delegate.Expression;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class ToUpperCaseFieldInjected implements JavaDelegate {
	
	private Expression text;

	@Override
	public void execute(DelegateExecution execution) {
		execution.setVariable("var", ((String)text.getValue(execution)).toUpperCase());
	}

}
