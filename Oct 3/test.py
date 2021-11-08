#input: num whic represents the fibonacci numebr we are looking for.
#output: the fibonacci term
#for example if num =4 we return the 4th fibonacci number -5
#for example if num =10 we return the 10th fibonacci number -89


def fib(num):
    if num==1:
        return 1
    if num==2:
        return 2
    
    return fib(num-1)+fib(num -2)       