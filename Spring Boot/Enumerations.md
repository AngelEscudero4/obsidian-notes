#JAVA #SPRINGBOOT 

![[Pasted image 20221222131343.png]]

![[Pasted image 20221222131404.png]]

The difference between `ORDINAL` and `STRING` is how it is persisted in the database. The default value is **ORDINAL**. The unique problem of use ordinal is that you cannot change the order of values and if you add more values then they will be at the end of the enum. If it is saved as String, it does not matter the order but it needs more space in the database.