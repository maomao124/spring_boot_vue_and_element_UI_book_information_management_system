/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 09/05/2022 18:50:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '教育类', 'c语言程序设计', 'c语言的书,推荐');
INSERT INTO `book` VALUES (2, '教育类', 'java程序设计', 'java');
INSERT INTO `book` VALUES (3, '童话类', '安徒生童话', '经典');
INSERT INTO `book` VALUES (4, '小说类', '斗罗大陆', '热门的玄幻小说');
INSERT INTO `book` VALUES (6, '1', '1234', '2');
INSERT INTO `book` VALUES (7, '12', '1212', '1212');
INSERT INTO `book` VALUES (8, '12121', '212', '1212');
INSERT INTO `book` VALUES (9, '1212', '12', '12121');
INSERT INTO `book` VALUES (10, '12', '131243', '2134124');
INSERT INTO `book` VALUES (11, '13214', '1232', '124124');
INSERT INTO `book` VALUES (13, '1212', '121', '21234');
INSERT INTO `book` VALUES (14, '122', '11111', '111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111');

SET FOREIGN_KEY_CHECKS = 1;
