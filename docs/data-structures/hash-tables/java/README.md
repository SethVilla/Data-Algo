---
description: hashCode and Equals()
---

# Java

* Two objects that are equal must have the same hashCode.
* But the reverse is not necessarily (and not required to be) true.
  * Two objects that are unequal could still have the same hashcode.
  * This would result in a collision. it is allowed
  * Producing distinct hash codes for unequal objects will result in improved performance, but is not a requirement&#x20;

