# Write a shell script to get the public IP address of your device!!

## Solution:

#!/bin/bash
echo "Public IP Address: "$(curl -s ifconfig.me)
