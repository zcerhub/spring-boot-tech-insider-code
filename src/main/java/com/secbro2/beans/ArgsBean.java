package com.secbro2.beans;


import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ArgsBean {

    @Resource
    private ApplicationArguments arguments;

    public void printArgs() {
        System.out.println("# 非选型参数数量："+arguments.getNonOptionArgs().size());
        System.out.println("# 选型参数数量："+arguments.getNonOptionArgs().size());
        System.out.println("# 非选择参数具体参数：");
        arguments.getNonOptionArgs().forEach(System.out::println);

        System.out.println("# 选型参数具体参数：");
        arguments.getOptionNames().forEach(optionName->{
            System.out.println("--"+optionName+"="+arguments.getOptionValues(optionName));
        });
    }


}
