package it.petete.dev.demo.async.process.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Metrics;
import it.petete.dev.demo.async.process.api.SyncAsyncApi;
import it.petete.dev.demo.async.process.model.EntityDto;
import it.petete.dev.demo.async.process.services.BusinessLogicService;

@RestController
@Timed
public class SyncAsyncApiComponent implements SyncAsyncApi {
    
    @Autowired
    BusinessLogicService businessLogicService;
    
    @Override
    @Timed(value = "http.rest.request.get.entity.by.code.async", longTask = true)
    public ResponseEntity<?> getEntityByCodeAsync(final String code, @RequestHeader(value = "X-CORRELATION-ID", required = false) final String X_CORRELATION_ID) {
	 Metrics
	     .counter("http.rest.request.get.entity.by.code.async.count")
	     .increment(1);
	 final long startTime = System.currentTimeMillis();
	 ResponseEntity<?> ret = null;
	 this.businessLogicService.asyncMethodWithVoidReturnType(code);
	 final long endTime = System.currentTimeMillis();
	 final long totalTime = endTime - startTime;
	 
	 final EntityDto entityDto = new EntityDto();
	 ret = new ResponseEntity<>(entityDto, HttpStatus.OK);
	 entityDto.setBody("Execution time : " + totalTime);
	 
	 return ret;
    }
    
    @Override
    @Timed(value = "http.rest.request.get.entity.by.code.sync", longTask = true)
    public ResponseEntity<?> getEntityByCodeSync(final String code, @RequestHeader(value = "X-CORRELATION-ID", required = false) final String X_CORRELATION_ID) {
	 Metrics
	     .counter("http.rest.request.get.entity.by.code.sync.count")
	     .increment(1);
	 
	 final long startTime = System.currentTimeMillis();
	 ResponseEntity<?> ret = null;
	 this.businessLogicService.syncMethodWithVoidReturnType(code);
	 final long endTime = System.currentTimeMillis();
	 final long totalTime = endTime - startTime;
	 
	 final EntityDto entityDto = new EntityDto();
	 ret = new ResponseEntity<>(entityDto, HttpStatus.OK);
	 entityDto.setBody("Execution time : " + totalTime);
	 
	 return ret;
    }
    
}
