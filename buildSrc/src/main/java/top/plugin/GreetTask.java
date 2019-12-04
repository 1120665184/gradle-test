/*
 * Email:        quyongquan@qq.com
 * FileName:     GreetTask
 * CreationDate: 2019/12/4
 * Author:       渠永泉
 */
package top.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Quyq
 * task任务
 **/

public class GreetTask extends DefaultTask {
    private String format ;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @TaskAction
    void run(){
        System.out.println(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern(format))
        );
    }
}
