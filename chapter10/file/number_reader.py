import json

filename = 'numbers.json'
with open('output/'+filename) as Json_object:
    numbers = json.load(Json_object)

print(numbers)
