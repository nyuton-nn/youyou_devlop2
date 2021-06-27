package asynctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.service.DbTranTempleteService;

@RestController
public class DbTranTempleteController {
	
	@Autowired
	DbTranTempleteService dbTranTempleteService;

    @GetMapping("/users/db_tt_select")
    public DbSelectResponse select(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	DbSelectResponse dbSelectResponse = dbTranTempleteService.select();

        return dbSelectResponse;
    }
    
    @GetMapping("/users/db_tt_insert")
    public DbtestResponse insert(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbTranTempleteService.insert(dbtestRequest);

        return dbtestResponse;
    }
}
