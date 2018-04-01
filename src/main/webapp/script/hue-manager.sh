#!/bin/bash
if [ $# -ne 1 ]; then
	echo "Usage: sh hue_manager.sh [start|stop]"
	exit 2
fi
if [ $1 == 'start' ]; then
	/opt/cdh5.3.6/hue-3.7.0/build/env/bin/supervisor
	echo 'hue start success'
elif [ $1 == 'stop' ]; then
	kill -9 `ps -ef | grep hue| awk '{print $2}' | head -1`
	kill -9 `ps -ef | grep hue| awk '{print $2}' | head -2`	
	echo 'hue stop success'
fi
exit 1
