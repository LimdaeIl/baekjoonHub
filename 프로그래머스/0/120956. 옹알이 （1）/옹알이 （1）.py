def solution(babbling):
    answer = 0

    sounds = ["aya", "ye", "woo", "ma"]

    for word in babbling:
        for sound in sounds:
            word = word.replace(sound, " ")

        if word.strip() == "":
            answer += 1

    return answer