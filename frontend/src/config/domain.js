/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
export const domain={
 code:'TAX',systemName:'企业税务管理系统',englishName:'ENTERPRISE TAX MANAGEMENT',
 theme:{primary:'#315f91',dark:'#1d3855',accent:'#bb6b4a'},
 workspace:'税务中心 / 纳税主体运营',fieldWorkspace:'上海运营主体',period:'2026-08-01 · 周六',liveText:'税务规则数据链路正常',
 fieldContextLabel:'当前纳税主体',fieldContext:'日班 · 08:30—17:30',fieldUser:'陆承',fieldRole:'税务会计',adminUser:'周妍',adminRole:'纳税主体主管',
 adminTitle:'纳税主体运营驾驶舱',adminBreadcrumb:'纳税主体运营 / 今日态势',adminSubtitle:'集中查看申报登记、申报、复核、税务规则与时限风险。',exportAction:'导出申报日报',createAction:'新建申报任务',
 chartTitle:'申报完成趋势',chartSubtitle:'当日累计完成率 / 计划目标',chartLabels:['08:30','09:30','10:30','11:30','13:30','14:30','15:30','16:30','17:30'],loadTitle:'纳税主体负荷',loadSubtitle:'进行中申报占可用能力',recordsTitle:'进行中申报',recordsSubtitle:'按承诺时限与异常优先显示',issueTitle:'申报与税务风险',issueSubtitle:'需要纳税主体主管处理的事项',
 recordName:'申报任务',itemName:'税种 / 项目',unitName:'纳税主体',batchName:'税种批次',planName:'计划项目',doneName:'已完成',exceptionName:'异常',unitLabel:'项',
 listBreadcrumb:'申报管理 / 任务台账',listSubtitle:'统一管理申报登记、任务分派、申报、复核与台账归档。',listSummary:[['本期申报任务','16'],['进行中申报','11'],['待复核','8'],['超时风险','2',true]],tabs:['全部','待确认','申报中','待复核','已完成'],
 fieldBreadcrumb:'申报执行 / 我的工作台',fieldTitle:'税务申报工作台',fieldSubtitle:'当前 7 项进行中申报 · 2 项校验规则待执行 · 税务会计陆承',fieldSecondary:'交接记录',reportAction:'录入结果',fieldNoticeTitle:'征期数据已就绪',fieldNotice:'票税数据、总账余额与主体档案均已同步',
 steps:['申报登记确认','底稿准备','规则校验','申报复核','台账归档'],documentAction:'查看税务政策',printAction:'打印税种标签',resourceCardTitle:'税务规则状态',resourceValueLabel:'命中数量',resourceHealthLabel:'规则覆盖率',quickSubtitle:'纳税主体高频业务入口',quickActions:[['结果录入','/shopfloor/report','底稿数据与申报结果'],['税种流转','/shopfloor/material','底稿与凭证索引'],['规则校验','/shopfloor/resources','规则版本与执行记录'],['风险上报','/shopfloor/andon','申报、发票与税会差异']],
 reportDefaults:[3,0],reportTitle:'申报结果录入',reportSubtitle:'记录原始结果、异常数量和申报过程备注。',reportSuccess:'申报结果已保存并进入复核队列',reportPlaceholder:'填写取数口径、税会差异或调整事项说明',reportFootnote:'提交后写入原始记录并生成台账轨迹',ruleTitle:'制度控制要求',ruleSubtitle:'CIT-Q3-26 · V4.3',rules:[['销项税额','286 万'],['进项抵扣率','91.6%'],['税会一致性','已校验'],['规则版本','有效',true]],fieldTotals:[['16','已完成项目'],['1','异常结果'],['5','待复核结果'],['98.2%','申报数据完整率']],
 adminMenus:[['/admin','home','运营驾驶舱'],['/admin/work-orders','order','申报任务'],['/admin/samples','box','税种管理'],['/admin/schedule','calendar','排班预约'],['/admin/methods','process','制度与标准'],['/admin/reviews','quality','申报复核'],['/admin/resources','machine','税务规则'],['/admin/report','chart','税务分析']],
 fieldMenus:[['/shopfloor','home','我的工作台'],['/shopfloor/report','report','结果录入'],['/shopfloor/tasks','order','待检任务'],['/shopfloor/material','box','税种流转'],['/shopfloor/resources','machine','规则校验'],['/shopfloor/andon','risk','风险上报',1]],
 moduleTitles:{tasks:['待检任务','查看任务优先级、税种状态与承诺时限'],material:['税种流转','跟踪接收、分样、留样与销毁全过程'],resources:['规则校验','管理税务规则档期、校准和使用记录'],andon:['风险上报','登记并跟踪 OOS、OOT 与环境风险'],samples:['税种管理','管理税种登记、标签、位置和生命周期'],schedule:['排班预约','协调人员、税务规则和制度的可用时间'],methods:['制度与标准','维护税务政策、限度和标准物质'],reviews:['申报复核','执行底稿复核、税务台账批准和电子签名'],report:['税务分析','分析周转时间、一次通过率和风险趋势']},
 tagline:'让每一份申报结果都有完整税务台账链',storyTitle:'从申报登记到税务台账，<br/>每个结果都可复核、可追溯。',storyText:'连接税种、制度、税务规则、人员与原始数据的纳税主体数字底座。',pattern:[2,3,8,9,10,15,16,17,22,23,24,29,30,11],loginStats:[['98.2%','申报数据完整率'],['11','当前进行中申报'],['2.2 天','平均申报周期']],loginTitle:'纳税主体税务中心',adminDemo:'主体 / 申报 / 风险',fieldDemo:'申报 / 结果 / 风险'
}
export const records=[
 {no:'FILING-260801-018',name:'增值税月度申报',code:'VAT-202607',unit:'研发中心主体',group:'税务中心',plan:24,done:16,exception:1,due:'08-02',batch:'2026-07',status:'申报中',progress:67,priority:'加急'},
 {no:'FILING-260801-021',name:'企业所得税季度预缴',code:'CIT-Q3-26',unit:'上海运营主体',group:'税务中心',plan:18,done:8,exception:0,due:'08-02',batch:'2026-Q3',status:'申报中',progress:44,priority:'正常'},
 {no:'FILING-260802-006',name:'研发费用加计扣除',code:'RD-ADD-26',unit:'华东销售主体',group:'研发中心',plan:12,done:0,exception:0,due:'08-04',batch:'2026-H1',status:'待确认',progress:0,priority:'正常'},
 {no:'FILING-260711-015',name:'印花税申报',code:'STAMP-0726',unit:'上海运营主体',group:'税务中心',plan:20,done:20,exception:1,due:'08-01',batch:'2026-07',status:'已完成',progress:100,priority:'正常'},
 {no:'FILING-260801-024',name:'出口退税申报',code:'REFUND-2608',unit:'上海运营主体',group:'税务中心',plan:15,done:10,exception:0,due:'08-03',batch:'2026-08',status:'待复核',progress:67,priority:'关注'}]
