def exchange(n):
    return 1 if n == 0 else exchange(int(n / 2)) + exchange(int(n / 3)) + exchange(int(n / 4))


def main():
    print(exchange(int(input("Enter the coin value: "))))


if __name__ == '__main__':
    main()
