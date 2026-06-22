SET SERVEROUTPUT ON;

DECLARE
   num1 NUMBER := 10;
   num2 NUMBER := 0;
   result NUMBER;
BEGIN
   result := num1 / num2;

EXCEPTION
   WHEN ZERO_DIVIDE THEN
      DBMS_OUTPUT.PUT_LINE('Error: Cannot divide by zero');
END;
/
