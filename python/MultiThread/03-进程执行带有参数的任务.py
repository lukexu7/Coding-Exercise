import multiprocessing

def show_info(name,age):
    print(name,age)


if __name__ == '__main__':
    sub_process = multiprocessing.Process(target=show_info,args=("fuck",20))
    sub_process.start()