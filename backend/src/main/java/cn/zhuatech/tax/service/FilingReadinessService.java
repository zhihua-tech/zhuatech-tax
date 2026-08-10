/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.tax.service;
import jakarta.validation.constraints.*;import org.springframework.stereotype.Service;import java.util.*;
@Service public class FilingReadinessService {
 public Result evaluate(Request r){int score=100;List<String> gaps=new ArrayList<>();if(!r.ledgerReconciled()){score-=25;gaps.add("完成税务台账与总账核对");}if(r.invoiceMatchRate()<98){score-=20;gaps.add("处理发票匹配差异");}int scheduleGap=Math.max(0,r.requiredSchedules()-r.completedSchedules());score-=Math.min(30,scheduleGap*10);if(scheduleGap>0)gaps.add("补齐 "+scheduleGap+" 份申报附表");score-=Math.min(30,r.unresolvedRisks()*10);if(r.unresolvedRisks()>0)gaps.add("关闭未决税务风险事项");if(!r.paymentFunded()){score-=20;gaps.add("落实应缴税款资金安排");}score=Math.max(0,score);String status=(r.daysUntilDeadline()<=3&&score<90)||score<60?"BLOCK":score<90?"REMEDIATE":"READY";if(gaps.isEmpty())gaps.add("申报资料和资金准备完备");return new Result(score,status,scheduleGap,gaps);}
 public record Request(@NotNull Boolean ledgerReconciled,@DecimalMin("0") @DecimalMax("100") double invoiceMatchRate,@Min(0) int requiredSchedules,@Min(0) int completedSchedules,@Min(0) int unresolvedRisks,@Min(0) int daysUntilDeadline,@NotNull Boolean paymentFunded){}
 public record Result(int readinessScore,String status,int missingSchedules,List<String> gaps){}
}
