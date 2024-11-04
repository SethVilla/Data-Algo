# Segmented Least Squares

```
public double segmentedLS(int n) {

    // initialize double[] m of size n + 1 to have all 0s
    // initialize double[][] e of size (n + 1) x (n + 1) to have all 0s
    
    for (int i = 0; i <= n; i++) {
        for (int j = i; j <=n; j++) {
            e[i][j] = leastSquares(i,j); // O(n)
        }
    }
    
    for (int i = 1; i <= n; i++) {
        double minVal = Double.MAX_Value;
        for (int j = 1; j <= i; j++) {
            minVal = Math.min(e[i][j] + C + m[i - 1], minVal);
        }
        m[i] = minVal;
    }
    
    return m[n];
 }
```

