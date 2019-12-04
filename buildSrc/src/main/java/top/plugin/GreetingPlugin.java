/*
 * Email:        quyongquan@qq.com
 * FileName:     GreetingPlugin
 * CreationDate: 2019/12/4
 * Author:       渠永泉
 */
package top.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author Quyq
 * 测试插件
 **/

public class GreetingPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {

        target.getTasks().create("printTimeNow",GreetTask.class,(task) -> {
            task.setFormat("yyyy-mm-dd hh:MM:ss");
        });
    }
}
