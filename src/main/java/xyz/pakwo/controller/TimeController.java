package xyz.pakwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.pakwo.domain.Result;
import xyz.pakwo.service.TimeService;

@RestController
public class TimeController {

	@Autowired
	private TimeService timeService;
	
	@RequestMapping("/api/v1/times")
	@GetMapping
	public ResponseEntity<Result> time() {
		Result result = timeService.generateTime();
		ResponseEntity<Result> response = new ResponseEntity<Result>(result, HttpStatus.OK);
		return response;
	}
}
