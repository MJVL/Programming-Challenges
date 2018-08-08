def total_distance(inputs):
    return sum(distance(keyboard_coordinate(i), keyboard_coordinate(j)) for i, j in zip(inputs, inputs[1:]))


def distance(a, b):
    return ((a[0] - b[0]) ** 2 + (a[1] - b[1]) ** 2) ** .5


def keyboard_coordinate(c):
    return divmod('123456789.0'.index(c), 3)


def main():
    print("%.2fcm" % total_distance(input("Enter an IP address: ")))


if __name__ == '__main__':
    main()
