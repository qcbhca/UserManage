CREATE TABLE IF NOT EXISTS `user`(
	`id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`userId` int NOT NULL COMMENT '用户id'
	`username` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '密码',
	`scene_desc` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '场景描述',
	`create_time` DATETIME NOT NULL DEFAULT '1971-01-01 00:00:00' COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT '1971-01-01 00:00:00' COMMENT '更新时间',
	PRIMARY KEY (`id`),
	UNIQUE KEY `uniq_scene_code` (`scene_code`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '业务场景表';