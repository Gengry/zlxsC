/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/12/27 20:47:04                          */
/*==============================================================*/


drop table if exists cable_customer;

drop table if exists cable_info;

drop table if exists cable_provider;

drop table if exists user_info;

/*==============================================================*/
/* Table: cable_customer                                        */
/*==============================================================*/
create table cable_customer
(
   id                   int not null auto_increment,
   customer_name        varchar(50) comment '客户公司名',
   customer_contact     varchar(50) comment '客户联系人',
   customer_tele        varchar(50) comment '客户联系电话',
   customer_address     varchar(50) comment '客户公司地址',
   customer_warehouse   varchar(50) comment '客户仓库地址',
   customer_desc        varchar(255) comment '描述',
   primary key (id)
)
engine = InnoDB;

alter table cable_customer comment '客户信息表
';

/*==============================================================*/
/* Table: cable_info                                            */
/*==============================================================*/
create table cable_info
(
   id                   int not null auto_increment,
   cable_model          varchar(20) comment '线缆规格',
   cable_spec           varchar(20) comment '线缆型号',
   cable_desc           varchar(255) comment '描述',
   cable_delete         smallint comment '0正常 1已删除',
   primary key (id)
)
type = InnoDB;

alter table cable_info comment '线缆型号';

/*==============================================================*/
/* Table: cable_provider                                        */
/*==============================================================*/
create table cable_provider
(
   id                   int not null auto_increment,
   provider_name        varchar(50) comment '供应商公司名',
   provider_contact     varchar(50) comment '联系人',
   provider_tele        varchar(50) comment '联系电话',
   provider_address     varchar(50) comment '公司地址',
   provider_warehouse   varchar(50) comment '仓库地址',
   provider_desc        varchar(255) comment '描述',
   primary key (id)
)
type = InnoDB;

alter table cable_provider comment '供应商信息表';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int(11) not null auto_increment comment '用户id',
   user_name            varchar(20) comment '用户名',
   user_pass            varchar(20) comment '密码',
   primary key (id)
)
type = InnoDB;

alter table user_info comment '用户表';

