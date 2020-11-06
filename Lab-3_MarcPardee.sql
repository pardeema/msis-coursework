/*  Marc Pardee
    u1273238
    IS6420-090 - Database Theory & Design
    Lab 3 
    2019-10-19
*/
-- Guided Exercise

--1. List IDs of products that have been ordered. One ID appears exactly one time; order procut IDs in ascending order
SELECT DISTINCT product.product_id FROM product, orderline WHERE product.product_id=orderline.product_id ORDER BY product_id ASC;

--2. List IDs of customers that have placed orders after 27-OCT-2008. One ID apperas exactly one time; order customer IDs in ascending order
SELECT DISTINCT cust_id FROM ordertable  WHERE order_date > '27-OCT-2008' ORDER BY cust_id ASC; 

--3. List al customers who are from SLC and whose first name start with letter J
SELECT cust_name FROM customer WHERE (city = 'SLC' AND cust_name LIKE 'J%' ); 

--4. List product name, product price and product price after 10% discount
SELECT product_name, product_price, (product_price * 0.9) as price_off FROM product;

--5. List the number of products with price higher than 100 (Answer is 2)
SELECT COUNT(*) as p_over_100 FROM product WHERE product_price > 100;

--6. List name and price for all products that have been pruchased in order 1001. Using IN to implement.
SELECT product_name, product_price FROM product WHERE product_id IN (SELECT product_id FROM orderline WHERE order_id = 1001);

--7. Using Equijoin to implement query 6
SELECT product_name, product_price FROM product, orderline WHERE product.product_id = orderline.product_id AND orderline.order_id = 1001;

--8. Using natural join to implement query 6
SELECT product_name, product_price FROM product NATURAL JOIN orderline WHERE order_id = 1001;

--9. List total quantity ordered for each order
SELECT order_id, SUM(quantity) as total_ordered FROM orderline GROUP BY (order_id) ORDER BY total_ordered DESC;

--10. List total dollar amount ordered for each order, where for each product ordered its amount equals to quantity times price
SELECT order_id, SUM((quantity * product_price)) as total_cost FROM orderline, product 
    WHERE product.product_id = orderline.product_id 
    GROUP BY (order_id)
    ORDER BY total_cost DESC;
    
-- Challenge Exercise - Part 1

--1. Select all rows from the customer table, but add a column called IS_PLACED_ORDER where 1 indicates customers who have placed at least one order and 0 indicates customers who have not placed any orders

SELECT customer.*, 
CASE WHEN customer.cust_id = ordertable.cust_id THEN 1
ELSE 0
END AS IS_PLACED_ORDER
FROM customer, ordertable;

--2. Remove Customer Tom Borg from DB
DELETE FROM customer WHERE cust_name='Tom Borg';

--3. Remove customer Carl Smith from database using only three (3) separate delete staements none of which can include his cust_id
DELETE FROM orderline WHERE order_id IN (SELECT order_id FROM ordertable WHERE cust_id IN (SELECT cust_id FROM customer WHERE cust_name = 'Carl Smith'));
DELETE FROM ordertable WHERE cust_id IN (SELECT cust_id FROM customer WHERE cust_name = 'Carl Smith');
DELETE FROM customer WHERE cust_name = 'Carl Smith';

-- Challenge Exercise – Part 2

--1. Delete the customer John Doe from the customer table, followed by his ordertable records, followed by his orderline records.
ALTER TABLE ordertable DROP CONSTRAINT order_fk;
ALTER TABLE orderline DROP CONSTRAINT orderline_fk1;
DELETE FROM customer where cust_name='John Doe' ;
DELETE FROM ordertable WHERE cust_id = 1;
DELETE FROM orderline WHERE order_id = 1001 OR order_id= 1010;

--2. Readd any constraints that were dropped
ALTER TABLE orderline ADD CONSTRAINT orderline_fk1 FOREIGN KEY (order_id) REFERENCES ordertable (order_id);
ALTER TABLE ordertable ADD CONSTRAINT order_fk FOREIGN KEY (cust_id) REFERENCES customer (cust_id);