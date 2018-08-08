from math import log2


def shannon_entropy(seq):
    return -sum(seq.count(l) / len(seq) * log2(seq.count(l) / len(seq)) for l in set(seq))


def main():
    print("%.5f" % shannon_entropy(input("Enter sequence: ")))


if __name__ == '__main__':
    main()
