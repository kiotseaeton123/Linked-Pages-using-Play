# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table paper (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  author                        varchar(255),
  date                          varchar(255),
  topic                         varchar(255),
  constraint pk_paper primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists paper;

drop table if exists user;

