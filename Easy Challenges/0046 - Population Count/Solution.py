def Population_Count(num):
	return list(bin(num)).count('1')

def main():
	i_num = int(raw_input('Enter a number: '))
	print('Population count: %d' % (Population_Count(i_num)))

if __name__ == '__main__':
	main()
