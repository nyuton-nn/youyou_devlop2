package asynctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.service.DbTranService;

@RestController
public class DbTranController {
	
	@Autowired
	DbTranService dbTranService;

	@CrossOrigin
	@PostMapping("/users/db_select")
    public  DbSelectResponse select(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	System.out.println(dbtestRequest);
    	
    	DbSelectResponse dbSelectResponse = dbTranService.select(dbtestRequest);

        return dbSelectResponse;
    }
    
	@CrossOrigin
	@PostMapping("/users/db_insert")
    public DbtestResponse insert(@RequestBody DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	System.out.println(dbtestRequest);
    	DbtestResponse dbtestResponse = dbTranService.insert(dbtestRequest);

        return dbtestResponse;
    }
}
