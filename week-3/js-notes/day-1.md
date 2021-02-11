# JavaScript

---

## JS

-   Javascript was created to make webpages more dynamic
-   Programs in js are called scripts. They can be written right in the HTML and Execute automatically as the page loads or in response to events.
-   Scripts are provided and executed as a plain text. they don't need special preperation or a compiler to run.

## Capabilities

-   Considered a safe programming lang. It does not rprovide low-level access to memory or CPU.
-   Greatly depends on the environment that runs JS.
    -   For instance, Node.JS supports functions that allow JavaScript to read/write aribitrary files, perform network request etc.
-   in-browser JS can do everything related to web page manipulation, interation with the user and the webserver.
-   Examples of capabilities
    -   Add new HTML to the page, change the existing content, moddify styles.
    -   React to user actions.
    -   Send requests over the network to remote servers.
    -   Get and set cookies.
    -   Remember that data on the client-side.
-   JS abilities in the browser are limited for the sake of user saftey. The aim is prevent an evil web-page from accessing private information or harming the user's data.

## Data Types

-   Numbers
    -   **integer**
    -   **float**
-   **String**
    -   sequence of chars, including space, enclosed in double, single quotes, or grave accent.
-   **Boolean**
    -   true or false values
-   **Null**
    -   Does not belong to any data type named above.
    -   Its purpose is to indicate that there is no value.
-   **Undefined**
    -   used to indicate that a variable has not been assigned a value, not even null.
-   **Objects**
    -   are used to store collentions of data of any type mentioned above and more complex entities.

## Console.log()

-   Console obj provides access to the browsers debugging console.
-   Console obj can be accessed from any global obj. (_think Object class in java_)
-   log() is a method of the console object which allows

## Comparison Operators

-   **>**
    -   Strictly greater than.
-   **<**
    -   Strictly less than.
-   **>=**
    -   Greater than or equal to.
-   **<=**
    -   Less than or equal to
-   **==**
    -   Equal to
-   **!=**
    -   Not equal to
-   **=== vs ==**
    -   === also checks for type equality.

## Increment and Decrement

```javascript
var num = 7;
var curr = num++;
curr; //7, but why?
```

-   When **var curr = num++;** is excuted the num var will return its current number which is 7 and then increment its value so that curr = 7
    and num = 8.

```javascript
var num = 7;
var curr = ++num;
curr; //8
```

## Declaring Variables with 'new'

-   When declaring variables, it is best practice to set an initial value as starting point to let JS know the type of this variable.

```javascript
var str = new String();
var bool = new Boolean();
var num = new Number();
```

-   The 'new' keyword creates a copy of the object to your variable. This copy would already have initial values to its properties and 0 for numbers, empty quotes for String and false for Boolean.

## Control Statement

### Conditionals

```javascript
// if statement
if (CONDITION) {
	//do something
}

// if else
if (CONDITION) {
	//do something
} else {
	///do something else
}

// if else if
if (CONDITION_1) {
	//do something
} else if (CONDITION_2) {
	//do something else
}
```

```javascript
switch (CONDITION) {
	case a:
	//do something
	case b:
	//do something
	case c:
	//do something
	default:
	//do something by default
}
```

### Loops

```javascript
while (CONDITION) {
	//do something
}
```

```javascript
for(INITIAL VALUE; CONDITION; MOVE TO THRESHHOLD) {
    //do something
}

//infinite for loop
for( ; ; ) {
    //do something
}
```

```javascript
do{
    //do something once before condition
} while (CONDITION) 
```
