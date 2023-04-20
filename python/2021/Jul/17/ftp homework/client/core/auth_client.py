import json
from core import socket_client

class Auth:
    def __init__(self):
        self.sk = socket_client.func()
        self.username = None
def login():
    username = input('username: ')
    password = input('password: ')
    if username.strip() and password.strip():
        ret_json = json.dumps({'username':'aa','password‘:''bb'})
        self.sk .send()


