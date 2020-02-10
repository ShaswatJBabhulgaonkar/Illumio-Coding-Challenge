# Illumio-Coding-Challenge
## Shaswat J Babhulgaonkar

This repository consists of solution for Illumio Coding Challenge

### Testing

I used JUnit test for testing the basic functionality of the program. The code for testing is included in ```Runtest.java``` file. My test cases exercised various common cases and edge cases and passed the test successfully.

### Code Implementation

I was able to solve the problem statement in the given time limit. The implementation for my code is as below:

```Firewall.java``` is the main class with a constructor that takes in a file path for the input rules. It reads the ```input.csv``` file
line by line and creates a rule by leveraging the ```Rule.java``` and store the rule in a HashSet. ```Rule.java``` file takes in the 4 parameters of a CSV line and creates a rule based upon that. As the ```Port``` and
```IP``` have both the cases of a single unit and a range, the Rule needs to be modified accordingly. For this purpose ```Port.java```
and ```IpAddress.java``` is present which takes care of the above scenario. An equals method is present which checks whether two 
given rules are equal or not.

### Refinements

For the above implementation, I am iteraring through a set of rules every time. Inorder to check whether a given packet is valid or not, I would rather 
like to design a data structure where a certain rule corresponds to a specific value and a given packet can be matched against it in 
order to improve linear time complexity.

### Team Interest
I would be particularly interested in working with the Data team.
