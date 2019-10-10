package it.petete.dev.demo.async.process.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogicService {
    
    private static final Logger log = LoggerFactory.getLogger(BusinessLogicService.class);
    
    @Async
    public void asyncMethodWithVoidReturnType(final String code) {
	 BusinessLogicService.log.info("Execute method asynchronously. " + Thread.currentThread().getName());
	 BusinessLogicService.log.info("Calling business logic method. " + Thread.currentThread().getName());
	 this.longRunningTask(code);
    }
    
    public void syncMethodWithVoidReturnType(final String code) {
	 BusinessLogicService.log.info("Execute method synchronously. " + Thread.currentThread().getName());
	 BusinessLogicService.log.info("Calling business logic method. " + Thread.currentThread().getName());
	 this.longRunningTask(code);
    }

    private void longRunningTask(final String code) {
	 final long startTime = System.currentTimeMillis();
	 BusinessLogicService.log.info("**** BUSINESS LOGIC START - Input : {} ****", code);
	 
	 final int repeatTot = 5;
	 int count = 1;

	 do {
	     try {
		  BusinessLogicService.log.info("**** BUSINESS LOGIC: {}/{} ****", count, repeatTot);
		  Thread.sleep(1000);
	     } catch (final InterruptedException e) {
		  e.printStackTrace();
	     } finally {
		  count++;
	     }
	     
	 } while (count <= repeatTot);

	 final long endTime = System.currentTimeMillis();
	 BusinessLogicService.log.info("**** BUSINESS LOGIC END in {} ms ****", endTime - startTime);
    }
    
}
