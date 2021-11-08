def sumdigits(x):
  f=x
  if f == 0:
    return 0
  else:
    return (f%10) + sumdigits(f//10)
print(sumdigits(1234))