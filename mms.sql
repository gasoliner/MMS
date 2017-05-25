/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : mms

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2017-05-24 14:27:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for instore
-- ----------------------------
DROP TABLE IF EXISTS `instore`;
CREATE TABLE `instore` (
  `isid` int(20) NOT NULL AUTO_INCREMENT,
  `mid` int(20) DEFAULT NULL,
  `material` varchar(100) DEFAULT NULL,
  `count` float DEFAULT NULL,
  `price` float DEFAULT NULL,
  `provider` varchar(100) DEFAULT NULL,
  `isreturn` int(11) DEFAULT '0',
  `borrowid` int(20) DEFAULT NULL,
  `returndate` date DEFAULT NULL,
  PRIMARY KEY (`isid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of instore
-- ----------------------------
INSERT INTO `instore` VALUES ('1', '2', '路由器', '100', '60', '汉东省山水集团', '0', null, null);
INSERT INTO `instore` VALUES ('2', '1', '棉花', '500', '10', '京州市委后勤', '0', null, null);
INSERT INTO `instore` VALUES ('3', '1', '棉花', '20', null, null, '1', '1', '2017-05-24');
INSERT INTO `instore` VALUES ('4', '2', '路由器', '10', null, null, '1', '2', '2017-05-25');
INSERT INTO `instore` VALUES ('5', '6', '键盘', '600', '50', '汉东省山水集团', '0', null, null);
INSERT INTO `instore` VALUES ('6', '6', '键盘', '100', null, null, '1', '3', '2017-05-25');
INSERT INTO `instore` VALUES ('7', '7', '窗户', '100', '20', '京州市委后勤', '0', null, null);
INSERT INTO `instore` VALUES ('8', '7', '窗户', '25', null, null, '1', '4', '2017-05-27');

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `mid` int(20) NOT NULL,
  `material` varchar(100) DEFAULT NULL,
  `count` float DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventory
-- ----------------------------
INSERT INTO `inventory` VALUES ('1', '棉花', '480', '10');
INSERT INTO `inventory` VALUES ('2', '路由器', '90', '60');
INSERT INTO `inventory` VALUES ('6', '键盘', '485', '50');
INSERT INTO `inventory` VALUES ('7', '窗户', '95', '20');

-- ----------------------------
-- Table structure for outstore
-- ----------------------------
DROP TABLE IF EXISTS `outstore`;
CREATE TABLE `outstore` (
  `osid` int(20) NOT NULL AUTO_INCREMENT,
  `mid` int(20) DEFAULT NULL,
  `material` varchar(100) DEFAULT NULL,
  `count` float DEFAULT NULL,
  `outway` varchar(50) DEFAULT NULL,
  `liable` varchar(50) DEFAULT NULL,
  `useobject` varchar(100) DEFAULT NULL,
  `outtime` date DEFAULT NULL,
  `isreturn` int(11) DEFAULT '0',
  `returntime` date DEFAULT NULL,
  PRIMARY KEY (`osid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outstore
-- ----------------------------
INSERT INTO `outstore` VALUES ('1', '1', '棉花', '20', '3', null, '业务部', '2017-05-24', '1', '2017-05-24');
INSERT INTO `outstore` VALUES ('2', '2', '路由器', '10', '3', null, '技术部', '2017-05-24', '1', '2017-05-25');
INSERT INTO `outstore` VALUES ('3', '6', '键盘', '100', '3', null, '海外事业部', '2017-05-24', '1', '2017-05-25');
INSERT INTO `outstore` VALUES ('4', '7', '窗户', '25', '3', null, '后勤部', '2017-05-25', '1', '2017-05-27');

-- ----------------------------
-- Table structure for reportloss
-- ----------------------------
DROP TABLE IF EXISTS `reportloss`;
CREATE TABLE `reportloss` (
  `rlid` int(20) NOT NULL AUTO_INCREMENT,
  `mid` int(20) DEFAULT NULL,
  `material` varchar(100) DEFAULT NULL,
  `rpobject` varchar(50) DEFAULT NULL,
  `count` float DEFAULT NULL,
  `rptime` date DEFAULT NULL,
  PRIMARY KEY (`rlid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reportloss
-- ----------------------------
INSERT INTO `reportloss` VALUES ('1', '7', '窗户', '后勤部', '5', '2017-05-24');
INSERT INTO `reportloss` VALUES ('2', '6', '键盘', '后勤部', '15', '2017-05-24');

-- ----------------------------
-- Table structure for systemddl
-- ----------------------------
DROP TABLE IF EXISTS `systemddl`;
CREATE TABLE `systemddl` (
  `sysid` int(20) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ddlName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ddlRemarks` varchar(1000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sysid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of systemddl
-- ----------------------------
INSERT INTO `systemddl` VALUES ('1', 'kind', '棉花（斤）', '公司经营用的战略物资');
INSERT INTO `systemddl` VALUES ('2', 'kind', '路由器（台）', 'DHCP重要，工作学习都需要。');
INSERT INTO `systemddl` VALUES ('3', 'provider', '汉东省山水集团', '祈同伟有股份！！');
INSERT INTO `systemddl` VALUES ('4', 'provider', '京州市委后勤', '达康书记呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵');
INSERT INTO `systemddl` VALUES ('6', 'kind', '键盘', '工作必须的');
INSERT INTO `systemddl` VALUES ('7', 'kind', '窗户', '必须');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `rid` int(5) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '王小明', '123123', '2', '后勤部');
INSERT INTO `user` VALUES ('3', '王小红', '123123', '1', '技术部');
