#TDD 

Test Data Builders help us to build scenarios for our tests. Scenarios are usually the hardest part to write: they usually require many lines of code, need to be reused in other tests, and are easy to break.

When we have a complicated class and we need to test it we create a builder just for testing it. With that, we can hide object details and if this object changes only change the builder.

![Pasted image 20221219130852.png](images/Pasted%20image%2020221219130852.png)

![Pasted image 20221219130835.png](images/Pasted%20image%2020221219130835.png)

For example, if tomorrow they add a date in the Basket constructor, we can change it in the builder without affecting our tests:

![Pasted image 20221219131225.png](images/Pasted%20image%2020221219131225.png)