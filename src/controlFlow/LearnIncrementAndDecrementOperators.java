package controlFlow;

public class LearnIncrementAndDecrementOperators {

   // Increment and decrement operators can be placed before (prefix)
    // or after (postfix) the variable they apply to.
    // If you place an increment or decrement operator before its variable,
    // the operator is applied before the rest of the expression is evaluated.
    // If you place the operator after the variable, the operator is applied
    // after the expression is evaluated.

  //  For example:

    int a = 5;
    int b = 3;
    int c = a * b++;   // c is set to 15
    int d = a * ++b;   // d is set to 20
}
