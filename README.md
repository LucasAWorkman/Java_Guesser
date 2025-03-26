# Java_Guesser


## Start

Make a class and a static void to contain everything

## RandonNum();
returns a random num from a private min and maxrange of 1 and 100


## Guesser();
start by getting a random num from the randomnum function
store saved guesses

use a while loop that goes over for 7 guesses

if guessednumber lower than random num print guess too low

else if guessednum higher than randomnum print guess too high

else its correct and print the num of guesses taken

add a guess

## Computer Guesser();

store the min and max ranges for the computer

while loop here

make a guess that adds both low and high and divides by 2

if its higher we set the guess -1 for the higher variable

if its lower set low to the guess of +1

else it must be correct and exit saying the number of guesses

## static void

Wrap everything in a while true loop with the 3 options of printing 0, 1, or 2

use scanner for the input 


if 0 exit the program and loop

else if "1" randomOutput.Guesser();

else if "2" randomOutput.ComputerGuesser();
