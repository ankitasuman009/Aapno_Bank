import turtle
import random



s = turtle.getscreen()
s.setup (width=740, height=800, startx=0, starty=0)
turtle.bgcolor("black")
t1 = turtle.Turtle()
t1.pen(pencolor='white', fillcolor='white', speed=20)
t1.penup()
t1.setpos(200, 50)
t1.pendown()
t1.begin_fill()
t1.circle(40)
t1.end_fill()
t1.penup()
t1.setpos(-200, 90)
t1.pen(pencolor='blue', fillcolor='blue', speed=5)

t2 = t1.clone()
t2.pen(pencolor='white', fillcolor='white', speed=20)
t2.penup()
t2.goto(200, -170)
t2.pendown()
t2.begin_fill()
t2.circle(40)
t2.end_fill()
t2.penup()
t2.goto(-200, -130)
t2.pen(pencolor='red', fillcolor='red', speed=5)

def gamestart(start):
    while(True):
        if t1.pos()>=(160, 90):
            print("\nplayer 1 wins")
            return
        elif t2.pos()>=(160, -130):
            print("\nplayer 2 wins")
            return
        else:
            input("\npress 'enter' to roll the die\n")
            die = random.choice([1, 2, 3, 4, 5, 6])
            if start==t1:
                print("number of steps for player 1 will be: ", 10*die)
                t1.pendown()
                t1.fd(10*die)
                start = t2
            else:
                print("number of steps for player 2 will be: ", 10*die)
                t2.pendown()
                t2.fd(10*die)
                start = t1

u = input("who wants to start the game: t1 or t2: ")
if u=='t1':
    gamestart(t1)
elif u == 't2':
    gamestart(t2)
else: 
    print("unvalid input")
turtle.exitonclick()