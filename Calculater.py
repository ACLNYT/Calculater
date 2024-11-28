while True: 
# Keep running the calculator until the user quits
    print("Welcome User!")
    print("-------------")
    #Instruction
    print("For addition select +")
    print("For subtraction select -")
    print("For multiplication select *")
    print("For division select /")
    a = int(input("Enter your first number "))
    o = (input("Select your operator "))
    b = int(input("Enter your second number "))
    if o == "+":
        print(a + b)
    elif o == "-":
        print(a - b)
    elif o == "*":
        print(a * b)
    elif o == "/":
        if b == 0:
            print("Can't divide by Zero(0)")
        else:
            print(a / b)
    else:
        print("Invalid Operator")

# Ask the user if they want to perform another calculation
    another_calculation = input("Do you want to perform another calculation? (yes/no): ")
    if another_calculation.lower() in ("no", "exit"):
        break  
# Exit the loop if the user enters "no" or "exit"
