#!/bin/bash

jmap -heap `ps -ef | grep java | grep -v grep | awk '{print $2}'`
