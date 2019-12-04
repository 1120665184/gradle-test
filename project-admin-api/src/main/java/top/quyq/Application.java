/*
 * Email:        quyongquan@qq.com
 * FileName:     Application
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.quyq.common.Constants;

/**
 * @author Quyq
 * 启动项
 **/
@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println(Constants.State.STATE_LOCK);
    }
}
