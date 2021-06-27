package asynctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.service.DbTranManageService;

@RestController
public class DbTranManageController {
	
	@Autowired
	DbTranManageService dbTranManageService;

    @GetMapping("/users/db_tm_select")
    public DbSelectResponse select(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	DbSelectResponse dbSelectResponse = dbTranManageService.select();

        return dbSelectResponse;
    }
    
    @GetMapping("/users/db_tm_insert")
    public DbtestResponse insert(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranManageService.insert(dbtestRequest);

        return dbtestResponse;
    }
}
