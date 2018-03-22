﻿CREATE SEQUENCE addresses_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE addresses_id_seq
  OWNER TO postgres;

CREATE SEQUENCE category_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 999999999999999999
  START 9
  CACHE 1;
ALTER TABLE category_id_seq
  OWNER TO postgres;

CREATE SEQUENCE customers_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 7
  CACHE 1;
ALTER TABLE customers_id_seq
  OWNER TO postgres;


CREATE SEQUENCE hibernate_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 19
  CACHE 1;
ALTER TABLE hibernate_sequence
  OWNER TO postgres;

CREATE SEQUENCE inflows_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 1111111111111111111
  START 7
  CACHE 1;
ALTER TABLE inflows_id_seq
  OWNER TO postgres;

CREATE SEQUENCE order_items_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 7
  CACHE 1;
ALTER TABLE order_items_id_seq
  OWNER TO postgres;

CREATE SEQUENCE orders_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 7
  CACHE 1;
ALTER TABLE orders_id_seq
  OWNER TO postgres;

CREATE SEQUENCE outflows_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 1111111111111111111
  START 7
  CACHE 1;
ALTER TABLE outflows_id_seq
  OWNER TO postgres;

CREATE SEQUENCE payments_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 7
  CACHE 1;
ALTER TABLE payments_id_seq
  OWNER TO postgres;

CREATE SEQUENCE products_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 7
  CACHE 1;
ALTER TABLE products_id_seq
  OWNER TO postgres;

CREATE SEQUENCE shippers_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 1111111111111111111
  START 6
  CACHE 1;
ALTER TABLE shippers_id_seq
  OWNER TO postgres;
CREATE SEQUENCE warehouse_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 1111111111111111111
  START 1
  CACHE 1;
ALTER TABLE warehouse_id_seq
  OWNER TO postgres;
