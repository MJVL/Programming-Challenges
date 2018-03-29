import pymsgbox
from apscheduler.schedulers.blocking import BlockingScheduler


def main():
    scheduler = BlockingScheduler()
    scheduler.add_job(pymsgbox.alert('Stop Procrastinating!', 'Title'), 'interval', hours=2)
    scheduler.start()


if __name__ == '__main__':
    main()
