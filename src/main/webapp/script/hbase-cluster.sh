#!/bin/bash

if [ $# -ne 1 ]; then
	echo "Usage: sh hbase-cluster.sh [start|stop]"
	exit 2
fi

ssh master.bigdata.com "source /etc/profile && /opt/cdh5.3.6/hbase-0.98.6/bin/$1-hbase.sh"

for node in slave01.bigdata.com slave02.bigdata.com
do
	echo $node
	ssh $node "source /etc/profile && /opt/cdh5.3.6/hbase-0.98.6/bin/hbase-daemons.sh $1 master"
done

