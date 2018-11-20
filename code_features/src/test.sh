#!/bin/bash

RED="\033[1;31m"
GREEN="\033[1;32m"
NOCOLOR="\033[0m"

email="info@vlastimilburian.cz"

declare -a ips=("88.86.120.212" "88.86.120.223" "88.86.120.250" "88.86.120.213" "88.86.120.103" "46.234.104.23" "46.234.104.24")

echo -e "\n\n"

for ip in "${ips[@]}"
do
    spfquery -sender $email -ip $ip -helo kolbaba.stable.cz

    exit_status=$?
    if [ $exit_status -eq 0 ]; then
        echo -e "${GREEN}$ip${NOCOLOR}"
    else
        echo -e "${RED}$ip${NOCOLOR}"
    fi

    echo -e "\n\n"
done