import time
import pygame

class Empty:
    def __init__(self):
        self.IsEmpty = True

IsEmpty = Empty ()

class Node:
    def __init__(self,x,xs):
        self.Value = x
        self.Tail = xs
        self.IsEmpty = False

class Car:
    def __init__(self, Position):
        self.Position = Position
    def Move(self,Position):
        self.Position += 1
    def __str__(self):
        return str(self.Position)


cars = Empty
cars = Node(Car(1), (Node(Car(2), (Node(Car(3),Empty)))))
while not (cars.IsEmpty):
    print(cars.Value)
    car = cars.Tail
    for i in range(0,10):
        Car.Move()
        print ("Begin Iteration")
