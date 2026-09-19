/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.service;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Service
public class TaxFilingReleaseService {
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public Assessment assess(Request request) {
        List<String> blockers = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        if (!request.periodLocked()) blockers.add("申报期间尚未锁定");
        if (!request.ledgerReconciled()) blockers.add("税务台账未完成对账");
        if (!request.invoicesMatched()) blockers.add("进销项发票未完成匹配");
        if (!request.relatedPartyReviewed()) blockers.add("关联交易未完成税务复核");
        if (!request.taxReviewApproved()) blockers.add("税务复核尚未批准");
        if (request.deadlinePassed() && !request.deadlineExceptionApproved()) blockers.add("申报已逾期且无批准的例外");
        if (!blockers.isEmpty()) {
            actions.add("阻断申报发布并完成税务控制整改");
            return new Assessment(Decision.BLOCKED, blockers, actions);
        }
        if (!request.paymentFundsReady() || !request.electronicSignatureReady()) {
            if (!request.paymentFundsReady()) actions.add("确认缴税资金和支付授权");
            if (!request.electronicSignatureReady()) actions.add("完成电子签章与申报身份校验");
            return new Assessment(Decision.REVIEW, blockers, actions);
        }
        actions.add("批准申报发布并归档报表、回执和缴税凭证");
        return new Assessment(Decision.FILE, blockers, actions);
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public record Request(@NotBlank String filingId, boolean periodLocked, boolean ledgerReconciled,
                          boolean invoicesMatched, boolean relatedPartyReviewed, boolean taxReviewApproved,
                          boolean paymentFundsReady, boolean electronicSignatureReady, boolean deadlinePassed,
                          boolean deadlineExceptionApproved) {}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public record Assessment(Decision decision, List<String> blockers, List<String> actions) {}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public enum Decision { FILE, REVIEW, BLOCKED }
}
