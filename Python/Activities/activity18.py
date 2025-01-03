import pandas as pd

# Sample data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame
df = pd.DataFrame(data)

# Print the values only in the Usernames column
print("Usernames column:")
print(df["Usernames"])

# Print the username and password of the second row
second_row = df.iloc[1]  # Index 1 is the second row
print("\nUsername and Password of the second row:")
print(f"Username: {second_row['Usernames']}, Password: {second_row['Passwords']}")

# Sort the Usernames column data in ascending order and print data
sorted_usernames = df.sort_values(by="Usernames")
print("\nData sorted by Usernames (ascending):")
print(sorted_usernames)

# Sort the Passwords column in descending order and print data
sorted_passwords = df.sort_values(by="Passwords", ascending=False)
print("\nData sorted by Passwords (descending):")
print(sorted_passwords)