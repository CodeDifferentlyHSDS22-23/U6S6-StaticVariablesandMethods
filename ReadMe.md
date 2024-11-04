# U6S6 - Static Variables and Methods

* Part A - Foundations 7.6

## Part A

### Exercise 01

* Continue editing the PlayerTest project
* A version of this program is provided for you in the files
  `Player`, `PlayerTest`, and `Team`

#### Step 01

In the package `partA.ex01` look at the file `Player`

#### Step 02
*  Modify the `Player` class:
  * Include a static integer playerCount field
  * This field counts the total number of players instantiated
  * Initialize this field to 0
  * Increase this field every time a player is instantiated
  * Include an integer playerNumber field
  * This field is initialized with the current value of playerCount
  * Print the PlayerNumber and PlayerCount as part of the display()
  method

#### Step 03
*  Instantiate a few players and display their info.

Your program is working correctly, if when run, the following is the output:

```
Player: LeBron James
Height: 2.06m
yearsInLeague: 20 yrs
Team:Lakers
Player Count:3

Player: Stephen Curry
Height: 1.88m
yearsInLeague: 14 yrs
Team:Warriors
Player Count:3

Player: James Harden
Height: 1.96m
yearsInLeague: 33 yrs
Team:Sixers
Player Count:3

```

### Exercise 02

#### Step 01

In the package `partA.ex01` look at the file `Player`.

#### Step 02
* Modify the `Player` class:
  * Encapsulate the playerCount field. Make this field private
  and create a static getter method
  * Try making the display method static
  * What are your IDE’s complaints? Take note of this and share with your instructor.

#### Step 03
* From the main method:
  * Call the getter method that you just created and print the
  returned value
    Your program is working correctly, if when run, the following is the output:

```
Player: LeBron James
Height: 2.06m
yearsInLeague: 20 yrs
Team:Lakers
Player Count:3

Player: Stephen Curry
Height: 1.88m
yearsInLeague: 14 yrs
Team:Warriors
Player Count:3

Player: James Harden
Height: 1.96m
yearsInLeague: 33 yrs
Team:Sixers
Player Count:3

Player Count:3 

```