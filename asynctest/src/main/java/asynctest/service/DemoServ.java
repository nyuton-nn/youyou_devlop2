package asynctest.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoServ {

	@Async("Thread2")
	public CompletableFuture<String> findName(String name, Long sleepTime) throws InterruptedException {
		System.out.println("Async function started. processName: " + name + "sleepTime: " + sleepTime);
		Thread.sleep(sleepTime);

		// 非同期処理のハンドリングができるようにCompletableFutureに実際に使いたい返却値をぶっこんで利用する
		return CompletableFuture.completedFuture(name);
	}

}
