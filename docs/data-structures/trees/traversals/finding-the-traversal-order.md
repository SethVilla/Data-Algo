# Finding the Traversal order

• One way to find the traversal is by drawing a trace-line.

• Start at the root node and draw a line counterclockwise around all nodes.

• Follow the trace line and process the node when the line touches it on the left, bottom, or right side, depending on the kind of traversal:

* preorder processes a node when it is first reached- when the line is on the left of the node
  * In a diagram the left of the node is reached
* inorder processes a node when it is reached the second time- when the line is on the bottom of the node
  * in a diagram the bottom of the node is reached
* postorder processes a node when it is reached the third (and final) time- when the line is on the right of the node
  * in a diagram the right of the node is reached
