# Stacks

* Abstract Data structure
* Essentially a list you can only add and remove from the front
  * First in - Last out (FILO)
  * Last in - First out (LIFO)
* Insertion Chronological order
* Remove is reverse chronological order

{% hint style="warning" %}
You cannot directly access elements in the middle or at the end-only at the front
{% endhint %}

Common uses of stacks

* Java runtime stack
* checking balanced parenthesis
* converting infix expressions to postfix expressions
* Evaluating postfix expressions
* Evaluating infix expressions (by converting to postfix and then evaluating)
* Replacing recursion
* Reversing data

### Runtime Stack

**Program counter** refers to the current instruction

**Activation record (Frame)** object is created and pushed, contains local variables and current instruction.

When the method above completes the activation record is popped, the new top program counter is used to resume the next instruction.

When recursion is used, the same method is pushed to the stack over and over again.
