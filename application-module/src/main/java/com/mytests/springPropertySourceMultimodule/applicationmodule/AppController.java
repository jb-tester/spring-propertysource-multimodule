package com.mytests.springPropertySourceMultimodule.applicationmodule;

import com.mytests.springPropertySourceMultimodule.ModelBean;
import com.mytests.springPropertySourceMultimodule.MyConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final MyConfigProperties myConfigProperties;
    private final ModelBean modelBean;

    public AppController(MyConfigProperties myConfigProperties, ModelBean modelBean) {
        this.myConfigProperties = myConfigProperties;
        this.modelBean = modelBean;
    }

    @GetMapping("/")
    public String home() {
        String rez1 = "properties: {" + myConfigProperties.getProp1() + ", " + myConfigProperties.getProp2() + ", " + myConfigProperties.getProp3() + "}";
        String rez2 = "\n" + modelBean.toString();
        return rez1 + rez2;
    }
}
