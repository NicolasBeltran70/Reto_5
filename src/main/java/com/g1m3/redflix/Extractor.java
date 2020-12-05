package com.g1m3.redflix;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component

public class Extractor implements ApplicationContextAware {

    private static ApplicationContext context;

    public static <T extends Object> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);

    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        Extractor.context = ac;
    }

}
