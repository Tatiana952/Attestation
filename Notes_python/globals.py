from datetime import datetime
import os, json

fields = ["ID","Head of note", "Body of note", "Date of creation", "Last modified date"]

n_year = int(datetime.now().year)
n_month = int(datetime.now().month)
n_day = int(datetime.now().day)
now = str(datetime.now())

jsonchik = 'database.json'

def readJSON():
    check = checker()
    if check == 1:
        with open(jsonchik, encoding='utf-8') as f: 
            data = json.load(f)
        return data

def writeJSON(data):
    with open(jsonchik, 'w') as db:
        json.dump(data, db, default=str, ensure_ascii=False, indent=2)

def checker():
    if os.path.isfile(jsonchik) == False:
        return -1
    else:
        return 1