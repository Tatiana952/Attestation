import globals

def show_all():
    list = []
    data = globals.readJSON()
    if data != None:
        for d in data:
            list.append(d)
        return list
    else:
        print("\nIt's impossible!")

def show_by_head(head):
    list = []
    data = globals.readJSON()
    if data != None:
        for d in data:
            head_from_db = str(d[globals.fields[1]].lower())
            if head_from_db.find(head.lower()) != -1:
                list.append(d)
        if len(list) == 0:
            return "\nNote not found."
        else:
            return list
    else:
        print("\nIt's impossible!")