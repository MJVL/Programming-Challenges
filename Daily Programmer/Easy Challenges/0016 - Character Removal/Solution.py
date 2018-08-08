def remove_characters(str_one, str_two):
    for c in str_two:
        str_one = str_one.replace(c, "")
    return str_one


def main():
    str_one = str(input("Enter the string: "))
    characters = str(input("Enter characters to remove: "))
    print("Modified string: %s" % remove_characters(str_one, characters))

    
if __name__ == '__main__':
    main()
