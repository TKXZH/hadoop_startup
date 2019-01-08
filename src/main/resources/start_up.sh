#!/usr/bin/env bash
echo `pwd`

hadoop fs -cat /user/set_java_env.sh

hadoop jar /root/jenkins_deploy/hadoop/build/libs/hadoop_startup-1.0-SNAPSHOT.jar  /user/test/test.txt /user/test/output
