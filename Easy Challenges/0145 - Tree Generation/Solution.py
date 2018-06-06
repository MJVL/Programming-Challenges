def generate_tree(base, trunk, leaves):
    for i in range(int(base / 2 + 1)):
        print(" " * int(base / 2 - i) + leaves * (i * 2 + 1))
    print(" " * int(base / 2 - 1) + trunk * 3)


def main():
    arr_input = input("Enter the base-width, trunk, and leaves (space-delimited): ").split()
    generate_tree(int(arr_input[0]), arr_input[1], arr_input[2])

if __name__ == '__main__':
    main()
    