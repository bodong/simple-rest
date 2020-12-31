package xyz.pakwo.service;

import java.time.Instant;

import org.springframework.stereotype.Component;

import xyz.pakwo.domain.Result;

@Component
public class TimeService {
	
	public Result generateTime() {
		Instant today = Instant.now();
		Result result = new Result();
		result.setData(today.toString());
		return result;
	}
}
