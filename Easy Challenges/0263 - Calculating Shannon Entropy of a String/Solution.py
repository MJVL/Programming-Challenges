from math import log2


def shannon_entropy(str):
    return -sum(str.count(l) / len(str) * log2(str.count(l) / len(str)) for l in set(str))


def main():
    print("%.5f" % shannon_entropy(input("Enter sequence: ")))


if __name__ == '__main__':
    main()
