package com.soarswing.flow.delegate;

import org.flowable.engine.common.api.delegate.Expression;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class ReverseStringFieldInjected implements JavaDelegate {

	private Expression text1;
	
	private Expression text2;
	
	@Override
	public void execute(DelegateExecution execution) {
		String value1 = (String)text1.getValue(execution);
		execution.setVariable("var1", new StringBuffer(value1).reverse().toString());
		
		String value2 = (String) text2.getValue(execution);
		execution.setVariable("var2", new StringBuffer(value2).reverse().toString());
	}

}
