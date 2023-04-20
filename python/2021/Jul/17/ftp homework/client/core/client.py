def main():
    start_l = [('登录',),('注册',),('退出',)]
    for index,item in enumerate(start_l):
        print(index,item[0])
    try:
        num = int(input(">>>"))
        func_str = start_l[num-1][1]
    except:
        pass