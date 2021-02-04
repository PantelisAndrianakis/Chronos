# Chronos
Reduce the overhead from mass requesting System.currentTimeMillis()<br>
<br>
## What Chonos does
Chronos updates an internal long value with System.currentTimeMillis() approximately every millisecond.<br>
<br>
### How to use
To get the current time in milliseconds use Chronos.currentTimeMillis()<br>
<br>
### Benchmark
You can test Chronos performance by running the benchmark on your machine.
```
Starting tests...
System.currentTimeMillis() took 3302 milliseconds.
Chronos.currentTimeMillis() took 3 milliseconds.
```
