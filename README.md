# Java E6B
## Overview
A command line interface E6B flight computer written in the Java programming language.

## Disclaimer
This is currently a pre-release version! If you are using this tool for flight
planning please check your results with your own calculations before flying. No
calculation provided by this program is to be used as the sole source of
flight planning calculations until version 1.0.

## Technology
### Runtime Dependencies
[Java](https://www.java.com/en/download/manual.jsp)

### Used for development
[Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[Ubuntu 22.04.3 LTS](https://ubuntu.com/)
[vim 8.2](https://www.vim.org/)


## Quickstart
Assumptions: 
	- Linux (Ubuntu)
	- Java JDK 17 installed

Compile the program
```
./run/build.sh
```

Gather the function documentation
```
./run/run.sh
```



## Features
	- Celsius to Fahrenheit conversion
	- Crosswind component calculation
	- Density altitude calculation
	- Fahrenheit to Celsius conversion

## Limitations

## Implementations 

## Directory

## Roadmap
- [ ] Gracefully handle invalid function name error.
- [ ] Unit testing & Code Coverage.
- [ ] Implementations testing with sample inputs and expected outputs.
- [ ] Peer review mathematical formulas
- [ ] Algebraic logic allowing inferential parameters. i.e. Instead of requiring PA, you could instead provide the arguments needed to derive PA.
- [ ] Update run scripts to handle a executable .jar file.
- [ ] Cross-platform testing.
- [ ] Automate rendering of help documentation.

## Sources
[Density Altitude](https://www.aopa.org/training-and-safety/active-pilots/safety-and-technique/weather/density-altitude)

## Contact 

