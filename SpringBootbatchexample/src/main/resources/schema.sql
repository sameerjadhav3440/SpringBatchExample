CREATE TABLE IF NOT EXISTS products
(
    productId varchar(200) primary key,
    title varchar(200),
    description varchar(200),
    price varchar(100),
    discount varchar(20),
    discounted_price varchar(10)
);