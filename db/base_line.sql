create database weixin;
use weixin;

create table user (
  user_inner_id varchar(40) not null,
  user_id varchar(40) not null,
  username varchar(45) not null,
  primary key (user_inner_id)
) engine=innodb default charset=utf8;

create table answers (
  user_inner_id varchar(40) not null,
  questions_set_name varchar(128) not null,
  questions_answers varchar(1024) not null,
  time_consuming long
) engine=innodb default charset=utf8;

