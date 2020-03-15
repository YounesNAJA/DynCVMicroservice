# Description

This repo is contains Dockerfile and all resources needed to build and run the CVMicroservice app.

## Pull the image from DockerHub

Download the image file [here](https://hub.docker.com/r/younesnaja/cvmicroservicenode).

```docker
docker image pull younesnaja/cvmicroservicenode:latest
```

## Usage

### Build the image you just downloaded

#### Clone this repository
```git
git clone https://github.com/YounesNAJA/DynCVMicroservice.git
```

#### Build the image
```linux
cd DynCVMicroservice
```

```linux
nohup docker build -t cvmicroservicenode . &
```

##### You can read logs using the following command
```linux
tail -100f nohup.out
```
#### Create a container from the image you just built
Map 8080 port from the container to 80 port in the host machine

```docker
nohup docker container run -p 8080:8080 cvmicroservicenode --name CVMicroserviceContainer &
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## License
[MIT](https://choosealicense.com/licenses/mit/)
