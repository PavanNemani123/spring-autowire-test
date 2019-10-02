package com.example.samples;

import com.example.samples.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("properties-test")
@RestController
public class TestControllerWithAutowire {

    @Autowired
    private PropertiesUtil propertiesUtil;

    @GetMapping("/{dirName}")
    public String getDir(@PathVariable String dirName){

        propertiesUtil.setName(String.format(propertiesUtil.getName(), dirName));

        return propertiesUtil.getName();
    }
}
