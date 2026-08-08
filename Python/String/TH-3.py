def countChar(s):
    nguyen_am = phu_am = 0
    s = s.lower()
    for i in s:
        match i:
            case "a" | "i" | "u" | "e" | "o":
                nguyen_am += 1
            case "b" | "c" | "d" | "f" | "g" | "h" | "j" | "k" | "l" | "m" | "n" | "p" | "q" | "r" | "s" | "t" | "v" | "w" | "x" | "y" | "z":
                phu_am += 1
    return nguyen_am, phu_am

ss = input("Nhap chuoi: ")
na, pa = countChar(ss)
print("So luong nguyen am:", na)
print("So luong phu am:", pa)