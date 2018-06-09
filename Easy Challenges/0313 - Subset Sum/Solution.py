def subset_sum(int_set):
    for i in int_set:
        if 0 in int_set or -i in int_set:
            return True
    return False


def main():
    int_set = input("Enter distinct integers on one line (comma-delimited): ")
    print(subset_sum([] if int_set == "" else list(map(int, int_set.replace(" ", "").split(",")))))


if __name__ == '__main__':
    main()
