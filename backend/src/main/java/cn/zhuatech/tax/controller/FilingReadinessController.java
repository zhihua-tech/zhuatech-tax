/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.tax.controller;
import cn.zhuatech.tax.common.ApiResponse;import cn.zhuatech.tax.service.FilingReadinessService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/tax/insights/filing-readiness") public class FilingReadinessController {private final FilingReadinessService service;public FilingReadinessController(FilingReadinessService service){this.service=service;}@PostMapping ApiResponse<FilingReadinessService.Result> evaluate(@Valid @RequestBody FilingReadinessService.Request request){return ApiResponse.ok(service.evaluate(request));}}
