 Java programs to implement OOP concepts.
 
 1.Program to add two numbers and display the result using an object.   [Class and Object] 
 
 2.Program to set a value and retrieve that value using methods.  [Encapsulation]
 
 3.Program to implement the following hierarchy.  [Inheritance]
              A
            /   \
           B     C
          /
         D
      
            Instance Variable     Instance Method
     A =>       a                   printValue()
     B =>       b                   printValue()
     C =>       c                   printValue()
     D =>       d                   printValue()
     
 4.Create two classes: Parent and Child.  [Polymorphism]
   Overload ping() in Child.
   Override display().
   Also implement upcasting during instantiation.
   
  5.Program to implement the following hierarchy.   [Abstraction]
  
            Smartphone(abstract class)                  Smartphone(abstract class)         Phone(interface)
             [ Abstract: os() , camera() ]              [ Abstract: os() , camera() ]      [ call() ,message() ]
             [ Concrete: display() ]                    [ Concrete: display() ]                   /      
                    |                                           \                               /                      
                    |                                             \                           /                        
                    |                                               \                       /
                    |                                                 \                   /         
                 Samsung                                                \               /
                                                                          \           /
                                                                            \       /                               
                                                                              Apple
                                                                      
