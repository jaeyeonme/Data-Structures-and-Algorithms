# Python
s = []
s.append(123)
s.append(456)
s.append(789)
print("size:", len(s))
while len(s) > 0:
    print(s[-1])
    s.pop(-1)