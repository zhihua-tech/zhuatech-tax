/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.tax;
import cn.zhuatech.tax.service.FilingReadinessService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class FilingReadinessServiceTests {private final FilingReadinessService service=new FilingReadinessService();
 @Test void blocksIncompleteNearDeadlineFiling(){var r=service.evaluate(new FilingReadinessService.Request(false,80,4,2,2,2,false));assertEquals("BLOCK",r.status());assertEquals(2,r.missingSchedules());}
 @Test void marksCompleteFilingReady(){var r=service.evaluate(new FilingReadinessService.Request(true,100,4,4,0,10,true));assertEquals("READY",r.status());assertEquals(100,r.readinessScore());}}
