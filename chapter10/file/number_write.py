import json

numbers = [2, 3, 5, 7, 11, 13]

filename = 'numbers.json'
with open('output/'+filename, 'w') as Json_object:
    json.dump(numbers, Json_object)
