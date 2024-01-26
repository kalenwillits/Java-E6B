#!/bin/bash
set -xe;
rm -rf bin/;
mkdir -p bin/;
mkdir -p bin/funcs/;
javac \
	src/*.java \
	src/funcs/*.java \
	-d bin/.;

