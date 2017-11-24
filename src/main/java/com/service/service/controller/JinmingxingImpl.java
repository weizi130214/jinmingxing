package com.service.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T02:19:37.269Z")

@RpcSchema(schemaId = "jinmingxing")
public class JinmingxingImpl implements Jinmingxing{

    @Autowired
    private JinmingxingDelegate jinmingxingDelegate;


    public String helloworld(String name) {

        return jinmingxingDelegate.helloworld(name);
    }

}
