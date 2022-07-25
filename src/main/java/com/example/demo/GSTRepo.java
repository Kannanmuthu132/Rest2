package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface GSTRepo extends JpaRepository<GSTEntity, Integer>{
  
	@Query(value = "Select percentage from gsttable.gsttable where hsn=:hsn" , nativeQuery = true)  
	
    public int  getvalue (@PathVariable("hsn")int hsn);
}
