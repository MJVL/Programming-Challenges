def letter_by_letter(s1, s2):
    print(s1)
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            print(s2[:i+1] + s1[i+1:])


def main():
    letter_by_letter(input("Enter the first sentence: "), input("Enter the second sentence: "))

if __name__ == '__main__':
    main()
