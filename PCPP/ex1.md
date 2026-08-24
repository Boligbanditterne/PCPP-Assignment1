## 1.1 

### 1.1.1

We do not get the expected output of 20 million, but instead 19705913 because of race condition

### 1.1.2

It is not garuanteed to be 200. But much less likely to print another number.

### 1.1.3

These alternate options has more room for error because they use two steps to do the same. However java compiles it to be the same so there is no difference in testing.

### 1.1.4

A lock prevents the race condition from earlier meaning that only process has access to the variable at a time (critical section). This means that they will never try to increment the same number.

### 1.1.5

Yes, the critical section and lock only contains the shared variable. This is the least possible.

## 1.2 

### 1.2.1
One of the threads are sleeping while the other is printing. Therefore the double dash can occur.

<img src="images/2026-08-24_11-10.png" alt="Screenshot" width="500"> 


