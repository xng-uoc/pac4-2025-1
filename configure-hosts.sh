#!/bin/sh

clab_name="clab-pac4-2025-1"

# Remove the default routes to ensure that routers and hosts are isolated
printf "Removing default routes from routers and hosts..."
sudo docker exec -d $clab_name-vyos01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos03 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos04 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos05 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos06 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos07 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos08 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host11 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host12 ip route del default via 172.20.20.1

sudo docker exec -d $clab_name-vyos01 ip -6 route del default
sudo docker exec -d $clab_name-vyos02 ip -6 route del default
sudo docker exec -d $clab_name-vyos03 ip -6 route del default
sudo docker exec -d $clab_name-vyos04 ip -6 route del default
sudo docker exec -d $clab_name-vyos05 ip -6 route del default
sudo docker exec -d $clab_name-vyos06 ip -6 route del default
sudo docker exec -d $clab_name-vyos07 ip -6 route del default
sudo docker exec -d $clab_name-vyos08 ip -6 route del default
sudo docker exec -d $clab_name-host11 ip -6 route del default
sudo docker exec -d $clab_name-host11 ip -6 route del default
printf " done!\n"
