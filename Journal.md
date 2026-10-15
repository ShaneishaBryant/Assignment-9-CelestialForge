# Journal
Phase 1 Question

What did you accomplish in this phase? Why is it important to use a constructor to initialize the material field rather than setting it after the object is instantiated?

In this phase, I implemented a constructor that accepts a material string, assigns it to the instance field, and prints the startup message. 
Using a constructor for initialization ensures that the object is never created with missing data, requiring the value upfront to prevent errors down the line.



----------

Phase 2 Question

What happens if you try to create a DivineWeapon without calling the base class constructor? In your own words, explain why Java requires this?

If you try to create a subclass without calling the base class constructor, you will get a compiler error. Java requires the base class constructor to run first because a child object is still an instance of its parent class. The parent class must be fully initialized before the child can exist.  
