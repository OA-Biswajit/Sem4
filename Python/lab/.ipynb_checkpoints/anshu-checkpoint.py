def sum(lst):
    total = 0
    for num in lst:
        total += num
    return total

m = [1, 2, 3, 4, 5]
print("Sum of all elements in the list:", sum(m))

def maximum(num1, num2, num3):
    max=0.0
    if(num1>num2):
        if(num1>num3):
            max=num1
        else:
            max=num3
    else:
        if(num2>num3):
            max=num2
        else:
            max=num3
    
    return max

number1 = float(input("Enter the first number: "))
number2 = float(input("Enter the second number: "))
number3 = float(input("Enter the third number: "))

max1 = maximum(number1, number2, number3)
print("The maximum of the three numbers is:", max1)

def find_maximum_of_three(num1, num2, num3):
    #nested functions 
    def find_maximum(x, y):
        return x if x > y else y

    max_of_first_two = find_maximum(num1, num2)
    overall_max = find_maximum(max_of_first_two, num3)
    return overall_max

number1 = float(input("Enter the first number: "))
number2 = float(input("Enter the second number: "))
number3 = float(input("Enter the third number: "))

maximum = find_maximum_of_three(number1, number2, number3)
print("The maximum of the three numbers is:", maximum)



