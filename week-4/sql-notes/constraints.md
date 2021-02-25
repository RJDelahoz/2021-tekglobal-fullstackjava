# Data Integrity and Constraints

---

## Data

*Designing a database with well-chosen constraints on data relationships and values is the best means for maximizing this value.*

>Databases are intended to accrue information over long periods of time. In many cases, the data becomes increasingly valuable as it contains hidden trends and associations which are not evident in the short-term.

## Integrity Constraints

-   Entity Integrity
    -   primary keys
    -   unique constraints
-   Referential Integrity
    -   foreign key constraints
-   Domain Integrity
    -   data types
    -   NOT NULL constraints
    -   defaults
-   User-defined Integrity
    -   check constraints
    -   triggers

### Entity Integrity

Entity Integrity requires that each row of a table, representing a unique “entity”, can be uniquely identified. It is enforced using primary key constraints.

```SQL
/* first-level syntax */
CREATE TABLE tablename(
    id INT PRIMARY KEY,
    ...
);

/* table-level syntax */
CREATE TABLE tablename(
    id INT,
    ...,
    CONSTRAINT pk_tablename PRIMARY KEY(id)
);
```

>Primary keys can be INSERTed. If an attempt is made to insert a non-unique or a NULL key value, the database will generate a primary key constraint violation and the insert will fail. For bulk insert operations, key constraint checking can be temporarily disabled to improve performance of individual inserts. If any insert violates the primary key constraint, an error is generated when the constraint checks are re-enabled. 

Databases provide mechanisms for generating integer primary keys, though these mechanisms are not standardized.

```SQL
-- SQL SERVER
CREATE TABLE tablename(
    id INT IDENTITY(1, 1);
);

-- MariaDB
CREATE TABLE tablename(
    id INT AUTO_INCREMENT;
)
```

Oracle provides for either an IDENTITY or the use of a GENERATOR and a trigger.

>With these mechanisms defined on a table, INSERT statements can either omit the key or provide a NULL value to be replaced with the generated value.

A field created with the UNIQUE constraint resembles a primary key – all values for that field must be unique – no duplicates allowed

```SQL
CREATE TABLE tablename(
    field DATATYPE UNIQUE;
);
```

>Like primary keys, a UNIQUE constraint can apply to compound fields, meaning that each combination of those fields must be unique. Unlike primary keys, NULL is allowed.

## Referential Integrity

Referential integrity is about enforcing the relationships defined between tables. This is done with foreign key constraints.

```SQL
CREATE TABLE tablename(
    ...,
    fieldname DATATYPE,
    CONSTRAINT fk_parentTable FOREIGN KEY(fieldname)
        REFERENCES parentTable(id)
);
```

Foreign key constraint defined at the table level. The constraint keyword+identifier is optional, but the identifier (if present) must be unique in the database.

Foreign key constraints are enforced for all DML statements – INSERT, UPDATE and
DELETE. When a foreign key is inserted or updated to a non-null value, the database ensures that the related primary key value actually exists in the referenced table.
*When a primary key with associated foreign key(s) is deleted, the database will take actions depending on how that foreign key was defined.*

**DELETING A PRIMARY KEY THAT HAS A CHILD FOREIGN KEY**
```SQL
CREATE TABLE tablename(
    ...,
    fieldname DATATYPE,
    constraint fk_childTable_parentTable FOREIGN KEY(fieldname)
        REFERENCES parentTable(id) [ON DELETE CASCADE | SET NULL | SET DEFAULT| NO ACTION]
);
```