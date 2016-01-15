class Empty:
    def __init__(self):
       self.IsEmpty = True

Empty = Empty()

class Node:
    def __init__(self,value,tail):
        self.Value = value
        self.Tail = tail
        self.IsEmpty = False

l = Empty
count = int(input("How many elements "))
for i in range(0, count):
    v = int(input("Insert the next element "))
    l = Node(v, l)

x = l
while not(x.IsEmpty):
    print(x.Value)
    x = x.Tail