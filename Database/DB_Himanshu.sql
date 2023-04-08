CREATE or replace PROCEDURE defaultName(surnamename IN VARCHAR(20), Ename out varchar(20))
is begin
    update Employee set name = name || ' ' || surname;
    commit;
    
    End;
    /
    
    DELIMITER $$  
CREATE FUNCTION Customer_Occupation(  
    age int  
)   
RETURNS VARCHAR(20)  
DETERMINISTIC  
BEGIN  
    DECLARE customer_occupation VARCHAR(20);  
    IF age > 35 THEN  
        SET customer_occupation = 'Scientist';  
    ELSEIF (age <= 35 AND   
            age >= 30) THEN  
        SET customer_occupation = 'Engineer';  
    ELSEIF age < 30 THEN  
        SET customer_occupation = 'Actor';  
    END IF;  
    -- return the customer occupation  
    RETURN (customer_occupation);  
END$$  
DELIMITER;  

set serveroutput on;
create Table review (id int(11) Primary key auto increment ,course_name varchar(128),student_name varchar(45),timestamp timestamp,rating float,comment varchar(1024));

desc review;

 select * from Employee where Email = 'Hello@gmail.com';
 ALTER TABLE Employee
DROP COLUMN DOB;
select * from Employee;