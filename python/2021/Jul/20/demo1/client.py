import socket

sk=socket.socket()
sk.connect(('127.0.0.1',9000))

while True:
    msg = sk.recv(1024).decode('utf-8')
    info = input("<<<")
    sk.send(info.encode('utf-8'))
    print(msg)