import sys
from math import ceil

a = input()
a = a.split()

print (ceil(int(a[0])/int(a[2])) * ceil(int(a[1])/int(a[2])))