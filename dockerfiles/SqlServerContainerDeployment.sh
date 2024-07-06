# Deploy a sql server docker container
# Pull a sql server image
docker pull mcr.microsoft.com/mssql/server:2022-latest
# Run the image with given username and password (copy from docker desktop)
docker run --hostname=sql1 --user=mssql --env=MSSQL_SA_PASSWORD=Conestoga1 \
  --env=ACCEPT_EULA=Y --env=PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin \
  --env=MSSQL_RPC_PORT=135 --env=CONFIG_EDGE_BUILD= --env=MSSQL_PID=developer \
  -p 1433:1433 --restart=no --runtime=runc -d mcr.microsoft.com/mssql/server:2022-latest