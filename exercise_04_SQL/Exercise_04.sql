-- DROP TABLE IF EXISTS ""name_table";

SELECT *
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id

SELECT *
FROM department
    join employees on department.id = employees.department_id
    JOIN executor on employees.id = executor.tab_no
    JOIN contract on executor.contract_id = contract.id
    JOIN customer on contract.customer_id = customer.id

-- Найти информацию о всех контрактах, связанных с сотрудниками департамента «Logistic».
-- Вывести: contract_id, employee_name
SELECT contract.id, employees.name
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
WHERE department.name = 'Logistic'

SELECT contract.id, employees.name
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
WHERE department.name = (SELECT name
from department
WHERE name = 'Logistic')

-- Найти среднюю стоимость контрактов, заключенных сотрудников Ivan Ivanov.
-- Вывести: среднее значение amount
SELECT AVG(contract.amount), employees.name
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
WHERE employees.name = 'Ivan Ivanov'

--	Найти самую часто встречающуюся локации среди всех заказчиков.
-- Вывести: location, count
SELECT location, COUNT(location)
FROM customer
group by location

SELECT location, COUNT(location)
FROM customer
group by location
HAVING COUNT(location) =
(SELECT COUNT(location)
FROM customer
group by location
ORDER BY  COUNT(location)
DESC
limit 1)

 -- Найти контракты одинаковой стоимости.
 -- Вывести count, amount
 SELECT amount
, COUNT
(amount) FROM contract c 
 GROUP BY amount 
 HAVING COUNT
(amount) > 1

-- Найти заказчика с наименьшей средней стоимостью контрактов.
-- Вывести customer_name, среднее значение amount
SELECT customer.customer_name , ROUND(AVG(contract.amount), 0)
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
group BY customer.customer_name
HAVING AVG(contract.amount) =
(SELECT AVG(contract.amount)
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
group BY customer.customer_name
ORDER BY  AVG(contract.amount)
limit 1)

-- Найти отдел, заключивший контрактов на наибольшую сумму.
-- Вывести: department_name, sum
SELECT department.name , SUM(contract.amount) 
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
GROUP BY department.name
HAVING SUM(contract.amount) =
(SELECT SUM(contract.amount) 
FROM customer
    join contract on customer.id  = contract.customer_id
    join executor on contract.id = executor.contract_id
    join employees on executor.tab_no = employees.id
    JOIN department on employees.department_id = department.id
GROUP BY department.name
ORDER by SUM(contract.amount) DESC 
limit 1)