FROM ubuntu:20.04
RUN apt-get update
RUN apt-get -y install python3-pip
RUN pip install thrift
ADD servidor.py /calculadora_servidor/
ADD gen-py/ /calculadora_servidor/
WORKDIR /calculadora_servidor/