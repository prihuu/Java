Calculator

Program description:

This project contains a simple calculator written in Java. The calculator can add positive integers, display the current result, and reset its value to zero.

If the user tries to add a negative number, the program throws an `IllegalArgumentException`.

Calculator.java

```java
public class Calculator {

    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must not be negative");
        }
        result += number;
    }

    public int getValue() {
        return result;
    }

    public void reset() {
        result = 0;
    }
}
```

Explanation of the code

The Calculator class stores its current value in a private integer variable called `result`. The variable is private so that it cannot be changed directly from outside the class.

The constructor initializes the calculator with a value of zero when a new Calculator object is created.

The `add()` method adds a positive integer to the current result. Before adding the number, it checks whether the input is negative. If the number is negative, the method throws an `IllegalArgumentException`. Otherwise, the number is added to the result.

The `getValue()` method returns the current value of the calculator.

The `reset()` method sets the result back to zero allowing the calculator to start a new calculation.

## Use of GitHub Copilot

GitHub Copilot was used to generate an explanation of the Calculator class and its methods. It helped describe the purpose of the variables, constructor, and methods.

After Copilot generated the explanation I edited the text to make it easier to read and understand. I also checked that the explanation matched the actual Java code.