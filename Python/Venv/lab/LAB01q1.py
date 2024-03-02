def identify_position(x, y):
    if x > 0 and y > 0:
        return "Quadrant I"
    elif x < 0 and y > 0:
        return "Quadrant II"
    elif x < 0 and y < 0:
        return "Quadrant III"
    elif x > 0 and y < 0:
        return "Quadrant IV"
    elif x == 0 and y != 0:
        return "y-axis"
    elif y == 0 and x != 0:
        return "x-axis"
    else:
        return "Origin"
     
     
x= float(input("Enter the x coordinate"))
y= float(input("Enter the y coordinate"))
print("(",x , ",", y,")" "is in",identify_position(x,y))

