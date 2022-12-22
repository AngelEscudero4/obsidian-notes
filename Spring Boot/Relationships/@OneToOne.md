#JAVA #SPRINGBOOT #RELATIONSHIPS 

Example: *One author lives in one house*

**Author:**
![[Pasted image 20221222125603.png]]

**House:**
![[Pasted image 20221222125614.png]]
**Result:**
![[Pasted image 20221222125646.png]]

Put both `@OneToOne` makes the relationship bidirectional.

"There will be one new column in the table who has the `@OneToOne` annotation".

For example, if I delete the Author from House.java the result will be:
![[Pasted image 20221222125953.png]]

`cascade` is used to configure for when deleting the author, then delete the house 