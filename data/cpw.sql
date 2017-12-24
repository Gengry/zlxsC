/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/12/24 17:02:42                          */
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
   customer_name        varchar(50) comment '�ͻ���˾��',
   customer_contact     varchar(50) comment '�ͻ���ϵ��',
   customer_tele        varchar(50) comment '�ͻ���ϵ�绰',
   customer_address     varchar(50) comment '�ͻ���˾��ַ',
   customer_warehouse   varchar(50) comment '�ͻ��ֿ��ַ',
   customer_desc        varchar(255) comment '����',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_customer comment '�ͻ���Ϣ��';

/*==============================================================*/
/* Table: cable_info                                            */
/*==============================================================*/
create table cable_info
(
   id                   int not null auto_increment,
   cable_model          varchar(20) comment '���¹��',
   cable_spec           varchar(20) comment '�����ͺ�',
   cable_desc           varchar(255) comment '����',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_info comment '�����ͺ�';

/*==============================================================*/
/* Table: cable_provider                                        */
/*==============================================================*/
create table cable_provider
(
   id                   int not null auto_increment,
   provider_name        varchar(50) comment '��Ӧ�̹�˾��',
   provider_contact     varchar(50) comment '��ϵ��',
   provider_tele        varchar(50) comment '��ϵ�绰',
   provider_address     varchar(50) comment '��˾��ַ',
   provider_warehouse   varchar(50) comment '�ֿ��ַ',
   provider_desc        varchar(255) comment '����',
   primary key (id)
)
ENGINE = InnoDB;

alter table cable_provider comment '��Ӧ����Ϣ��';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int(11) not null auto_increment comment '�û�id',
   user_name            varchar(20) comment '�û���',
   user_pass            varchar(20) comment '����',
   primary key (id)
)
ENGINE = InnoDB;

alter table user_info comment '�û���';

