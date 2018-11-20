package com.example;

import jodd.bean.BeanUtil;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ExampleBeanTest {

    @Test
    public void beanUtilTest() {

        ExampleBean example = new ExampleBean();
        Map<String, String> map = new LinkedHashMap<>();
        map.put("defaultMixed", "Hello World");
        map.put("uRL", "http://example.com");
        map.forEach((key, value) -> BeanUtil.silent.setProperty(example, key, value));

        assertEquals("Hello World", example.getDefaultMixed());
        assertEquals("http://example.com", example.getURL());

    }
}