	
# Given lists
listOne = [30, 20, 13, 11, 17]
listTwo = [23, 63, 26, 56, 10]
 
# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)
 

thirdList = []
 

for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        

for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)