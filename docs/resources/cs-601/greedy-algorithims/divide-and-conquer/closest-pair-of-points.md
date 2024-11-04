# Closest Pair of Points

One of the orginal algorithms in computational geometry

* Data Clustering methods
* Finding nearest \[restaurant, gas station, .... ] in mapping software
* Mesh generation in computer graphics
* Brute force method finds distances between all pairs of points: O(n^2) time
* This algorithm is O(n log(n)) time, and uses a clever but tricky argument

### Recursion Setup

#### Base Case

* 2 points
* Minimum distance is the distance between those two points

#### Recursive step: Split into "left points" and "right points"

* Both sets of points about equal in size
* find closest pair in "left points", closest pair in "right points"
* Closest pair among all points is either:
  * Closest pair in "left points"
  * Closest pari in "right points"
  * Some other pair including one left point, one right point

### First Steps

* if needed, rotate all points so that they all have different coordinates and all have different y-coordinates (so long there is finite limiting points) O(n log(n))
* Begin by sorting all points by x-coordinates in a master list Px (needs to be unique)
  * Have some map from each point to its index Px
  * we recursively split left and right points, based on the ordering in Px
* Also have points sorted by y-coordinates in another master list Py
  * Again have a map from each point to its index in Py

