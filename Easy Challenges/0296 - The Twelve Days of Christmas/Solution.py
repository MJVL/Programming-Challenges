import math


def twelve_days_of_christmas():
    gifts = ["twelve drummers drumming", "eleven pipers piping", "ten lords a-leaping", "nine ladies dancing", "eight maids a-milking", "seven swans a-swimming", "six geese a-laying", "five gold rings", "four calling birds", "three french hens", "two turtle doves", "a partridge in a pear tree"][::-1]
    [print("On the " + ordinal(n + 1) + " day of Christmas\nmy true love gave to me:\n"+"\n".join(["and " + gifts[i] if i == 0 and n > 0 else gifts[i] for i in range(n, -1, -1)]) + "\n") for n in range(len(gifts))]


def ordinal(i):
    return "%d%s" % (i, "tsnrhtdd"[(math.floor(i / 10) % 10 != 1)*(i % 10 < 4) * i % 10::4])


def main():
    twelve_days_of_christmas()


if __name__ == '__main__':
    main()