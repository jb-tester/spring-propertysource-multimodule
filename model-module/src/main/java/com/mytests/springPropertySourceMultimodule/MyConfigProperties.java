package com.mytests.springPropertySourceMultimodule;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my-model")
public class MyConfigProperties {

    String prop1;
    String prop2;
    String prop3;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }
}
