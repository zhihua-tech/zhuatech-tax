# Tax 架构

版权所有 © 2026 上海如静知华信息科技有限公司。

浏览器通过 Vue 管理端或税务会计端访问 Spring Boot REST API。安全层完成 JWT 与角色鉴权，业务层负责申报任务、税种、税务规则、复核和结果记录，JPA/Flyway 管理 MySQL 数据。

管理端角色为 `TAX_MANAGER`、`QUALITY`、`ADMIN`；执行端角色为 `TAX_ACCOUNTANT`。正式部署建议将税务规则连接置于独立采集服务，并隔离纳税主体网络和办公网络。
