var1 = int(input())
var2 = int(input())
var3 = int(input())

res = (var1 + var2 + var3) / 2

print((res * (res - var1) * (res - var2) * (res - var3)) ** 0.5)