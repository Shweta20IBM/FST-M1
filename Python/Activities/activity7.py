def calculate_sum(numbers):
    return sum(numbers)

def main():
    print("Enter a list of numbers separated by spaces:")
    
    try:
       
        user_input = input()
        number_list = [int(x) for x in user_input.split()]
    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")
        return
    
    
    total = calculate_sum(number_list)
    print("The sum of all the elements in the list is:", total)

if __name__ == "__main__":
    main()