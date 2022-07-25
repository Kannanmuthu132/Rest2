package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GSTController {
	@Autowired
	GSTService gs;
	
	@PostMapping(value = "/add2") 
	public String addval(@RequestBody GSTEntity ge) {
		return gs.addval(ge);
	}
	 
	@GetMapping(value = "/getByHsn/{hsn}")
	public int getbyhsn(@PathVariable int hsn) {
		return gs.getbyhsn(hsn);
	}

}
