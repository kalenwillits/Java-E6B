# Design

## Overview
The E6B Java program is a command line interface written in Java 17 to mimic
the same functionality of a manual E6B flight computer. Optional arguments
should be ambiguous of function input such that any function call can accept
any parameter. The function call itself will enforce required inputs and return
an error detailing missing information when it occurs.


## Draft
```
$e6b {function} --{param} {value} --{param} {value} ... -> {calculated value}
```

## Requirements
### Functions
- help
- crosswind component
- headwind component
- ground speed
- pressure altitude
- temperature Fahrenheit conversion 
- temperature Celsius conversion
- true airspeed
- density altitude
- fuel consumption
- Time En Route
- nautical miles conversion 
- statute miles conversion



## Resources
[E6B Flight Computer on Wikipedia](https://en.wikipedia.org/wiki/E6B)
[Sporty's E6B Manual](https://www.sportys.com/media/pdf/asae6b.pdf)
