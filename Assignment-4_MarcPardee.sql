/*  Marc Pardee
    u1273238
    IS6420-090 - Database Theory & Design
    Assignment $
    2019-10-19
*/

--1 List ID, Name, and Price for all products with price greater than the avg
SELECT DISTINCT  product_id, product_name, product_price FROM product WHERE product_price > (SELECT AVG(product_price) FROM product);

--2 For each product, list its ID and total quantity ordered. Products are listed in ascending order of product_id
SELECT product_id, SUM(quantity) as total_quantity FROM orderline GROUP BY product_id ORDER by product_id ASC;

--3 For each product, list its id and total quantity ordered. Products are listed in ascening order of total quantity order.
SELECT product_id, SUM(quantity) as total_quantity FROM orderline GROUP by product_id ORDER BY total_quantity ASC;

--4 For each product, list its ID, Name, and total quantity ordered. PRoducts are listed in ascending order of product_id 
SELECT orderline.product_id, product_name, SUM(quantity) as total_quantity FROM orderline, product 
WHERE orderline.product_id = product.product_id GROUP BY orderline.product_id, product_name ORDER BY orderline.product_id ASC;

--5 List name for all customers who have placed order(s). Each customer name appears exactly once. Customer names are sorted in ascending alphabetical order. Use equijoin for this query.
SELECT DISTINCT cust_name FROM customer, ordertable WHERE customer.cust_id = ordertable.cust_id ORDER by cust_name ASC;

--6 Implement query 5 using IN and subquery and add the requirement that the customers' orders have been placed after 23-OCT-2008
SELECT DISTINCT cust_name FROM customer WHERE cust_id IN (SELECT cust_id FROM ordertable WHERE order_date > '23-OCT-2008') ORDER BY cust_name ASC;

--7 For each city, list number of customers from that city who have placed order(s). Cities are listed in ascending alpha order. Use equijoin.
SELECT DISTINCT city, cust_name FROM customer, ordertable WHERE customer.cust_id = ordertable.cust_id ORDER BY city ASC;

--8 Repeat 7 but using natural join
SELECT DISTINCT city, cust_name FROM customer NATURAL JOIN ordertable ORDER BY city ASC;

--9 Repeat 7 but using IN and subqeury
SELECT DISTINCT city, cust_name FROM customer WHERE cust_id IN (SELECT cust_id FROM ordertable) ORDER BY city ASC;

--10 List ID for all products, which have NOT been ordered since 28-OCT-2008. Sort rsults by product_id in ASC order. Use Minus
SELECT product_id FROM orderline MINUS SELECT product_id FROM orderline NATURAL JOIN ordertable WHERE order_date >= '28-OCT-2008' ORDER BY product_id ASC;

--11 List ID for all AZ customers who have placed order(s) since 28-OCT-2008. Sort by cust_id ASC. Use intersect for this query
SELECT cust_id FROM ordertable WHERE order_date > '28-OCT-2008'
INTERSECT
SELECT cust_id FROM customer WHERE state = 'AZ' 
ORDER BY cust_id ASC;

--12 Implmeent 11 using IN and subquery
SELECT cust_id FROM ordertable WHERE cust_id IN (SELECT cust_id FROM customer WHERE state = 'AZ') AND order_date >'28-OCT-2008' ORDER BY cust_id ASC;

--13 List ID for all CA customers and all customers who have placed order(s) since 28-OCT-2008. Sort results by cust_id in ASC. Use Union
SELECT cust_id FROM customer WHERE state = 'CA'
UNION
SELECT cust_id FROM ordertable WHERE order_date > '28-OCT-2008'
ORDER BY cust_id ASC;

--14 List ID, Name and total quantity ordered for all products with total quantity ordered greater than 10
SELECT product_id, product_name, SUM(quantity) as total_quantity  FROM orderline NATURAL join product HAVING sum(quantity) > 10 GROUP BY product_id, product_name;

--15 List ID, Name, and total quantity ordered for all products with total quantity ordered greater than 6 and were ordered by UT customers
SELECT product.product_id, product_name, SUM(quantity) as total_quantity FROM orderline, product, customer, ordertable 
WHERE customer.cust_id = ordertable.cust_id AND product.product_id = orderline.product_id AND orderline.order_id = ordertable.order_id
AND state = 'UT'
HAVING sum(quantity) > 6 GROUP BY product.product_id, product_name;