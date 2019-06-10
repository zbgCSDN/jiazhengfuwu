package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.service.IProductService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping("/ProduceController")

public class ProduceController {
    @Autowired
    private IProductService productService;

    @GetMapping
    @ApiOperation("查询所有产品")
    public Message findALLPro() {
        List<Product> list = productService.findALLPro();
        return MessageUtil.
                success("sucess", list);
    }
}
