package asynctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbtestResponse;
import asynctest.service.DbTranTempleteService;

@RestController
public class DbTranTempleteController {
	
	@Autowired
	DbTranTempleteService dbTranTempleteService;

    @GetMapping("/users/db_tt_select")
    public DbtestResponse select() throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranTempleteService.select();

        return dbtestResponse;
    }
    
    @GetMapping("/users/db_tt_insert")
    public DbtestResponse insert() throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranTempleteService.insert();

        return dbtestResponse;
    }
}
