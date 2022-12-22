#JAVA #SPRINGBOOT #GOOD_PRACTICES 

When we work with a bidirectional relationship, we need to save each object in each side of the relationship. For example, if we have Recipe and Note, we need to set inside the Recipe the Note and inside the Note the Recipe, so that it can cause inconsistency problems. For avoiding that, we can change the set function to just update it automatically.

![[Pasted image 20221222134902.png]]