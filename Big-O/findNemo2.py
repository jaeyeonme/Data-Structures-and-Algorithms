import time

nemo = ['nemo']
everyone = ['dory', 'bruce', 'marlin', 'nemo', 'gill',
            'bloat', 'nigel', 'squirt', 'darla', 'hank']
large = ['nemo' for i in range(100000)]


def find_nemo(array):
    t0 = time.time()
    for i in range(0, len(array)):
        if array[i] == 'nemo':
            print("Found NEMO!")
    t1 = time.time()
    print(f'The Search took {t1 - t0} seconds.')


find_nemo(nemo)
find_nemo(everyone)
find_nemo(large)
