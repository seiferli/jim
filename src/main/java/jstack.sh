#!/bin/bash

pid=`ps -ef | grep java | grep -v grep | awk '{print $2}'`
#top -Hp $pid
tid=`ps -mp $pid -o THREAD,tid,time | awk 'NR==2 {print $8}'`
#jstack -l $pid | grep hex($tid) -A 10