# SQL

---

## ANSI

-   A private non-profit organization responsible for development
    of voluntary standards for products, services, systems and personnel in the United States.
-   SQL was adopted an an ANSI standard in 1986 as SQL-86, and as
    a an International Organization for Standardization (ISO) in 1987.

### Why standardize?

-   Without a standard, each vendor would develop their own syntax
    (Babel).
-   Portability
-   Consistency
-   Monopoly Avoidance

## Sub-Languages

-   DATA DEFINITION LANGUAGE (DDL)
-   DATA MODIFICATION LANGUAGE (DML)
-   DATA QUERY LANGUAGE (DQL)
-   TRANSACTION CONTROL LANGUAGE (TCL)
-   DATA CONTROL LANGUAGE (DCL)

---

## DQL

*Selection of specific columns from a table is termed as a projection operation in relational algebra.*

```SQL
/* select structure */
SELECT
    [ALL | DISTINCT | DISTINCTROW ]
    select_expr [, select_expr ...]
    [FROM table_references
    [WHERE where_condition]
    [GROUP BY {col_name | expr | position}
    [HAVING where_condition]
    [ORDER BY {col_name | expr | position} [ASC |DESC], ...]
    [LIMIT {[offset,] row_count | row_count OFFSET offset}]
```

**IMPORTANT**

-   SELECT clause specifies columns to retrieve
-   FROM clause specifies table(s) from which to retrieve
-   WHERE clause filters rows to retrieve
-   GROUP BY clause specifies how to group results
-   HAVING clause selects among groups
-   ORDER BY clause specifies the row ordering

---

## DML

```SQL
/* insert structure */
INSERT [into] tablename [(col1, col2, …)]
    VALUES ({expr | DEFAULT}, …);

INSERT [into] tablename
    SELECT ...
        FROM tablename
    WHERE condition;

/* update structure */
/* The WHERE clause is important in UPDATE statements. If omitted, fields of ALL rows will be updated with the given value(s).*/
UPDATE tablename
    SET expr
    WHERE condition;

/* delete structure */
/* This statement permanently deletes entire records matching criteria given in the WHERE clause. If the WHERE clause is omitted, it will delete all rows*/

DELETE
    FROM tablename
    WHERE condition;

TRUNCATE tablename;

/* Delete is a DML command whereas truncate is DDL command. Truncate can be used to delete the entire data of the table without maintaining the integrity of the table.
On the other hand , delete statement can be used for deleting the specific data. With delete command we can’t bypass the integrity enforcing mechanisms. */
```

---

## TCL

-   When 2 or more DML statements execute, the DB can ensure that either all succeed or all fail.
-   When all statements "fail", the DB remains unchanged from its initial state.
-   This done using transactions.

```SQL
START transaction;
...[one or more DML statements]
rollback; 
-- or
commit;
```
**START** begins transaction

**ROLLBACK** is usually executed within a procedure's exception handler.

**COMMIT** is issued after all statements successfully executed.

*Think of these like save points in video games.*

```SQL
SELECT count(*) 
    FROM employees; -- returns 23 

START transaction; -- the line before is the save point
DELETE FROM employees
WHERE employeeNumber = 28; -- one row deleted
SELECT count(*)
    FROM employees; -- returns 22;
ROLLBACK; -- Accidentally KO'd a legendary pokemon...restart game

SELECT count(*)
    FROM employees;	-- returns 23
```
*Other users will not see changes until we commit the transaction.*

---

## DDL

-   A DBMS maintains multiple systems aand user databases. A "database" in this context is unique container for tables.
```SQL
CREATE DATABASE databaseName;
```

-   Table definitions define the table name, the fields within the
table, and constraints/relationships for the fields.
```SQL
CREATE TABLE tablename (
    fieldname datatype,
    ...
);
``` 

-   ALTER TABLE allows us to change an existing table.
    -   ADD  
        -   new column     
        -   a constraint
    -   DROP
        -   existing column
        -   existing constraint
    -   MODIFY
        -   existing column
```SQL
ALTER TABLE tablename 
[ADD | DROP | MODIFY] [CONSTRAINT] columnName;

RENAME TABLE tablename TO new_tablename;
```

-   DROP TABLE removes the table definition **and** data.
*requires drop privilege*
```SQL
DROP TABLE tablename [RESTRICT | CASCADE]; -- DEF restrict
```

---

## DCL

-   DCL allows us to create users with more or less limited roles.
-   Users are added using create user.
-   Privileges are added using grant.
-   Privileges are removed using revoke.
-   Users are removed by drop user

```SQL
CREATE USER username IDENTIFIED BY 'password';

GRANT [SELECT | UPDATE | INSERT] ON *.* TO 'username';

REVOKE [SELECT | UPDATE | INSERT] ON *.* FROM 'username';

alter table employees drop constraint constraint_name;
```