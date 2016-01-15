import time
import pygame

class Empty:
    def __init__(self):
        self.IsEmpty = True

IsEmpty = Empty()

class Node:
    def __init__(self,value,tail):
        self.Value = value
        self.Tail = tail
        self.IsEmpty = False

class Car:
    def __init__(self, Position,):
        self.Position = Position
    def Move(self):
        self.Position += 1
    def __str__(self):
        return str(self.Position)

def Main():
  x = 0
  y = 0
  car = Car(0)
  pygame.init()
  size = width, height = 600, 600
  white = 255, 255, 255
  green = 0, 255, 255
  screen = pygame.display.set_mode(size)
  offset = 30
  board_size = 10
  carpic = pygame.image.load("car.png")
  _width = int(offset / 3)

  while True:
    pygame.event.pump()
    screen.fill(green)
    screen.blit(pygame.transform.scale(carpic,(_width, _width)),
                (_width + x * offset,
                 _width + y * offset))
    pygame.display.flip()
    time.sleep(1)
    x+=1


  pygame.quit()


Main()
