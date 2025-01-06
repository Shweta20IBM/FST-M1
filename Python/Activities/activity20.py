import pandas

# Read the Excel file
input_file = "output.xlsx"
df = pandas.read_excel(input_file)

# 1. Print the number of rows and columns
rows, cols = df.shape
print(f"The dataset has {rows} rows and {cols} columns.")

# 2. Print the data in the 'Email' column
print("\nEmails column:")
print(df["Email"])

# 3. Sort the data based on 'FirstName' in ascending order and print
sorted_df = df.sort_values(by="FirstName")
print("\nData sorted by FirstName (ascending):")
print(sorted_df)