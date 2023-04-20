import socket
sk = socket.socket()
sk.bind(('127.0.0.1',9000))
sk.listen()

while True:
    conn,addr = sk.accept()
    print(conn,addr)
    msg = input(">>>")
    conn.send(msg.encode('utf-8'))
    msg = conn.recv(1024)
    print(msg.decode('utf-8'))

sk.close()
