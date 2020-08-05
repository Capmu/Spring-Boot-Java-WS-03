## Tennis Refactor

#### details:

1. replace ```p1Point``` to ```player1Point```
2. replace ```p2Point``` to ```player2Point```
3. replace ```p1Res``` to ```player1Result```
4. replace ```p2Res``` to ```player2Result```
5. duplicate condition ```player1Point == player2Point```
6. duplicate condition ```player1Point > player2Point```  
7. duplicate condition ```player2Point > player1Point``` 
8. Adjust all condition in getScore method to
    - Score is equal, but less than 4
    - Deucing case
    - Advantage
    - Win (including: Winning before deuce, Winning after deuce)
    - Normal cases