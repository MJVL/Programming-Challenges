def total_distance(inputs):
    return sum(distance(keyboard_coordinate(i)[1] - keyboard_coordinate(j)[1], keyboard_coordinate(i)[0] - keyboard_coordinate(j)[0]) for i, j in zip(inputs, inputs[1:]))


def distance(a, b):
    return (a ** 2 + b ** 2) ** .5


def keyboard_coordinate(c):
    return divmod('123456789.0'.index(c), 3)


def main():
    print("%.2fcm" % total_distance(input("Enter an IP address: ")))


if __name__ == '__main__':
    main()
