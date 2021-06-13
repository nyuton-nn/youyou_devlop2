package asynctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbtestResponse;
import asynctest.service.DbTranManageService;

@RestController
public class DbTranManageController {
	
	@Autowired
	DbTranManageService dbTranManageService;

    @GetMapping("/users/db_tm_select")
    public DbtestResponse select() throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranManageService.select();

        return dbtestResponse;
    }
    
    @GetMapping("/users/db_tm_insert")
    public DbtestResponse insert() throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranManageService.insert();

        return dbtestResponse;
    }
}
