# Depth - First and Breadth - First Traversals

### Depth First

* This means they go deep down one path before coming back up to continue the traversal
* Depth-First Traversals are typically implemented with stacks (or recursion)

### Breadth First&#x20;

* Traverse a tree level by level
* they are typically implemented with queues
* this kind of traversal is not as common for trees, but is used in some AI - related and gaming applications
* Breadth first traversal is more common for graphs

{% hint style="info" %}
A "spidering" search of the web: get all pages one-link from the current page; then get all pages two links from the current page
{% endhint %}

{% hint style="warning" %}
Not typically used for trees beacuse nodes don't store references to siblings or parents
{% endhint %}
