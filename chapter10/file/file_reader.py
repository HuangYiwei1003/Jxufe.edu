#version 1.0
#with open('input/pi_digits.txt') as file_object:
#    contents = file_object.read()
#    print (contents.rstrip())

#version 1.1
#filename = 'input/pi_digits.txt'
#
#with open(filename) as file_object:
#    for line in file_object:
#        print(line.rstrip())

#version 1.2
filename = 'input/pi_digits.txt'

with open(filename) as file_object:
    lines = file_object.readlines();

for line in lines:
    print(line.rstrip())