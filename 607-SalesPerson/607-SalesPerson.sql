-- Last updated: 7/17/2026, 3:03:48 PM
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN
(
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);