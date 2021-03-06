package com.fee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fee.bean.Fee;
import com.fee.service.FeeService;

@RestController
public class FeeController {
	@Autowired
	private FeeService feeService;
	
//	http://localhost:8091/fees?id=2
	@RequestMapping(method=RequestMethod.GET,value="/fees",produces={"application/xml"})
	public Fee getFees(@RequestParam(value="id") int idParam){
		System.out.println("getFee");
			return feeService.getFees(idParam);
	}
}
