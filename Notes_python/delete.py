import globals, os
       
def delete_note(id):
    strJSON = globals.readJSON()
    if strJSON != None:   
        del strJSON[id]  
        globals.writeJSON(strJSON)
        if len(strJSON) == 0:
            os.remove(globals.jsonchik)
        print("\nNote deleted sucessfully.")
    else:
        print("\nIt's impossible!")