export const resources=[{code:'RULE-VAT-03',name:'销项进项匹配规则',unit:'上海运营主体',status:'运行',health:88,value:'26',valueUnit:'条',note:'销项与进项匹配 · 26 项提醒'},{code:'RULE-UTM-05',name:'关联交易校验规则',unit:'研发中心主体',status:'运行',health:91,value:'14',valueUnit:'条',note:'关联交易参数有效至 2026-12'},{code:'RULE-INC-08',name:'研发费用归集规则',unit:'华东销售主体',status:'报警',health:62,value:'3',valueUnit:'条',note:'研发费用资本化口径待确认'}]
export const reviews=[{no:'REV-260801-032',title:'增值税申报底稿复核',type:'申报复核',detail:'18 张底稿 · 周妍',result:'通过'},{no:'REV-260801-011',title:'所得税预缴调整项复核',type:'底稿复核',detail:'9 项调整 · 顾清',result:'待确认'},{no:'REV-260711-018',title:'研发费用归集差异调查',type:'风险评审',detail:'TAXR-260711-02',result:'异常'}]
export const adminMetrics=[['本期申报任务','16','较昨日增加 8 份','blue'],['按时完成率','96.8%','目标值 ≥ 95.0%','green'],['待复核结果','8','其中 2 项加急','orange'],['风险 / OOS','2','1 项进入调查','red']]
export const fieldMetrics=[['今日任务','7','18 个申报事项','blue'],['已完成','16','当前进度 67%','green'],['待复核','5','数据已完整提交','orange'],['税务规则档期','征期前 2 天','增值税规则 V6','slate']]
export const chartActual=[8,18,29,42,49,61,72,84,91],chartTarget=[10,21,32,43,16,65,76,87,98]
export const loads=[['上海运营主体',92,'12 项在检'],['研发中心主体',78,'8 项在检'],['华东销售主体',71,'6 项在检'],['供应链主体',56,'5 项在检']]
export const issues=[{type:'税务规则',title:'进项发票认证数据缺失',detail:'RULE-INC-08 · 涉及 3 张发票',status:'调查中'},{type:'结果',title:'研发费用税会口径不一致',detail:'TAXR-260711-02 · 等待研发部门确认',status:'待判定'},{type:'时限',title:'出口退税单证可能逾期',detail:'剩余 2 个工作日',status:'协调中'}]
