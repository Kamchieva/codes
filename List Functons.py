lucky_numbers = [3, 4, 5, 2, 9, 77]
friends = ["Kevin", "Karen", "Jim", "Jim", "Mario", "Cati"]
friends.extend(lucky_numbers)
friends.append("Creed")
friends.insert(3, "Alex")
friends.remove("Creed")
friends.pop()
print(friends.index("Cati"))
print(friends.count("Jim"))
friends.sort()
lucky_numbers.sort()
print(friends)
print(lucky_numbers)