num = int(input("Enter the  Number"))


def printFibonacci(num):
    a, b = 0, 1
    for i in range(num):
        print(a, end=' ')
        a, b = b, a + b
print(printFibonacci(num))        
