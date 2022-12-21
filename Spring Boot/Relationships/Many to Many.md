#JAVA #SPRINGBOOT #RELATIONSHIPS

Example: *one book has more than one author and one author has more than one book*

**Author:**
![[Pasted image 20221221141516.png]]

**Book:**
![[Pasted image 20221221141556.png]]

The books property refers to authors inside Book, where the intermediate table is configured. The joinColumns is the proper id where it is configured and the inverseJoinColumns is the other.

**Result:**

![[Pasted image 20221221153239.png]]
![[Pasted image 20221221153221.png]]
![[Pasted image 20221221153231.png]]