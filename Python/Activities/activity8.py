def is_first_and_last_same(numbers):
   
    if len(numbers) < 1:
        return False
    return numbers[0] == numbers[-1]
def main():
    print("Enter a list of numbers separated by spaces:")
    
    try:
        
        user_input = input()
        number_list = [int(x) for x in user_input.split()]
    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")
        return

  
    result = is_first_and_last_same(number_list)
    print("The first and last number of the list are the same:" if result else "The first and last number of the list are not the same.")

if __name__ == "__main__":
    main()