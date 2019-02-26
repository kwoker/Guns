package cn.stylefeng.guns.modular.smartele.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vector
 * @date: 2019/2/26 0026 18:23
 */
@RestController
@RequestMapping("/app")
@Api(tags = "移动端接口")
public class AppController {

    @ApiOperation(value = "接口测试", notes = "接口测试note")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "这是测试";
    }
}
