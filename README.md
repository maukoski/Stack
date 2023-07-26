Stack Implementation in Java
This repository contains a basic implementation of a Stack in Java.

Project Description
A stack is a data structure that allows adding and removing elements in a particular order. Every time an element is added, it goes to the top of the stack. Every time an element is removed, it is always the one on the top of the stack. This is what makes the stack a LIFO (Last In First Out) data structure.

In this particular implementation, the Stack is represented as an array of integers. This implementation includes all of the standard stack operations:

push(int valor): Inserts a new integer onto the top of the stack.
pop(): Removes and returns the integer at the top of the stack.
printStack(): Prints all the elements in the stack.
printTop(): Prints the top element of the stack.
Additionally, this implementation includes error checking for common issues like pushing onto a full stack, and popping from an empty stack.

Project Structure
This project is structured into the following classes:

Stack.java: This is the main class which contains the Stack implementation.
The src directory contains all the source code for this project, and the test directory contains the associated unit tests.

Usage
To use this project, you would need to instantiate the Stack class, like so:

java
Copy code
Stack stack = new Stack(5);  // Creates a Stack of size 5.
Once you have a Stack instance, you can perform operations like push, pop, printStack, and printTop on it.

Running Tests
Unit tests are written using JUnit 4 and can be run as usual through your IDE or build system.

License
This project is licensed under the MIT License - see the LICENSE file for details.
