import re

def solution(new_id):
    new_id = new_id.lower() # 1번 조건
    new_id = re.sub('[^a-z\d\-_.]', '', new_id) # 2번 조건
    new_id = re.sub('\.+', '.', new_id) # 3번 조건
    new_id = re.sub('^[.][.]$', '', new_id) # 4번 조건
    new_id = 'a' if len(new_id) == 0 else new_id[:15] # 5번 조건
    new_id = re.sub('[.]$', '', new_id) # 6번 조건
    new_id = new_id if len(new_id) > 2 else new_id + new_id[-1] * (3 - len(new_id)) # 7번 조건

    return new_id