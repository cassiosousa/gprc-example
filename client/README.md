# Create stubs in development time

- Execute command `python -m grpc_tools.protoc -I./proto --python_out=./proto/stubs --grpc_python_out=./proto/stubs ./proto/city.proto`

# Execute client

- `python rpc_client.py`
- Then **Type it identifier of the city:**