if [ $# -ne 1 ]; then
	echo "Usage: sh kafka-cluster.sh [start|stop]"
	exit 2
fi
cd /opt/cdh5.3.6/kafka_2.10-0.8.2.1 
if [ $1 == 'start' ]; then
	for ((i = 0; i <=3; i++))
	do
	       bin/kafka-server-start.sh config/server${i}.properties & 
	done
	echo 'kafka-cluster start success'
elif [ $1 == 'stop' ]; then
	bin/kafka-server-stop.sh
	echo 'kafka-cluster stop success'
fi
exit 1
