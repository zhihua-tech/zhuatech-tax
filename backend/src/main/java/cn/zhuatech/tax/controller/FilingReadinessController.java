/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.controller;
import cn.zhuatech.tax.common.ApiResponse;import cn.zhuatech.tax.service.FilingReadinessService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/tax/insights/filing-readiness") public class FilingReadinessController {private final FilingReadinessService service;/**
                                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                            */
public FilingReadinessController(FilingReadinessService service){this.service=service;}/**
                                                                                                                                                                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                   */
@PostMapping ApiResponse<FilingReadinessService.Result> evaluate(@Valid @RequestBody FilingReadinessService.Request request){return ApiResponse.ok(service.evaluate(request));}}
