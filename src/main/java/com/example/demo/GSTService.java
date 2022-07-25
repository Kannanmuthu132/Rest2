package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GSTService {
	@Autowired
	GSTDao gd;
	public String addval(GSTEntity ge) {
		return gd.addval(ge);
	}
	public int getbyhsn(int hsn) {
		return gd.getbyhsn(hsn);
	}

}
