/*create table dish (id integer generated by default as identity, name varchar(255), price double, primary key (id))
create table menu (id integer generated by default as identity, curr_date timestamp, restaurant_id integer, primary key (id))
create table menu_dishes (menu_id integer not null, dishes_id integer not null)
create table restaurant (id integer generated by default as identity, name varchar(255), primary key (id))
create table user (id integer generated by default as identity, name varchar(255), primary key (id))
create table voting (id integer generated by default as identity, rating integer not null, restaurant binary(255), user binary(255), primary key (id))
alter table menu_dishes add constraint UK_6g02saeub38o9u6ig7bf4cjf2 unique (dishes_id)*/




DELETE FROM dish;
/*DELETE FROM menu_dishes;*/
/*DELETE FROM menu;*/
DELETE FROM restaurant;
DELETE FROM user;
DELETE FROM voting;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO restaurant (name)
    VALUES ('Restaurant 8'),
      ('Restaurant 2');


INSERT INTO dish (name, price,restaurant_id)
VALUES ('Dish1',2.1,100000),
  ('Dish2',3.2,100000),
  ('Dish13',4.3,100000);


/*INSERT INTO MENU (RESTAURANT_ID)
    VALUES (1);*/

//create table menu_dishes (menu_id integer default nextval('global_seq') not null, dishes_id integer default nextval('global_seq') not null)



/*SELECT * FROM MENU;*/


/*INSERT INTO menu_dishes (menu_id,dishes_id)
    VALUES (100002,100003);*/


/*SELECT * FROM MENU_DISHES;*/

/*
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO departments (name)
VALUES ('Marketing'),
  ('Production');*/
