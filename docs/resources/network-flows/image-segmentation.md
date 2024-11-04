# Image Segmentation

## Turn into Max Flow Problem

* An image consists of pixels
* A set of neighbors for each pixel
* For each pixel: A likelihood Ai >= 0 that the pixel is in the foreground
  * Even though we use the word "likelihood", we don't insist it is a probability (we dont insist that ai <= 1)
* For each pixel: a likelihood bi >= 0 that the pixel is in the background
  * Again, we don't insist bi <= 1 or that ai + bi be any fixed number
* For each pair of neighboring pixels: a separation penalty pij >= 0 for putting one in the foreground and the other in the background.
  * Smooths out the border between background and foreground
