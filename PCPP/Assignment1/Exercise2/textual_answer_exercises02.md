## 2.1 

### 2.1.2
Our solution is not fair because writers must wait for readers until there is none. However if there is a constant stream of readers, then writers will wait indefinetly. Look WriteProbFair.java for fair version.

### 2.1.3
Yes, the code has multiple condition variables. Wait and notifyAll 5 times total. Wait makes a thread wait until notified. NotifyAll makes all other threads wake up from wait.

## 2.2

###2.2.1
<img src="images/Pastedimage.png" alt="Screenshot" width="500">

The join tries to synchronize all variables. However the join will never finish because it is waiting on the thread to finish, which it never will.


