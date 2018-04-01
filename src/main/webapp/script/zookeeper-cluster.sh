#!/bin/bash
if [ $# -ne 1 ];then
	echo "Usage: sh zookeeper-cluster.sh [start|stop|restart]"
	exit 2
fi
for node in master.bigdata.com slave01.bigdata.com slave02.bigdata.com
do
	echo $node
	ssh $node "source /etc/profile && /opt/cdh5.3.6/zookeeper-3.4.5/bin/zkServer.sh $1"
done


