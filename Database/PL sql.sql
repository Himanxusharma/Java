/*
DECLARE 
msg varchar2(100):='Hello world';
BEGIN
dbms_output.put_line(msg);
END ;
*/
DECLARE
SUBTYPE name IS CHAR(20);
SUBTYPE message IS VARCHAR2(20);
pi CONSTANT Double PRECISION : = 3.1415; 
solutation name;
greetings message;
BEGIN
solutation := 'Reader';
greetings := 'Welcome to the World of Pl/Sql';
dbms_output.put_line('Hello, ' || solutation ||greetings);
END;
/


DECLARE 
    id employee.eid%type:=1;
    name employee.name%type;
    email employee.email%type;
    
BEGIN
SELECT eid,name,email INTO id,name,email FROM employee where id = eid;
dbms_output.put_line('customer' || name || 'have' || email || 'email');
END;
/




--switch case
DECLARE 
grade char(1) :='A';
BEGIN 
CASE grade
    when 'A' then dbms_output.put_line('Excellent');
    when 'B' then dbms_output.put_line('Very Good');
    when 'C' then dbms_output.put_line('Good');
    when 'D' then dbms_output.put_line('Better try');
    else dbms_output.put_line('No such grades ');
    END CASE;
    END;
    /

--if then else

--searched case

DECLARE 
grade char(1) :='B';
BEGIN 
CASE 
    when grade = 'A' then dbms_output.put_line('Excellent');
    when grade = 'B' then dbms_output.put_line('Very Good');
    when grade = 'C' then dbms_output.put_line('Good');
    when grade = 'D' then dbms_output.put_line('Better try');
    else dbms_output.put_line('No such grades ');
    END CASE;
    END;
    /



