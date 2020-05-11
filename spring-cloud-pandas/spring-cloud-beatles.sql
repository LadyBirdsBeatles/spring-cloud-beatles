/*
 Navicat Premium Data Transfer

 Source Server         : xiaochen
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : spring-cloud-beatles

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 12/05/2020 00:13:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `users_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `users_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `users_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `users_phonenumber` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `user_sources` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据库',
  PRIMARY KEY (`users_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '业主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '陈水凤', '83ac0721fabd9b3fee7abd67ae92b6c0', '13628854623', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (2, '张丽芳', '83ac0721fabd9b3fee7abd67ae92b6c0', '13760523391', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (3, '甄东航', '83ac0721fabd9b3fee7abd67ae92b6c0', '15308645931', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (4, '赵伟', '83ac0721fabd9b3fee7abd67ae92b6c0', '15308081769', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (5, '郑守强', '83ac0721fabd9b3fee7abd67ae92b6c0', '18565135470', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (6, '李维真', '83ac0721fabd9b3fee7abd67ae92b6c0', '15902864529', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (7, '陈东国', '83ac0721fabd9b3fee7abd67ae92b6c0', '16845213659', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (8, '王宝珍', '83ac0721fabd9b3fee7abd67ae92b6c0', '16542351259', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (9, '陈飞', '83ac0721fabd9b3fee7abd67ae92b6c0', '15983019221', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (10, '蒋聪聪', 'b9853c88db11b2c49764d143f24b1ce9', '18718623602', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (11, 'xiaochen', '15986011', '15983019223', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (12, 'xiaochen', '15986011', '15983019223', 'spring-cloud-beatles');
INSERT INTO `users` VALUES (13, 'xiaochen', '15986011', '15983019223', 'spring-cloud-beatles');

SET FOREIGN_KEY_CHECKS = 1;
