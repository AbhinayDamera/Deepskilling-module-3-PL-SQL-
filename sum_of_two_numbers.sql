SET SERVEROUTPUT ON;

DECLARE

    -- taking input for variable a
    a INTEGER := &a;
    
-- taking input for variable b
    b INTEGER := &b;
    c INTEGER;

BEGIN
    c := a + b;
    DBMS_OUTPUT.PUT_LINE('Sum of ' || a || ' and ' || b || ' is = ' || c);
END;
/
