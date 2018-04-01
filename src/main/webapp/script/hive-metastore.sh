#!/bin/bash

#echo 'HIVE_HOME: ' ${HIVE_HOME}

if [ $# -ne 1 ]; then
	echo 'Usage: sh hive-metastore.sh start|stop'
	exit 2
fi

if [ $1 == 'start' ];then 
	nohup ${HIVE_HOME}/bin/hive --service metastore >/dev/null 2>&1 &
	echo 'hive start success'
elif [ $1 == 'stop' ];then
	kill -9 `ps -ef | grep metastore | awk '{print $2}'|head -n 1`
	echo 'hive stop success'
fi
exit 1
