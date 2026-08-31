/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.controller;

import cn.zhuatech.tax.common.ApiResponse;
import cn.zhuatech.tax.service.TaxFilingReleaseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enterprise/tax")
public class TaxFilingReleaseController {
    private final TaxFilingReleaseService service;
    public TaxFilingReleaseController(TaxFilingReleaseService service) { this.service = service; }
    @PostMapping("/filing-release")
    public ApiResponse<TaxFilingReleaseService.Assessment> assess(
            @Valid @RequestBody TaxFilingReleaseService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
