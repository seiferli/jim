#!/bin/bash

pkg=""
if [ -z $1 ]; then
  pkg="demo/Main"
else
  pkg=$1 
fi

build="com/eaoa/jim/${pkg}.java"
echo -e "javac -d . ${build}"
javac -d . ${build}
java com/eaoa/jim/${pkg}

