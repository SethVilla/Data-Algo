# Binary Operators

### Take two operators:

* a+b or b\*a

### Three formats:

#### Infix:

operator between operands

* this is what humans use
* a + b or a \* b

#### Postfix:

the operator follows the operands

* ab+
* this is what computers prefer!

#### Prefix

operator precedes the operands

\+ab

### Convert Infix to Postfix

* Use two stacks: Postfix and Opstack
* to simplify we limit to only four operations:
  * addition, subtraction, multiplication, and division.
* We will use hierchy&#x20;
  * multiplication and division (same precedence)
  * addition and substraction
* token: any symbol in an expression
  * could be an operator, operand or value, or a parenthesis.

