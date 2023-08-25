from turtle import *
reset()
counter = 1
left(90)
sides = int( input("How many sides (3~20)? ") )
while counter <= sides:
    left(360/sides)
    forward(100)
    counter = counter + 1
done()