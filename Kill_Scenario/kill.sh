
if pgrep -x "wso2server.sh" > /dev/null
then
	echo "Running"
	echo "KILL_application"
	sleep 3
	killall -9 wso2server.sh
else
	echo "Stopped"
	
fi
