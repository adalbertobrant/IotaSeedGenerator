# Happy Hacktoberfest 2018 
   *** Any help will be welcomed

# IotaSeedGenerator
A Simple program using rand() to GEN an IOTA SEED for the IOTA GUI Wallet

## Algorithm

Predefined constants:
  - token_library: tokens to be used on the result key.
    - type: char array
    - value: "ABCDEFGHIJKLMNOPQRSTUVXYWZ9"

Input variables (User defined):
  - key_size: Number of items on the output key.
    - type: integer
    - constraints: between 30 to 81.

Output values:
  - key: Generated random seed for iota.
    - constraints: key_size characters from the token_library, randomly chosen.
    - create a text file with the random seed for iota.
    
