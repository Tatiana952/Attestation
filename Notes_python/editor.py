import globals, create_note
   

def edit(id):
    data = globals.readJSON()
    if data != None:
        newData = create_note.enter_data()
        data[id][globals.fields[1]] = newData[0]
        data[id][globals.fields[2]] = newData[1]
        data[id][globals.fields[4]] = newData[2]
        globals.writeJSON(data)
        print("\nNote edited sucessfully.")
    else:
        print("\nIt's impossible!")