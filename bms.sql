/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : bms

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 23/05/2021 09:50:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`, `admin_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (1, 'qsl', '888', '男');
INSERT INTO `administrator` VALUES (2, 'admin', '888', '男');
INSERT INTO `administrator` VALUES (3, 'dili', '888', '男');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_publish` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_stock` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1444521 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '计算理论22542', '萨瓦迪卡452', '教材2542', '辽宁沈阳出版社2', 102);
INSERT INTO `book` VALUES (1021, 'Java程序设计', '大龙', '计算机', '辽宁图书出版社', 66);
INSERT INTO `book` VALUES (1022, 'C++程序设计', '大林', '计算机', '辽宁图书出版社', 6);
INSERT INTO `book` VALUES (1023, '高等数学上', '大强', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1024, '高等数学下', '大强', '数学', '高等教育出版社', 66);
INSERT INTO `book` VALUES (1025, '大学英语', '大林', '教材', '高等教育出版社', 66);
INSERT INTO `book` VALUES (1444459, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444462, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444465, '大学英语', '大林', '教材', '高等教育出版社', 65);
INSERT INTO `book` VALUES (1444467, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444469, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444471, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444473, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444474, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444475, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444476, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444479, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444480, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444481, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444482, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444483, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444484, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444485, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444486, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444487, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444490, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444491, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444493, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444494, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444495, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444496, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444497, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444499, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444500, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444501, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444502, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444503, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444504, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444505, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444506, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444507, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444508, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444513, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444514, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444515, '大学英语', '大林', '教材', '高等教育出版社', 6);
INSERT INTO `book` VALUES (1444516, '离散数学', '大东', '教材', '高等教育出版社', 66);
INSERT INTO `book` VALUES (1444517, '恶意', '东野圭吾', '小说', '湖南工信出版集团', 4);
INSERT INTO `book` VALUES (1444518, '2', '2', '2', '2', 2);
INSERT INTO `book` VALUES (1444520, '5245324', '54', '453', '45354', 35343);

-- ----------------------------
-- Table structure for reader
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader`  (
  `reader_sno` int(11) NOT NULL AUTO_INCREMENT,
  `reader_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reader_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reader_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reader_profession` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reader_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`reader_sno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 202491105 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reader
-- ----------------------------
INSERT INTO `reader` VALUES (181491106, '曲尚来', '男', '信息学院', '软件工程', '333');
INSERT INTO `reader` VALUES (202491101, '小明', '男', '信息学院', '软件工程', '666');
INSERT INTO `reader` VALUES (202491102, '大东', '男', '信息学院', '软件工程', '666');
INSERT INTO `reader` VALUES (202491103, '小红', '女', '信息学院', '软件工程', '666');
INSERT INTO `reader` VALUES (202491104, '小玲', '女', '信息学院', '软件工程', '666');

SET FOREIGN_KEY_CHECKS = 1;
