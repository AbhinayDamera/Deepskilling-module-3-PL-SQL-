SET SERVEROUTPUT ON;

DECLARE
   stock_price NUMBER := 9.73;
   net_earnings NUMBER := 0;
   pe_ratio NUMBER;
BEGIN
   pe_ratio := stock_price / net_earnings;
   dbms_output.put_line('Price/earnings ratio = ' || pe_ratio);

EXCEPTION 


   WHEN ZERO_DIVIDE THEN 
      dbms_output.put_line('Company must have had zero earnings.');
      pe_ratio := null;

   WHEN OTHERS THEN 
      dbms_output.put_line('Some other kind of error occurred.');
      pe_ratio := null;

END; 
/
