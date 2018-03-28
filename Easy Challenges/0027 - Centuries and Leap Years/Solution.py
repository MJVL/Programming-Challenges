def Century(year):
	return (year / 100) if year % 100 == 0 else ((year - (year % 100)) / 100) + 1

def Leap_Year(year):
	return year % 400 == 0 or year % 4 == 0 and year % 100 != 0

def main():
	year = int(raw_input('Enter a year: '))
	print('Century: %d' % (Century(year)))
	print('Leap Year: %s' % ('Yes' if Leap_Year(year) else 'No'))

if __name__ == '__main__':
	main()