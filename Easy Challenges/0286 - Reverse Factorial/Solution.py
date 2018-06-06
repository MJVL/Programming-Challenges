def reverse_factorial(n, divisor):
    if n / divisor == 1:
        return n
    return 0 if n % divisor > 0 else reverse_factorial(n / divisor, divisor + 1)


def format_factorial(n):
    return "None" if n == 0 else "%d!" % n


def main():
    num = int(input("Enter an integer: "))
    print("%d = %s" % (num, format_factorial(reverse_factorial(num, 2))))


if __name__ == '__main__':
    main()
