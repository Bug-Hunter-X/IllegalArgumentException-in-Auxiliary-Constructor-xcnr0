# Scala Bug: IllegalArgumentException in Auxiliary Constructor

This repository demonstrates a common Scala bug involving `IllegalArgumentException` within an auxiliary constructor.  The bug arises from an improper check in a method that isn't properly handling the default value of a class parameter when using an auxiliary constructor.

The `bug.scala` file contains the erroneous code. The `bugSolution.scala` file provides a corrected version.

## Bug Description:

The `MyClass` class has an auxiliary constructor that initializes `x` to 0. The `myMethod` function throws an `IllegalArgumentException` if `x` is not greater than 10.  Since `x` defaults to 0, the exception is always thrown.

## Solution:

The solution involves either changing the default value of x in the auxiliary constructor or adding a check to handle values less than or equal to 10 in `myMethod` more gracefully.