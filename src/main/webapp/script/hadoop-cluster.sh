#!/bin/bash

if [ $# -ne 1 ];then
	echo "Usage: sh hadoop-cluster.sh [start|stop]"
	exit 2
fi

ssh master.bigdata.com "source /etc/profile && /opt/cdh5.3.6/hadoop-2.5.0/sbin/$1-all.sh && /opt/cdh5.3.6/hadoop-2.5.0/sbin/mr-jobhistory-daemon.sh $1 historyserver"

