/*
MySQL Data Transfer
Source Host: localhost
Source Database: myuser
Target Host: localhost
Target Database: myuser
Date: 2021/3/28 15:55:07
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for myuser
-- ----------------------------
CREATE TABLE `myuser` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` char(255) NOT NULL,
  `sex` char(255) NOT NULL,
  `birthday` date NOT NULL,
  `phone` varchar(11) NOT NULL,
  `job` char(255) NOT NULL,
  `remake` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `myuser` VALUES ('1', '王林', '男', '2021-03-04', '12345678912', 'it', '一个老程序猿');
INSERT INTO `myuser` VALUES ('2', '白小纯', '男', '2021-03-28', '11111111111', 'ui', '老设计');
INSERT INTO `myuser` VALUES ('3', '王宝乐', '男', '2021-03-19', '22222222222', '前端', '老前端');
INSERT INTO `myuser` VALUES ('4', '李慕婉', '女', '2021-03-17', '33333333333', '产品', '产品');
