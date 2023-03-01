import uuid
from datetime import datetime
import globals

UID = uuid.uuid1()

list = globals.fields

def enter_data():
    head = ""
    while (len(head) == 0):
        head = input("\nEnter head of note:")
        
    body = ""
    while (len(body) == 0):
        body = input("Enter body of note:")
        
    now = datetime.now()
    
    return head, body, now
    
def create_note(data):
    dict = {list[0]:UID, list[1]: data[0], list[2]: data[1], list[3]: data[2], list[4]: data[2]}
    if globals.checker() == -1:
        strJSON = []
        strJSON.append(dict)
        globals.writeJSON(strJSON)
    else:
        strJSON = globals.readJSON()
        strJSON.append(dict)
        globals.writeJSON(strJSON)
        # with open(globals.jsonchik, 'w') as db:
        #     json.dump(data, db, default=str, ensure_ascii=False, indent=2)
        
        
        