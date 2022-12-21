#JAVA 

First, see [Basic Java](Basic%20Java.md). After that, see [this web](https://www.mygreatlearning.com/blog/data-structures-using-java/#types-of-data-structures-in-java).

![Pasted image 20221219184702.png](Pasted%20image%2020221219184702.png)

## Java List
There are two different types: 
- ArrayList
- LinkedList

It can be created as:
```java
List<T> list = Arrays.asList(1,2,3,4);
```

## Java ArrayList

The `ArrayList` class is a resizable array, which can be found in the `java.util` package.

The difference between a built-in array and an `ArrayList` in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an `ArrayList` whenever you want. The syntax is also slightly different:

```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

cars.add("Volvo");

cars.get(0);

cars.set(0, "Opel");

cars.remove(0);

cars.clear(); // remove all elements

cars.size();

Collections.sort(cars);  // Sort cars
```

## Java LinkedList

The `LinkedList` class is almost identical to the `ArrayList`:
```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```


## ArrayList vs. LinkedList

The `LinkedList` class is a collection which can contain many objects of the same type, just like the `ArrayList`.

The `LinkedList` class has all of the same methods as the `ArrayList` class because they both implement the `List` interface. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the `ArrayList` class and the `LinkedList` class can be used in the same way, they are built very differently.

### How the ArrayList works

The `ArrayList` class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

### How the LinkedList works

The `LinkedList` stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

### When To Use

Use an `ArrayList` for storing and accessing data, and `LinkedList` to manipulate data.


## LinkedList Methods

For many cases, the `ArrayList` is more efficient as it is common to need access to random items in the list, but the `LinkedList` provides several methods to do certain operations more efficiently:

| Method        | Description                                    |
| ------------- | ---------------------------------------------- |
| addFirst()    | Adds an item to the beginning of the list.     | 
| addLast()     | Add an item to the end of the list             |
| removeFirst() | Remove an item from the beginning of the list. |
| removeLast()  | Remove an item from the end of the list        |
| getFirst()    | Get the item at the beginning of the list      |
| getLast()     | Get the item at the end of the list            |


## Java HashMap

A `HashMap` store items in "**key**/**value**" pairs, and you can access them by an index of another type (e.g. a `String`).

One object is used as a key (index) to another object (value). It can store different types: `String` keys and `Integer` values, or the same type, like: `String` keys and `String` values:

```java
import java.util.HashMap; // import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();

capitalCities.put("England", "London");

capitalCities.get("England");

capitalCities.remove("England");

capitalCities.clear(); // remove all elements

capitalCities.size();

for (String i : capitalCities.values()) {
  System.out.println(i);
}

for (String i : capitalCities.keySet()) {
  System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
```

## Java HashSet

A HashSet is a collection of items where every item is unique, and it is found in the `java.util` package:

```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();

cars.add("Volvo");

cars.remove("Volvo");

cars.clear();

cars.size();
```

---
## **Linked List**

### **What is Linked List?**

Linked list data structure helps the required objects to be arranged in a linear order.

#### **Linked List Advantages**

-   Dynamic in size
-   No wastage as capacity and size is always equal
-   Easy insertion and deletion as 1 link manipulation is required
-   Efficient memory allocation

#### ****Linked List**** **Disadvantages**

-   If head Node is lost, the linked list is lost
-   No random access is possible

#### **Linked List** **Applications**

-   Suitable where memory is limited 
-   Suitable for applications that require frequent insertion and deletion

---

## **Stack**

### **What is a stack?**

A stack is a representation of nodes. There are two components to each node: data and next (storing address of next node). Each node’s data portion contains the assigned value, and its next pointer directs the user to the node that has the stack’s subsequent item. The highest node in the stack is referred to as the top. 

#### **Features of Stack**

-   Linear Data Structures using Java
-   Follows LIFO: Last In First Out
-   Only the top elements are available to be accessed
-   Insertion and deletion takes place from the top
-   Eg: a stack of plates, chairs, etc
-   4 major operations:
    -   push(ele) – used to insert element at top
    -   pop() – removes the top element from stack
    -   isEmpty() – returns true is stack is empty
    -   peek() – to get the top element of the stack
-   All operation works in constant time i.e, O(1)

#### **Stack Advantages**

-   Maintains data in a LIFO manner
-   The last element is readily available for use
-   All operations are of O(1) complexity

#### **Stack Disadvantages**

-   Manipulation is restricted to the top of the stack
-   Not much flexible

#### **Stack Applications**

-   Recursion
-   Parsing
-   Browser
-   Editors

---

## **Queue**

### **What is Queue?**

  
The queue is called an abstract data structure. Data is always added to one end (enqueued), and removed from the other (dequeue). Queue uses the First-In-First-Out approach and data item that was stored initially will be accessed first in a queue.

#### **Features of Queue**

-   Linear Data Structure
-   Follows FIFO: First In First Out
-   Insertion can take place from the rear end.
-   Deletion can take place from the front end.
-   Eg: queue at ticket counters, bus station
-   4 major operations:
    -   enqueue(ele) – used to insert element at top
    -   dequeue() – removes the top element from queue 
    -   peekfirst() – to get the first element of the queue 
    -   peeklast() – to get the last element of the queue 
-   All operation works in constant time i.e, O(1)

#### **Queue Advantages**

-   Maintains data in FIFO manner
-   Insertion from beginning and deletion from end takes O(1) time

#### **Queue Applications**

-   Scheduling
-   Maintaining playlist
-   Interrupt handling

**Variations in Queue:** Two popular variations of queues are **Circular queues** and **Dequeues.**

---

## **Binary Tree**

### **What is a Binary Tree?**

In a [binary tree](https://www.mygreatlearning.com/academy/learn-for-free/courses/binary-trees?gl_blog_id=17069), the branches of the tree are made up of up to two child nodes for each node. The left and right nodes are the common names for the two youngsters. Child nodes make references to their parents, whereas parent nodes are nodes with children.

**Features of Binary Tree**

-   Hierarchical  Data Structure
-   The topmost element is known as the root of the tree
-   Every Node can have at most 2 children in the binary tree
-   Can access elements randomly using index
-   Eg: File system hierarchy
-   Common traversal methods:
    -   preorder(root) : print-left-right
    -   postorder(root) : left-right-print 
    -   inorder(root) : left-print-right

#### **Binary Tree Advantages**

-   Can represent data with some relationship
-   Insertion and search are much more efficient

#### **Binary Tree Disadvantages**

-   Sorting is difficult
-   Not much flexible

#### **Binary Tree Applications**

-   File system hierarchy
-   Multiple variations of the binary tree have a wide variety of applications

---

## **Binary Search Tree**

### **What is a Binary Search Tree?**

The binary search tree is an advanced algorithm which is used to analyse the nodes, branches and many more. The BST was developed using the architecture of a fundamental binary search algorithm, allowing for quicker node lookups, insertions, and removals.  

**Features of Binary Search Tree**

-   A binary [tree](https://www.mygreatlearning.com/blog/understanding-trees-in-data-structures/) with the additional restriction
-   Restriction:
    -   The left child must always be less than the root node
    -   The right child must always be greater than the root node
-   Insertion, Deletion, Search is much more efficient than a binary tree

#### **Binary Search Tree** **Advantages**

-   Maintains order in elements
-   Can easily find the min and max Nodes in the tree
-   In order, traversal gives sorted elements

#### **Binary Search Tree** **Disadvantages**

-   Random access is not possible
-   Ordering adds complexity

#### **Binary Search Tree** **Applications**

-   Suitable for sorted hierarchical data

---


## **Heap**

-   Binary Heap can be visualized array as a complete binary tree
-   Arr[0] element will be treated as root
-   length(A) – size of array
-   heapSize(A) – size of heap
-   Generally used when we are dealing with minimum and maximum elements
-   For ith node

| (i-1)/2  | Parent      |
| -------- | ----------- |
| (2\*i)+1 | Left child  |
| (2\*i)+2 | Right Child |

#### **Heap** **Advantages**

-   Can be of 2 types: min heap and max heap
-   Min heap keeps the smallest element and top and max keep the largest 
-   O(1) for dealing with min or max elements

#### **Heap** **Disadvantages**

-   Random access is not possible
-   Only min or max element is available for accessibility

#### **Heap** **Applications**

-   Suitable for applications dealing with priority
-   Scheduling algorithm
-   caching

---

## **Hashing**

-   Uses special Hash function
-   A hash function maps an element to an address for storage
-   This provides constant-time access
-   Collision resolution techniques handle collision
-   Collision resolution technique
    -   Chaining
    -   Open Addressing

#### **Hashing** **Advantages**

-   The hash function helps in fetching elements in constant time
-   An efficient way to store elements

#### ****Hashing**** **Disadvantages**

-   Collision resolution increases complexity

#### ****Hashing**** **Applications**

-   Suitable for the application needs constant time fetching

---

## **Graph**

-   Basically it is a group of edges and vertices
-   Graph representation
    -   G(V, E); where V(G) represents a set of vertices and E(G) represents a set of edges
-   The graph can be directed or undirected
-   The graph can be connected or disjoint

#### **Graph** **Advantages**

-   finding connectivity
-   Shortest path
-   min cost to reach from 1 pt to other
-   Min spanning tree

#### **Graph Disadvantages**

-   Storing graph(Adjacency list and Adjacency matrix) can lead to complexities

#### **Graph Applications**

-   Suitable for a circuit network
-   Suitable for applications like Facebook, LinkedIn, etc
-   Medical science

---

