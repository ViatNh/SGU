def inChan(m, n):
    for i in range(m, n):
        if (i % 2 == 0):
            print(f"{i} ")

M = int(input("Nhap M: "))
N = int(input("Nhap N: "))
inChan(M, N)