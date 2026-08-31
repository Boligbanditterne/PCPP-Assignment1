## 2.1 

### 2.1.2
Our solution is not fair because writers must wait for readers until there is none. However if there is a constant stream of readers, then writers will wait indefinetly. Look WriteProbFair.java for fair version.

### 2.1.3
Yes, the code has multiple condition variables. Wait and notifyAll 5 times total. Wait makes a thread wait until notified. NotifyAll makes all other threads wake up from wait.

## 2.2

### 2.2.1
<img src="images/Pastedimage.png" alt="Screenshot" width="500">

There is no synchronization between the cores. One core never recieves the update of 42 and is thus unable to finish.

### 2.2.2
Synchronize forces cache coherence between the cores. Thus the update of 42 is known by both.

### 2.2.3
Get and set both need to be synchronized with the same lock. Cache coherence is thus not enforced.

### 2.2.4
Volatile variables are not stored on each cores registers. Instead it is stored on shared cache/memory.

## 2.3

### 2.3.1
<img src="images/Pastedimage(2).png" alt="Screenshot" width="500">

Yes, the one addition functions runs on class' lock, while the other runs on the instance of the objects lock.

### 2.3.2

The one addition functions runs on class' lock, while the other runs on the instance of the objects lock.

### 2.3.3

Our solution creates synchronizes to the lock on the class. Therefore they now have the same lock and thus no race conditions.

### 2.3.4

Sum is only called when the threads are done and joined. Therefore there is no need for it does not need a lock.
