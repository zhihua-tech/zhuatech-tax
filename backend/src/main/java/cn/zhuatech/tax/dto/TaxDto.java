/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.tax.dto;
import jakarta.validation.constraints.*; import java.time.*; import java.util.List;
public final class TaxDto { private TaxDto(){}
    public record Metric(String label,String value,String hint,String tone){}
    public record TaxFilingView(Long id,String orderNo,String productCode,String productName,String taxEntity,String workshop,int plannedQty,int completedQty,int defectQty,LocalDate dueDate,String status,String batchNo,int progress){}
    public record ControlView(String code,String name,String taxEntity,String status,int oee,LocalDateTime lastHeartbeat){}
    public record TaxRiskView(String taxRiskNo,String orderNo,String productName,String taxRiskType,int taxRiskQty,int defectQty,String result,String inspector){}
    public record Dashboard(List<Metric> metrics,List<TaxFilingView> taxFilings,List<ControlView> taxRule,List<TaxRiskView> taxRisks){}
    public record ReportRequest(@NotBlank String operationName,@Positive int goodQty,@PositiveOrZero int defectQty,@Size(max=200) String remark){}
    public record ReportResult(String orderNo,int completedQty,int defectQty,int progress,String status){}
}
