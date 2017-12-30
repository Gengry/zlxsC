/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/12/30 11:17:48                          */
/*==============================================================*/


drop table if exists cable_color;

drop table if exists cable_customer;

drop table if exists cable_dic;

drop table if exists cable_house;

drop table if exists cable_info;

drop table if exists cable_order;

drop table if exists cable_order_item;

drop table if exists cable_provider;

drop table if exists cable_quality;

drop table if exists cable_storage;

drop table if exists cable_unit;

drop table if exists user_info;

/*==============================================================*/
/* Table: cable_color                                           */
/*==============================================================*/
create table cable_color
(
   id                   int not null auto_increment comment '主键id',
   color_user_id        int comment '用户id',
   color_color          varchar(30) comment '颜色',
   color_time           datetime default CURRENT_TIMESTAMP comment '创建时间',
   color_desc           varchar(255) comment '描述',
   color_delete         int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_color comment '线缆颜色';

/*==============================================================*/
/* Table: cable_customer                                        */
/*==============================================================*/
create table cable_customer
(
   id                   int not null auto_increment,
   customer_user_id     int comment '用户id',
   customer_name        varchar(50) comment '客户公司名',
   customer_contact     varchar(50) comment '客户联系人',
   customer_tele        varchar(50) comment '客户联系电话',
   customer_address     varchar(50) comment '客户公司地址',
   customer_warehouse   varchar(50) comment '客户仓库地址',
   customer_time        datetime default CURRENT_TIMESTAMP comment '创建时间',
   customer_desc        varchar(255) comment '描述',
   customer_delete      int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_customer comment '客户信息表
';

/*==============================================================*/
/* Table: cable_dic                                             */
/*==============================================================*/
create table cable_dic
(
   id                   int not null auto_increment comment '主键id',
   cable_dic_type       int comment '字典类型（1:质量 2:计量单位,3:颜色）',
   cable_dic_name       varchar(50) comment '字典值',
   cable_dic_desc       varchar(100) comment '字典值描述',
   cable_dic_intype     int default 0 comment '类型内标识',
   cable_dic_time       datetime default CURRENT_TIMESTAMP comment '创建时间',
   cable_dic_delete     int default 0 comment '0正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_dic comment '商城字典表';

/*==============================================================*/
/* Table: cable_house                                           */
/*==============================================================*/
create table cable_house
(
   id                   int not null auto_increment comment '主键标识',
   cable_house_user_id  int comment '用户id',
   cable_house_name     varchar(30) comment '仓库名',
   cable_house_address  varchar(100) comment '仓库地址',
   cable_house_contact  varchar(15) comment '仓库管理员',
   cable_house_tele     varchar(30) comment '仓库电话',
   cable_house_time     datetime default CURRENT_TIMESTAMP comment '创建时间',
   cable_house_desc     varchar(255) comment '仓库描述',
   cable_house_delete   int default 0 comment '0正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_house comment '仓库信息表';

/*==============================================================*/
/* Table: cable_info                                            */
/*==============================================================*/
create table cable_info
(
   id                   int not null auto_increment,
   cable_user_id        int comment '用户id',
   cable_model          varchar(20) comment '线缆规格',
   cable_spec           varchar(20) comment '线缆型号',
   cable_desc           varchar(255) comment '描述',
   cable_price          decimal(18,2) comment '推荐价格',
   cable_time           datetime default CURRENT_TIMESTAMP comment '创建时间',
   cable_delete         smallint default 0 comment '0正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_info comment '线缆型号';

/*==============================================================*/
/* Table: cable_order                                           */
/*==============================================================*/
create table cable_order
(
   id                   int not null auto_increment comment '主键id',
   order_user_id        int comment '用户id',
   order_other_id       int comment '客户id',
   order_other_name     varchar(30) comment '客户公司名',
   order_other_contact  varchar(30) comment '联系人',
   order_other_tele     varchar(30) comment '联系电话',
   order_other_address  varchar(30) comment '公司地址',
   order_other_house    varchar(50) comment '客户仓库地址',
   order_time           datetime comment '订单时间',
   order_totalprice     decimal(18,2) comment '订单总金额',
   order_desc           varchar(255) comment '订单备注',
   order_delete         int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_order comment '线缆订单表';

/*==============================================================*/
/* Table: cable_order_item                                      */
/*==============================================================*/
create table cable_order_item
(
   id                   int not null auto_increment comment '主键id',
   item_user_id         int comment '用户id',
   item_order_id        int comment '订单id',
   item_model           varchar(30) comment '线缆型号',
   item_spec            varchar(30) comment '线缆规格',
   item_quality         varchar(30) comment '线缆质量',
   item_unit            varchar(30) comment '线缆单位',
   item_color           varchar(30) comment '线缆颜色',
   item_number          decimal(18,3) comment '数量',
   item_price           decimal comment '单价',
   item_discount        decimal(18,2) comment '折扣',
   item_totle_price     decimal comment '小计',
   item_house           varchar(30) comment '出库仓库地址',
   item_delete          int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_order_item comment '订单条目';

/*==============================================================*/
/* Table: cable_provider                                        */
/*==============================================================*/
create table cable_provider
(
   id                   int not null auto_increment,
   provider_user_id     int comment '用户id',
   provider_name        varchar(50) comment '供应商公司名',
   provider_contact     varchar(50) comment '联系人',
   provider_tele        varchar(50) comment '联系电话',
   provider_address     varchar(50) comment '公司地址',
   provider_warehouse   varchar(50) comment '仓库地址',
   provider_time        datetime default CURRENT_TIMESTAMP comment '创建时间',
   provider_desc        varchar(255) comment '描述',
   provider_delete      int default 0 comment '0正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_provider comment '供应商信息表';

/*==============================================================*/
/* Table: cable_quality                                         */
/*==============================================================*/
create table cable_quality
(
   id                   int not null auto_increment comment '主键id',
   quality_user_id      int comment '用户id',
   quality_quality      varchar(30) comment '质量',
   quality_time         datetime default CURRENT_TIMESTAMP comment '创建时间',
   quality_desc         varchar(255) comment '描述',
   quality_delete       int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_quality comment '线缆计量单位';

/*==============================================================*/
/* Table: cable_storage                                         */
/*==============================================================*/
create table cable_storage
(
   id                   int not null auto_increment comment '主键id',
   storage_user_id      int comment '用户id',
   storage_model        int comment '线缆型号',
   storage_spec         varchar(20) comment '线缆规格',
   storage_unit         varchar(20) comment '计量单位',
   storage_number       decimal(18,2) comment '数量',
   storage_quality      varchar(20) comment '线缆质量',
   storage_color        varchar(20) comment '线缆颜色',
   storage_providerid   int comment '供应商id',
   storage_update_time  datetime comment '更新时间',
   storage_houseid      int comment '仓库id',
   storage_desc         varchar(255) comment '备注',
   storage_delete       int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_storage comment '线缆库存表';

/*==============================================================*/
/* Table: cable_unit                                            */
/*==============================================================*/
create table cable_unit
(
   id                   int not null auto_increment comment '主键id',
   unit_user_id         int comment '用户id',
   unit_unit            varchar(30) comment '单位',
   unit_time            datetime default CURRENT_TIMESTAMP comment '创建时间',
   unit_desc            varchar(255) comment '描述',
   unit_delete          int default 0 comment '0 正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_unit comment '线缆计量单位';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int(11) not null auto_increment comment '用户id',
   user_name            varchar(20) comment '用户名',
   user_pass            varchar(20) comment '密码',
   user_time            datetime default CURRENT_TIMESTAMP comment '创建时间',
   user_delete          int default 0 comment '0正常 1已删除',
   primary key (id)
)
ENGINE = InnoDB;

alter table user_info comment '用户表';

