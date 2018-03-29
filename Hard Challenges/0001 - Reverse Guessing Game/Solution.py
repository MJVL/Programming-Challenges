class Guesser(object):
    def __init__(self, lower_bound=1, upper_bound=100):
        self.lower_bound = lower_bound
        self.upper_bound = upper_bound
        self.num_guesses = 0

    def check_validity(self):
        if self.lower_bound > self.upper_bound:
            print('Your number doesn\'t exist!')
            quit()

    def play_game(self):
        while True:
            self.check_validity()
            self.num_guesses += 1
            guess = self.guess_num()
            print('My guess is %d' % guess)
            answer = input('Is your number [h]igher, [l]ower, or was I [c]orrect?\n')
            if answer == 'h':
                self.lower_bound = guess + 1
            elif answer == 'l':
                self.upper_bound = guess - 1
            elif answer == 'c':
                print('I guessed your number in %d guess(es).' % self.num_guesses)
                quit()
            else:
                self.num_guesses -= 1
                print('Invalid input.')

    def guess_num(self):
        return int((self.upper_bound + self.lower_bound) / 2)


def main():
    number_guesser = Guesser()
    number_guesser.play_game()


if __name__ == '__main__':
    main()
