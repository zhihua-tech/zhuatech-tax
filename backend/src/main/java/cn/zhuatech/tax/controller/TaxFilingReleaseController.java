/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.controller;

import cn.zhuatech.tax.common.ApiResponse;
import cn.zhuatech.tax.service.TaxFilingReleaseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/tax")
public class TaxFilingReleaseController {
    private final TaxFilingReleaseService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public TaxFilingReleaseController(TaxFilingReleaseService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/filing-release")
    public ApiResponse<TaxFilingReleaseService.Assessment> assess(
            @Valid @RequestBody TaxFilingReleaseService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
