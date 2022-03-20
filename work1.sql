/*
Navicat MySQL Data Transfer

Source Server         : wzy
Source Server Version : 50511
Source Host           : localhost:3306
Source Database       : work1

Target Server Type    : MYSQL
Target Server Version : 50511
File Encoding         : 65001

Date: 2022-03-20 13:11:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'jack', '1111');
INSERT INTO `admin` VALUES ('2', 'rose', '1111');
INSERT INTO `admin` VALUES ('3', 'a', '1234');
INSERT INTO `admin` VALUES ('5', 'b', '1111');
INSERT INTO `admin` VALUES ('6', 'c', '1111');
INSERT INTO `admin` VALUES ('7', 'jack1', 'Ab123456');
INSERT INTO `admin` VALUES ('8', 'jack2', 'Ab123456');
INSERT INTO `admin` VALUES ('10', 'aaa', '123');
INSERT INTO `admin` VALUES ('14', 'a1', '1');
INSERT INTO `admin` VALUES ('15', 'b1', '2');
INSERT INTO `admin` VALUES ('16', 'c1', '3');

-- ----------------------------
-- Table structure for `math`
-- ----------------------------
DROP TABLE IF EXISTS `math`;
CREATE TABLE `math` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) NOT NULL,
  `grate` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `am_key` (`admin_id`),
  CONSTRAINT `am_key` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of math
-- ----------------------------
INSERT INTO `math` VALUES ('1', '1', '10');
INSERT INTO `math` VALUES ('2', '1', '5');
