# What Is an Algorithm ?

# Complexcity
#  * space complexisty: how much memory
#  * Time complexity: How much time does
# Inputs and outputs

# Classification
#  * Serial/parallel, exact/approtxe,
#   deterministic/non-deter


# Sorthing algorithm

# Search algorithms, Sorting algorithms, Computational alg.. , Collection algo..


# Euclid's Algorithm
# Find the greatest common denominator of two int

# Constant time
# Logarithmoc time
# Linear time
# Log Linear
# Quadratic --


def gcd(a, b):
    # exact deterministic algorithm
    while b != 0:
        t = a
        a = b
        b = t % b

    return a


isOnRepeat = True
showMenu = True

while showMenu:

    print("\033c")
    print("Tasks")
    print("1. - Find the greatest common denominator")
    print("0 - Exit")

    menuAnswer = input("Your choice: ")
    if menuAnswer == "1":
        while isOnRepeat:
            print("\033c")
            print("Find the greatest common denominator of two integers")
            num1 = int(input("Enter numer 1: "))
            num2 = int(input("Enter numer 2: "))
            print("Result is: ")
            print(gcd(num1, num2))
            quitAnswer = input("Quit? (y/n)")
            if quitAnswer == "y":
                isOnRepeat = False
    elif menuAnswer == "0":
        showMenu = False
    else:
        print(",,")
