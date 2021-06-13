package asynctest;

import java.util.concurrent.Executor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@SpringBootApplication
@EnableAsync
//@MapperScan("asynctest.repository")
public class AsyncTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncTrainingApplication.class, args);
	}


//    @Bean("Thread1") // ���̐ݒ�͎w�肵�Ă��Ȃ��̂ŗ��p����Ă��Ȃ�
//    public Executor taskExecutor1() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(20);
//        executor.setThreadNamePrefix("Thread1--");
//        executor.initialize();
//        return executor;
//    }
//
//    @Bean("Thread2") // �����Őݒ肵��"Thread2"����Async�ɐݒ肷��Ƃ��̐ݒ肪���p�����
//    public Executor taskExecutor2() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(5); // �f�t�H���g��Thread�̃T�C�Y�B���ӂ���QueueCapacity�̃T�C�Y�܂ŃL���[�C���O����
//        executor.setQueueCapacity(1); // �҂��̃L���[�̃T�C�Y�B���ӂ���MaxPoolSize�܂�Thread�𑝂₷
//        executor.setMaxPoolSize(500); // �ǂ��܂�Thread�𑝂₷���̐ݒ�B���̒l���炠�ӂ��Ƃ��̏����̓��W�F�N�g�����Exception����������
//        executor.setThreadNamePrefix("Thread2--");
//        executor.initialize();
//        return executor;
//    }

    @Bean("Reject") // ���̐ݒ�ɂ���ƃL���[�C���O�ł��Ȃ���Thread�����₹�Ȃ�����RejectedExecutionException����������
    public Executor rejectTaskExecuter() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(1);
        executor.setQueueCapacity(0);
        executor.setMaxPoolSize(1);
        executor.setThreadNamePrefix("Reject--");
        executor.initialize();
        return executor;
    }

}
