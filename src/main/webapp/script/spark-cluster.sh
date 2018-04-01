#!/bin/bash

if [ $# -ne 1 ];then
	echo "Usage: sh spark-cluster.sh [start|stop]"
	exit 2
fi

ssh master.bigdata.com "source /etc/profile && /opt/cdh5.3.6/spark-1.6.1/sbin/$1-all.sh"
ssh master.bigdata.com "source /etc/profile && /opt/cdh5.3.6/spark-1.6.1/sbin/$1-history-server.sh"
#ssh slave01.bigdata.com "source /etc/profile && /opt/cdh5.3.6/spark-1.6.1/sbin/$1-master.sh"
#ssh slave02.bigdata.com "source /etc/profile && /opt/cdh5.3.6/spark-1.6.1/sbin/$1-master.sh"



