package com.example.samples;

import com.example.samples.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("properties-testnowire")
@RestController
public class TestControllerWithoutAutowire {

    @Value("${test.dir}")
    private String testProperty;

    @GetMapping("/{dirName}")
    public String getDir(@PathVariable String dirName){

        PropertiesUtil propertiesUtil= new PropertiesUtil();
        propertiesUtil.setName(String.format(testProperty, dirName));

        return propertiesUtil.getName();
    }
}
