def population_count(num):
	return list(bin(num)).count("1")


def main():
	i_num = int(input("Enter a number: "))
	print("Population count: %d" % population_count(i_num))


if __name__ == '__main__':
	main()
