# SQL

---

## Structured Query Language

-   SQL is a lang for
    -   Organizing info
    -   Storing and updating info
    -   Accessing info
    -   Protecting info

## RDMS

-   Relational Database Manament Systems provide capabilities for managing large collections of (electronic) info.

## ACID

-   Atomicity
    > Refers to the integrity of the entire database transaction, not just a component of it. In other words, if one part of a transaction doesn't work like it's supposed
-   Consistency
    > For any database to operate as it’s intended to operate, it must follow the appropriate data validation rules. Thus, consistency means that only data which follows those rules is permitted to be written to the database.
-   Isolation
    > It’s safe to say that at any given time on Amazon, there is far more than one transaction occurring on the platform. In fact, an incredibly huge amount of database transactions are occurring simultaneously. For a database, isolation refers to the ability to concurrently process multiple transactions in a way that one does not affect another.
-   Durability
    > All technology fails from time to time… the goal is to make those failures invisible to the end-user. In databases that possess durability, data is saved once a transaction is completed, even if a power outage or system failure occurs.

## Data Models

-   A data model is a representation of a real-world situation about which data is to be collected and stored in a database.
-   A data model defines the dataflow and logical relationships among data elements.

### Types of Data Models

-   Entity-Relationship Model
-   Network Model
-   Hierarchical Model
-   Relational Model

## DB

-   Table
    -   Primary unit of data-storage within a database. Tables are two-dimensional, composed of rows and columns.
-   Record
    -   A row of data from a table. The record consists of related fields.
-   Column
    -   A vertical unit of a table. Each column has a name, a datatype, and zero or more constraints.
-   Field
    -   A single data item from a table. A field has a datatype defined by its column definition.

## Normalization

_Minimize redundancy and simplify maintenance of data_

-   Normalization is the process of organizing fields and tables of a relational database to minimize redundancy and dependencies.
-   Normalization usually involves divinding wide tables into thinner and less redundant tables by defining relationships between them.
-   The approach is to isolate data so that additions, deletions and modifications of a field can be made in just one table and then propagate through the rest of the database via defined relationships.
-   The concept of normalization was introduced in 1970 by Edgar F. Cod: First
    Normal Form.
-   Codd defined the second and third normal forms in 1971 and 1974.
-   A "normalized" database is in 3NF. Most 3NF tables are free of insertion,
    deletion, and update anomalies.

### 1NF

-   Eliminate repeating groups in individual tables.
-   Create a seperate table for each set of related data.
-   Identify each set of releated data with a primary.

### 2NF

-   It's in normal form.
-   All non-key attributes are fully functionally dependent on the primary key.

### 3NF

-   A transitive dependenct occurs when one attribute depends on a second attribute, which depends on a third attribute. Deletions in such a table can cause an unwanted loss of data.
-   A relation in 3NF is a relation in 2NF with no transitive dependencies.

## ANSI

-   A private non-profit organization responsible for development of
    voluntary standards for products, services, systems and personnel
    in the United States.
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
ROLLBACK; -- Acidentally KO'd a legendary pokemon...restart game

SELECT count(*)
    FROM employees;	-- returns 23
```
*Other users will not see changes until we commit the transaction.*

## DDL

-   A DBMS maintains multiple systems aand user databases. A "database" om this context is unique container for tables.
```SQL
CREATE DATABASE databaseName;
```
