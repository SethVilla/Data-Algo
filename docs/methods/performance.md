---
description: >-
  The performance.now() method returns a high resolution timestamp in
  milliseconds.
---

# performance

```javascript
const t0 = performance.now();
doSomething();
const t1 = performance.now();
console.log(`Call to doSomething took ${t1 - t0} milliseconds.`);
```
