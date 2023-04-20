import multiprocessing


def show_info(name, age):
    print(name, age)



if __name__ == '__main__':
    sub = multiprocessing.Process(target=show_info, args=("wanga", 30))
    sub.start()