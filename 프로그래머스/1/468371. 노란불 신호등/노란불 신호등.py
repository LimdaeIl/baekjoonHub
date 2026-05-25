from math import gcd

def lcm(a, b):
    return a * b // gcd(a, b)

def solution(signals):
    limit = 1

    for G, Y, R in signals:
        cycle = G + Y + R
        limit = lcm(limit, cycle)

    for t in range(1, limit + 1):
        all_yellow = True

        for G, Y, R in signals:
            cycle = G + Y + R
            pos = (t - 1) % cycle

            if not (G <= pos < G + Y):
                all_yellow = False
                break

        if all_yellow:
            return t

    return -1