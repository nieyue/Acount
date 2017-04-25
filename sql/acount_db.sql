# 数据库 
#创建数据库
DROP DATABASE IF EXISTS acount_db;
CREATE DATABASE acount_db;

#使用数据库 
use acount_db;

#创建角色表
CREATE TABLE role_tb(
role_id int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
name varchar(255) COMMENT '角色名',
duty varchar(255) COMMENT '角色职责',
update_date datetime COMMENT '更新时间',
PRIMARY KEY (role_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='角色表';

#创建账户表 
CREATE TABLE acount_tb(
acount_id int(11) NOT NULL AUTO_INCREMENT COMMENT '账户id',
phone varchar(255) COMMENT '电话',
email varchar(255) COMMENT 'email',
password varchar(255) COMMENT '密码',
identity_cards varchar(255) COMMENT '身份证',
qq varchar(255) COMMENT 'QQ',
wechat varchar(255) COMMENT '微信号',
microblog varchar(255) COMMENT '微博',
create_date datetime COMMENT '创建时间',
login_date datetime COMMENT '登陆时间',
role_id int(11) COMMENT '角色id外键',
PRIMARY KEY (acount_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='账户表';

#创建财务表 
CREATE TABLE finance_tb(
finance_id int(11) NOT NULL AUTO_INCREMENT COMMENT '财务id',
money decimal(11,2) COMMENT '余额',
recharge decimal(11,2) COMMENT '充值金额',
consume decimal(11,2) COMMENT '消费金额',
bank_user_name varchar(255) COMMENT '开户人',
bank_name varchar(255) COMMENT '开户银行',
bank_account varchar(255) COMMENT '银行账号',
bank_address varchar(255) COMMENT '开户银行地址',
update_date datetime COMMENT '更新时间',
acount_id int(11) COMMENT '账户id外键',
PRIMARY KEY (finance_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='财务表';