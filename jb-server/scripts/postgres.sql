DROP TABLE products_to_attributes;
DROP TABLE products_to_categories;
DROP TABLE products_to_models;
DROP TABLE orders;
DROP TABLE products;

DROP TABLE attributes;
CREATE TABLE attributes(
  attribute_id SERIAL PRIMARY KEY NOT NULL,
  attribute_code TEXT,
  attribute_type TEXT,
  attribute_name TEXT,
  attribute_desc TEXT,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);

DROP TABLE categories;
CREATE TABLE categories(
  category_id SERIAL PRIMARY KEY NOT NULL,
  category_parent_id INT REFERENCES categories (category_id),
  category_type TEXT,
  category_code TEXT,
  category_name TEXT,
  category_desc TEXT,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);

DROP TABLE models;
CREATE TABLE models(
  model_id SERIAL PRIMARY KEY NOT NULL,
  model_name TEXT,
  model_type TEXT,
  model_code TEXT,
  model_desc TEXT,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);

DROP TABLE brands;
CREATE TABLE brands(
  brand_id SERIAL PRIMARY KEY NOT NULL,
  brand_name TEXT,
  brand_desc TEXT,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);


CREATE TABLE products(
  product_id SERIAL PRIMARY KEY NOT NULL,
  brand_id INT REFERENCES brands (brand_id),
  product_name TEXT NOT NULL,
  product_price DECIMAL,
  product_desc TEXT,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);


CREATE TABLE orders (
  order_id SERIAL PRIMARY KEY NOT NULL,
  product_id integer NOT NULL REFERENCES products (product_id),
  quantity integer,
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);


CREATE TABLE products_to_attributes(
  product_id INT NOT NULL REFERENCES products (product_id),
  attribute_id INT NOT NULL REFERENCES attributes (attribute_id),
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);


CREATE TABLE products_to_categories(
  product_id INT NOT NULL REFERENCES products (product_id),
  category_id INT NOT NULL REFERENCES categories (category_id),
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);


CREATE TABLE products_to_models(
  product_id INT NOT NULL REFERENCES products (product_id),
  model_id INT NOT NULL REFERENCES models (model_id),
  created_by INT,
  modified_by INT,
  created_date DATE,
  modified_date DATE
);




