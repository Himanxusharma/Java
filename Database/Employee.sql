--------------------------------------------------------
--  File created - Wednesday-March-15-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMPLOYEE
--------------------------------------------------------

  CREATE TABLE "HIMANSHU"."EMPLOYEE" 
   (	"NAME" VARCHAR2(30 BYTE), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"MOB" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HIMANSHU.EMPLOYEE
SET DEFINE OFF;
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('Himanshu','Hello@gmail.com','88557744');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('Harry','Harry@gmail.com','8834145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('mishra','mishra@gmail.com','2554145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('aman','aman@gmail.com','7834145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('rajan','rajan@gmail.com','2134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('tinku','tinku@gmail.com','2134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('ritik','ritik@gmail.com','9134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('kapil','kapil@gmail.com','324145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('amit','amit@gmail.com','14134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('sumit','sumit@gmail.com','963134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('sunny','sunny@gmail.com','07434145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('amit','amit@gmail.com','14134145957');
Insert into HIMANSHU.EMPLOYEE (NAME,EMAIL,MOB) values ('amit','amit@gmail.com','14134145957');
--------------------------------------------------------
--  DDL for Trigger ACKNOWLEDGE
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "HIMANSHU"."ACKNOWLEDGE" 
before insert or delete or UPDATE on Employee
for each row
declare
begin
dbms_output.put_line('Done..! ');
end;
/
ALTER TRIGGER "HIMANSHU"."ACKNOWLEDGE" ENABLE;
