package cn.iocoder.yudao.module.knowledge.controller.app;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

/**
 * @ClassName AppKnowledgeController
 * @Author mengke
 * @create 2022/5/18 00:32
 * @Description
 */
@Api(tags = "用户 App - 知识付费")
@RestController
@RequestMapping("/knowledge/test")
@Validated
public class AppKnowledgeController {

    @GetMapping("/get")
    @ApiOperation("获取 test 信息")
    public CommonResult<String> get() {
        return success("true");
    }
}
