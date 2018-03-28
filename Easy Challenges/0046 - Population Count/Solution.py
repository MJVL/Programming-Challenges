i_num = int(raw_input('Enter a number: '))
b_num = list(bin(i_num))
print('The population count of %d is %d.' % (i_num, b_num.count('1')))
