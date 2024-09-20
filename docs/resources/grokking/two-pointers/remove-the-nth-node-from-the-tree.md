# Remove the nth node from the tree

```
import LinkedList from "./linked_list.js";
import LinkedListNode from "./linked_list_node.js";

function removeNthLastNode(head, n) {
  
    let slow = head;
    let fast = head;
    let prevNode = null;

    for (let i = 1; i <= n;i++) {
      fast = fast.next;
    }
    
    while (fast != null) {
      prevNode = slow;
      slow = slow.next
      fast = fast.next;
    }
    
    if (!prevNode) {
      head = head.next;
    } else {
      prevNode.next = prevNode.next.next;
    }
    
    // Replace this placeholder return statement with your code
    return head;  
}

export { removeNthLastNode };
```

```
import printListWithForwardArrow from "./print_list";
import LinkedList from "./linked_list";

function removeNthLastNode(head, n) {
    let right = head;
    let left = head;

    for (let i = 0; i < n; i++) {
        right = right.next;
    }

    if (!right) {
        return head.next;
    }

    while (right.next != null) {
        right = right.next;
        left = left.next;
    }

    left.next = left.next.next;

    return head;
}
```

**Solution summary**

1. Two pointers, `right` and `left`, are set at the head node.
2. Move the `right` pointer `n` steps forward.
3. If `right` reaches NULL, return `head`'s next node.
4. Move both `right` and `left` pointers forward till `right` reaches the last node.
5. Relink the `left` node to the node at `left`'s next to the next node.
6. Return `head`.

**Time complexity**

The time complexity is O(n) where n is the number of nodes in the linked list.

**Space complexity**

The space complexity is O(1) because we use constant space to store two pointers.
