#!/bin/bash

if [ $# -ne 1 ]; then
	echo 'Usage: sh hbase-thrift.sh start|stop'
	exit 2
fi

if [ $1 == 'start' ];then 
	${HBASE_HOME}/bin/hbase-daemon.sh start thrift
	echo 'hbase thriftserver start success'
elif [ $1 == 'stop' ];then
	${HBASE_HOME}/bin/hbase-daemon.sh stop thrift
	echo 'hbase thrift stop success'
fi
exit 1

