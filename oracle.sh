docker volume create oracle-volume
docker run -v oracle-volume:/opt/oracle/oradata -d -p 1522:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe