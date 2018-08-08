def to_camel(series):
    return series[0].lower() + "".join(s for s in series.title() if s.isalpha())[1:]


def to_snake(series):
    return series.replace(" ", "_").lower()


def to_upper_snake(series):
    return series.replace(" ", "_").upper()


def main():
    mode = int(input("Enter mode (0 - Camel Case, 1 - Snake Case, 2 - Capitalized Snake Case): "))
    series = str(input("Enter series: "))
    print(to_camel(series) if mode == 0 else (to_snake(series) if mode == 1 else (to_upper_snake(series))))


if __name__ == '__main__':
    main()
