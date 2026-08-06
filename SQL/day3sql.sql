INSERT INTO products (id, name, category, price, in_stock)
VALUES
(1, 'Laptop', 'Electronics', 65000, 'Yes'),
(2, 'Wireless Mouse', 'Electronics', 450, 'Yes'),
(3, 'Office Chair', 'Furniture', 3200, 'No'),
(4, 'Notebook', 'Stationery', 120, 'Yes'),
(5, 'Coffee Maker', 'Home Appliances', 2500, 'No'),
(6, 'Water Bottle', 'Kitchen', 350, 'Yes'),
(7, 'Smartphone', 'Electronics', 28000, 'Yes'),
(8, 'Table Lamp', 'Furniture', 1100, 'No');

SELECT DISTINCT category FROM products;

SELECT * FROM `products` WHERE in_stock = 'Yes' AND price < 500;

SELECT * FROM `products` WHERE in_stock = 'No' AND price > 1000;

SELECT name,price FROM `products` ORDER BY price DESC;

SELECT name,price*1.18 AS price_with_tax FROM `products`;