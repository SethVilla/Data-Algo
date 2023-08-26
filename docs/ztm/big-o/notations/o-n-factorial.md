---
description: nested loop per input
---

# O(n!) - factorial

```javascript
void nFacRuntimeFunc(int n) {
  for(int i=0; i<n; i++) {
    nFacRuntimeFunc(n-1);
  }
}
```
