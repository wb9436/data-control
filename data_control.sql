/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : data_control

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-08-15 15:50:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `balance` int(11) NOT NULL DEFAULT '0',
  `createTime` datetime NOT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=100001 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('100000', '小明', '9990', '2018-08-15 14:29:06', '2018-08-15 14:29:09');

-- ----------------------------
-- Table structure for test_user_account_log
-- ----------------------------
DROP TABLE IF EXISTS `test_user_account_log`;
CREATE TABLE `test_user_account_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `preModify` int(11) NOT NULL COMMENT '修改前',
  `modify` int(11) NOT NULL,
  `balance` int(11) NOT NULL COMMENT '当前余额',
  `modifyTime` datetime NOT NULL COMMENT '变更时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user_account_log
-- ----------------------------
