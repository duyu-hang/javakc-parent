package com.javakc.pms.dispord.controller;

import com.javakc.commonutils.api.APICODE;
import com.javakc.pms.dispord.entity.DispOrd;
import com.javakc.pms.dispord.service.DispOrdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "调度指令库管理")
@RestController
@RequestMapping("/pms/dispord")
public class DispOrdController {

    @Autowired
    private DispOrdService dispOrdService;

    @ApiOperation(value = "查询所有指令库")
    @GetMapping
    public APICODE findAll() {
        return APICODE.OK().data("items",dispOrdService.findAll());
    }

}