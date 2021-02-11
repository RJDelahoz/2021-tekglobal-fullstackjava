# Collections

---

## Array

-   An array is an ordered collection of values.
-   Each value is called an element, and each element has a numeric position in the array, known as its index.
-   **JS arrays are untypes, meaning an array element may be of any type, and different elements of the same array may be of different types.**
-   Zero-based indices and 32-bit
    -   first index is 0
    -   Max size: (2^32)-1
-   **JS arrays are dynamic: grow and shrink as needed.**
-   Maybe sparse
-   Every JS array has a length property. For non-sparse arrays, this property specifies the number of elements in the array. For sparse arrays, length is larger than the index of all elements.

```javascript
var arr = []; //Empty array
var primes = [2, 3, 5, 7, 11]; //Array with 5 elements
var mix = [1.1, true, "a"];

//Can also initialized with variables
var n = 1024;
var arr = [n + 1, n + 2, n + 3];

//Arrays can also contain objects
var mix_of_types = [{ key1: value1 }, { key2: value2 }];
Access: mix_of_types[index]["key1"];
```

## Objects

-   JS's fundamental data type is the object.
-   JS obj are dynamic-properties can usuallt be added and deleted but they can be used to simulate the static objects and "structs" of statically typed languages. They can also be used (by ignoring the value part of the string-to-value mapping) to represent sets of strings.
-   Any value in JS that is not a string, number, true, false, null, or undefined is an object.
-   The easiest way to create an object is to include an object literal in your JS code.

```javascript
var book = {
	"main title": "JavaScript",
	"sub-title": "The Definitive Guide",
	for: "all audiences",
	author: {
		firstname: "David",
		surname: "Flanagan",
	},
};
```

## Prototypes

-   Every JS obj has a second JS obj associated with it. This second obj is known as a _prototype_, and the first obj inherits properties from the prototype.
-   All obj created by obj literals have the same prototype object, and we can refer to this prototype object in JS code as Object.prototype.
-   Obj created using the new keyword and a constructor invocation use the value of the prototype property of the constructor function as thier prototy. So the obj created by new Object() inherits from Object.prototype jus as the objexcct created by {} does. Similarly, the object created by new Array() uses Array.prototype as its prototype, and the object created by new Date() uses Date.prototype as its prototype.