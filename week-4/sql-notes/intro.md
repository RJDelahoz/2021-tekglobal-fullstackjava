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