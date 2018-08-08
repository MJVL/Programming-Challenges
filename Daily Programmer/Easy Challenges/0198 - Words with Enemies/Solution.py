def results(word_one, word_two):
    for c in word_one + word_two:
        if c in word_one and c in word_two:
            word_one, word_two = word_one.replace(c, "", 1), word_two.replace(c, "", 1)
    return "Valley Letters: %s,%s\n%s" % (word_one, word_two, "Tie" if len(word_one) == len(word_two) else "Left Wins" if len(word_one) > len(word_two) else "Right Wins")


def main():
    words = input("Enter two words (space-delimited): ").split();
    print(results(words[0], words[1]))


if __name__ == '__main__':
    main()
