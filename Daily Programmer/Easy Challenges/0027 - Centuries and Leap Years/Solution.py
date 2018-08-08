def century(year):
	return (year / 100) if year % 100 == 0 else ((year - (year % 100)) / 100) + 1


def leap_year(year):
	return year % 400 == 0 or year % 4 == 0 and year % 100 != 0


def main():
	year = int(input("Enter a year: "))
	print("Century: %d" % century(year))
	print("Leap Year: %s" % "Yes" if leap_year(year) else "No")


if __name__ == '__main__':
	main()
