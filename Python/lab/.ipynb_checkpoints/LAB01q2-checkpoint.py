num = int(input("Enter the Number"))

def checkPerfect(num):
    sum = 0
    for i in range(1, num-1 , 1):
        if(num % i == 0):
             sum += i
           
    if(num == sum):
        return "It is a Perfect Number"
    else:
        return "Not a Perect Number"

print(checkPerfect(num))