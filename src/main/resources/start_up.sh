#!/usr/bin/env bash
echo `pwd`

hadoop fs -rm -r /user/test/output
hadoop jar /root/jenkins_deploy/hadoop/build/libs/hadoop_startup-1.0-SNAPSHOT.jar  /user/test/test.txt /user/test/output
hadoop fs -cat /user/test/output/part-r-00000
