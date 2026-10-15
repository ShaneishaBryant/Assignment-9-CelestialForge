# Journal
Phase 1 Question

What did you accomplish in this phase? Why is it important to use a constructor to initialize the material field rather than setting it after the object is instantiated?

In this phase, I implemented a constructor that accepts a material string, assigns it to the instance field, and prints the startup message. 
Using a constructor for initialization ensures that the object is never created with missing data, requiring the value upfront to prevent errors down the line.



----------

Phase 2 Question

What happens if you try to create a DivineWeapon without calling the base class constructor? In your own words, explain why Java requires this?

If you try to create a subclass without calling the base class constructor, you will get a compiler error. Java requires the base class constructor to run first because a child object is still an instance of its parent class. The parent class must be fully initialized before the child can exist.  



----------


Phase 3 Question

How does using this() to call another constructor help you if you decide to change the default essence type in the future?

If you decide to change the default essence type in the future, using this() means you only have to update it in one place.


----------


Phase 4 Question

What bugs or unexpected behaviors did you catch while testing? If you used an AI tutor, what did it suggest regarding your constructor logic, and did you make any changes?

I did not encounter any unexpected behavior while testing, as the program worked correctly and met my expectations.

When I reviewed my code, Gemini confirmed that my constructor logic followed proper Java object-oriented principles and required no changes. 
However, it did recommend making the fields final for immutability and adding a toString() method for cleaner object representation. I chose to keep my current implementation since the program is running as expected.