def isPrime(n):
    if n < 2: return 0
    for i in range(2, n):
        if (n % i == 0): return 0
    return 1;

arg = int(input("Nhap vao mot so nguyen: "))
if (isPrime(arg)):
    print(f"{arg} la so nguyen to\n")
else:
    print(f"{arg} khong phai so nguyen to\n")