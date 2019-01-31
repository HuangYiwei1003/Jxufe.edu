filename = "input/alice.txt"

try:
    with open(filename) as file_object:
        contents = file_object.read()
except FileNotFoundError:
    msg = "Sorry, the file " + filename + " does not exist."
    print(msg)
else:
    # 计算文件大致包含多少单词
    words = contents.split()
    num_words = len(words)
    print("The file " + filename + " has about " + str(num_words) + " words.")