def find_second_largest(numbers):
    distinct_numbers = sorted(set(numbers))
    if len(distinct_numbers) < 2:
        return None

    return distinct_numbers[-2]


numbers = [10, 25, 30, 45, 20, 45, 35]

print(find_second_largest(numbers))
