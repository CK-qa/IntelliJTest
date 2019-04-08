one = int(input())
two = int(input())
three = int(input())

res = (one + two + three) / 2

print((res * (res - one) * (res - two) * (res - three)) ** 0.5)
