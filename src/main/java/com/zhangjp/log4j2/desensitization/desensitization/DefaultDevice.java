package com.zhangjp.log4j2.desensitization.desensitization;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 创建时间 2019年四月04日 星期四 10:45
 * 作者: zhangjp
 * 描述：默认脱敏器
 */
@Component
public class DefaultDevice implements DesensitizationStrategy {

    @Override
    public String produceCipherText(String plaintext) {
        return "******";
    }

    @PostConstruct
    @Override
    public void addDeviceToMap() {
        DEVICE_METHOD_MAP.put("default", this);
    }
}
