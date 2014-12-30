effectiveJava
=============

examples from effective java se book 



Builder pattern
---------------

*Item 2: Consider a builder when faced with many constructor 
parameters*

-  the telescoping constructor pattern works, but it is hard to write
client code when there are many parameters, and harder still to read it

-  The Builder pat-tern simulates named optional parameters 

- Class.newInstance breaks compile-time exception checking

- the Builder pattern is a good choice when designing classes whose  constructors  or  
static factories  would  have  more  than  a  handful  of parameters
