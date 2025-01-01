def determine_winner(player1_choice, player2_choice):
   
    if player1_choice == player2_choice:
        return "It's a tie!"
    elif (player1_choice == "rock" and player2_choice == "scissors") or \
         (player1_choice == "scissors" and player2_choice == "paper") or \
         (player1_choice == "paper" and player2_choice == "rock"):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"

def get_player_choice(player):
   
    while True:
        choice = input(f"{player}, enter your choice (rock, paper, scissors): ").lower()
        if choice in ["rock", "paper", "scissors"]:
            return choice
        else:
            print("Invalid choice. Please choose rock, paper, or scissors.")

def play_game():
    print("Welcome to Rock-Paper-Scissors!")
    player1_choice = get_player_choice("Player 1")
    player2_choice = get_player_choice("Player 2")

    print(f"\nPlayer 1 chose: {player1_choice}")
    print(f"Player 2 chose: {player2_choice}")

    result = determine_winner(player1_choice, player2_choice)
    print(f"\n{result}")

if __name__ == "__main__":
    play_game()
