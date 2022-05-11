About
========
***

The repository contains a solution to the "Railroads" problem. The conditions of the task are specified in the file [Railroads.pdf](./Railroads.pdf)

For build and run this mini-project you need installed JDK.
You can use Azul Platform Core distributive: [Azul.com](https://www.azul.com/downloads/)

Algorithm
========
***

Get the coaches and enter to the dead-end station (to the `Stack<Integer> station`).
On side `A` the coaches are in the sequence `1, 2, ..., N`. 
If the first coache on side `B` should be 'current',
then this can be moved into the dead-end all coaches with numbers `1, 2, ..., current`,
and then moving the coaches with number `current` to side `B`.

Building
========
***

Script for build:
```bash
$ ./build.sh
```

Also, you can use java for build:
```bash
$ javac Application.java
```

This step was testing with Zulu17.30+15-CA:
```bash
$ java -version 
openjdk version "17.0.1" 2021-10-19 LTS
OpenJDK Runtime Environment Zulu17.30+15-CA (build 17.0.1+12-LTS)
OpenJDK 64-Bit Server VM Zulu17.30+15-CA (build 17.0.1+12-LTS, mixed mode, sharing)
```

Running
===
***

For run you need check available [input.txt](./input.txt) with numbers from condition. 

Run with script:
```bash
$ ./run.sh
```
Run with java (after build):
```bash
$ java Application
```
Example [input.txt](./input.txt):
```text
5
12345
54123
0
6
654321
0
0

```

Testing
========
***

For run test you need check available directory [tests](./tests) with input-*.txt and output-*.txt files.

Run tests:
```bash
$ ./run-tests.sh
```

This implementation of the solution has several tests:
* Test #1 with file from conditions;
* Test #2 without file for check exception from program;
* Test #3 without conditions (with 0 in first line) file for check correct end of program.
