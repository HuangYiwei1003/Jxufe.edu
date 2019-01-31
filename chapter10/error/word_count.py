def count_word(filename):
    """计算一个文件大致包含多少单词"""
    try:
        with open('input/' + filename) as file_read:
            contents = file_read.read()
    except FileNotFoundError:
        msg = "Sorry, the file " + filename + " does not exist."
        print(msg)
    else:
        # 计算文件大致包含多少单词
        words = contents.split()
        num_words = len(words)
        with open('output/wordcount', 'a') as file_write:
            file_write.write("The file " + filename + " has about " + str(num_words) + " words." + '\n')
            print("successful write!")
            file_write.close()


filenames = ['alice.txt', 'siddhartha.txt', 'moby_dick.txt', 'little_women.txt']
for file in filenames:
    count_word(file)
