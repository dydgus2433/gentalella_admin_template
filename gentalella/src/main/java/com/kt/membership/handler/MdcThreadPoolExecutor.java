package com.kt.membership.handler;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

import org.slf4j.MDC;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
@Component
public class MdcThreadPoolExecutor extends ThreadPoolTaskExecutor{
	
	
	private Map<String, String> fixedContext;
	
	public MdcThreadPoolExecutor() {
		super();
	}
	
	private Map<String, String> getContextForTask(){
		return fixedContext;
	}
	
	public void setContextForTask(Map<String, String> fixedContext) {
		this.fixedContext = fixedContext;
	}
	
	@Override
	public <T> Future<T> submit(Callable<T> task) {
		ExecutorService executor = getThreadPoolExecutor();
		try {
			return executor.submit(wrap(task, getContextForTask()));
		} catch (RejectedExecutionException e) {
			// TODO: handle exception
		}
		
		return super.submit(task);
	}

	private static <T> Callable<T> wrap(final Callable<T> task, final Map<String, String> context) {
		// TODO Auto-generated method stub
		return new Callable<T>() {

			@Override
			public T call() throws Exception {
				Map<String , String> previous = MDC.getCopyOfContextMap();
				
				T ret = null;
				
				if(context == null) {
					MDC.clear();
				}else {
					MDC.setContextMap(context);
				}
				
				try {
					ret = task.call();
				} finally {
					if ( previous == null) {
						MDC.clear();
					}else {
						MDC.setContextMap(previous);
					}
				}
				return ret;
			}
			
		
		};
	}
}
