#!/bin/bash
APP=e6b;
set -xe;
rm -rf bin;
mkdir -p bin/build/funcs/;
javac \
	src/*.java \
	src/funcs/*.java \
	-d bin/build/.;
mkdir -p bin/dist/;
echo "Build complete!"
