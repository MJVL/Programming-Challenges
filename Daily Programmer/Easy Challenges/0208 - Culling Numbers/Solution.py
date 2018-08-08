def cull_numbers(lst_nums):
    return set(lst_nums)


def main():
    print(cull_numbers(list(map(int, input("Enter unsigned integers on one line (space-delimited): ").split()))))


if __name__ == '__main__':
    main()
