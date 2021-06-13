package asynctest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import asynctest.dto.DbtestResponse;
import asynctest.service.DbtestService;
import asynctest.service.DemoServ;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoCont {

    @Autowired
    private DemoServ asyncService;

//    @Autowired
//    private DbtestRequest dbtestRequest;
    
    @Autowired
    private DbtestService dbtestService;

    @GetMapping("/users/asy")
    public List<String> findUsers() throws Exception {
        long start = System.currentTimeMillis();
        long heavyProcessTime = 5000L;
        long lightProcessTime = 3000L;

        System.out.println("request started");
        CompletableFuture<String> heavyProcess = asyncService.findName("heavy", heavyProcessTime);
        CompletableFuture<String> lightProcess = asyncService.findName("light", lightProcessTime);

        // heavyProcessが終わったら実行される処理
        heavyProcess.thenAcceptAsync(heavyProcessResult -> {
            System.out.println("finished name=" + heavyProcessResult + ", sleep = " + heavyProcessTime);
        });

        // lightProcessが終わったら実行される処理
        lightProcess.thenAcceptAsync(lightProcessResult -> {
            System.out.println("finished name=" + lightProcessResult + ", sleep = " + lightProcessTime);
        });

        // 指定した処理が終わったらこれ以降の処理が実行される
        CompletableFuture.allOf(heavyProcess, lightProcess).join();

        // 返却値の作成
        List<String> names = new ArrayList<>();
        names.add(heavyProcess.get());
        names.add(lightProcess.get());

        Thread.sleep(10L);

        long end = System.currentTimeMillis();
        // 処理全体の時間を出力
        System.out.println("request finished. time: " + ((end - start))  + "ms");

        return names;
    }
    
    @GetMapping("/users/db")
    public DbtestResponse Dbtest() throws Exception {
//    public DbtestResponse Dbtest(DbtestRequest dbtestRequest) throws Exception {

    	System.out.println("controller");
    	DbtestResponse dbtestResponse = dbtestService.dbTran();

        return dbtestResponse;
    }


}
