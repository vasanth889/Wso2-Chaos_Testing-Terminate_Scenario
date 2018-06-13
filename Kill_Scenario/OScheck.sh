#!/bin/bash
if [[ "$OSTYPE" == "linux-gnu" ]]; then
        echo "this is linux";
	sh ../kill.sh
elif [[ "$OSTYPE" == "darwin"* ]]; then
        echo "this is  dainrw";
elif [[ "$OSTYPE" == "cygwin" ]]; then
        echo "this is  cygwin";
elif [[ "$OSTYPE" == "msys" ]]; then
       echo "this is  windows";
elif [[ "$OSTYPE" == "macOS"* ]]; then
        echo "this is macOS";
else
        echo"nothing matched";
fi




