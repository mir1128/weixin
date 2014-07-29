create database weixin;
use weixin;

create table user (
  user_inner_id varchar(40) not null,
  user_outter_id varchar(40) ,
  username varchar(45) ,
  currentQuestionSet varchar(64),
  questionSequence varchar(255),
  answers varchar(128),
  finish_index int
  primary key (user_inner_id)
) engine=innodb default charset=utf8;

