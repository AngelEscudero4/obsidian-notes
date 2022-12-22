#JAVA #SPRINGBOOT #BEAN_ANNOTATION

When we have different implementations we need to specify which to use with `@Qualifier`. However, we can set one as primary  with `@Primary`and use always that impl. 

![[Pasted image 20221222095141.png]]

With that, the controller will use the @Primary impl:

![[Pasted image 20221222095222.png]]