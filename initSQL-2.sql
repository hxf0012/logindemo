# 用户表
DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) DEFAULT NULL,
  `password` VARCHAR(50) DEFAULT NULL,
  `salt` VARCHAR(50) DEFAULT NULL,
  `email` VARCHAR(100) DEFAULT NULL,
  `status` INT(11) DEFAULT NULL COMMENT '0-未激活; 1-已激活;',
  `activation_code` VARCHAR(100) DEFAULT NULL,
  `create_time` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_username` (`username`(20)),
  KEY `index_email` (`email`(20))
) ENGINE=INNODB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (101,'abc1','6f85841cde23fa6af63d94eb4448f803','49f10','123455@sina.com',1,'1234545','2021-09-7 02:11:03'),
(102,'abc','5980596de557e85d32fec6484321555b','49f11','abc1234@sina.com',1,NULL,'2021-09-7 02:12:03');
UNLOCK TABLES;

# 登录表单
DROP TABLE IF EXISTS `login_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login_ticket` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `ticket` VARCHAR(45) NOT NULL,
  `status` INT(11) DEFAULT '0' COMMENT '0-有效; 1-无效;',
  `expired` TIMESTAMP NOT NULL,
  PRIMARY KEY (`id`),
  KEY `index_ticket` (`ticket`(20))
) ENGINE=INNODB DEFAULT CHARSET=utf8;
