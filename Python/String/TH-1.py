def length(s):
    count = 0
    for i in s:
        count += 1
    return count

def countStr(s):
    s_list = s.split(' ')
    for i in s_list:
        print(length(i))

ss = input("Nhap chuoi: ")
print(length(ss))
countStr(ss)