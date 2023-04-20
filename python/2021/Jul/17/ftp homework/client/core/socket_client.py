import socket

def func():
    sk = socket.socket()
    sk.connect(('127.0.0.1',8080))
    return sk