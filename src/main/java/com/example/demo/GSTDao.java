package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GSTDao {
	@Autowired
	GSTRepo gr;
	
	public String addval(GSTEntity ge) {
		gr.save(ge);
		return "File Save";
	}
	public int getbyhsn(int hsn) {
		return gr.getvalue(hsn);
	}

}
