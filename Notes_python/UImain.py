import globals

def hello():
    print("\nHello! This is an application for notes.\nHere you can create notes, read notes, edit them or delete \
and filter by date.\nYou also can show all notes.")

def bye():
    print("\nGood bye! Have a nice day!")
    
def succes_creation():
    print("\nNote was created succesful!")

def choose_mode():
    m = "1. Create note\n2. Show note\n3. Edit note\n4. Delete note\n5. Show all notes\n6. Close app\nMode:"
    print("\nChoose mode:")
    mode = input(m)
    
    while (not mode.isdigit() or int(mode) > 6 or int(mode) < 1):
        if not mode.isdigit():
            print("\nLetters are unacceptable. Choose number of mode:\n")
            mode = input(m)
        else: 
            print("\nChoose correct number of mode:\n")
            mode = input(m)
    
    return int(mode)

def choose_filter_mode():
    one = "1. Show notes on selected day"
    two = "2. Show all notes up to the selected date"
    three = "3. Show all notes after the selected date"
    
    print("\nChoose mode:")
    mode = input(f"{one}\n{two}\n{three}\nMode:")
    while (not mode.isdigit() or int(mode) > 3 or int(mode) < 1):
        if not mode.isdigit():
            print("\nLetters are unacceptable. Choose number of mode:\n")
            mode = input(f"{one}\n{two}\n{three}\nMode:")
        else: 
            print("\nChoose correct number of mode:\n")
            mode = input(f"{one}\n{two}\n{three}\nMode:")
    return int(mode)

def date_for_filter():
    calend = {1:31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}
    
    n_year = globals.n_year
    n_month = globals.n_month
    n_day = globals.n_day
    
    year = input("\nEnter year: ")
    
    while (not year.isdigit() or int(year) > n_year):
        if not year.isdigit():
            # print("\nLetters are unacceptable.")
            year = input("\nLetters are unacceptable.\nEnter year: ")
        else: 
            # print("\nIt's future year.\n")
            year = input("\nIt's future year.\nEnter year: ")    
    
    month = input("\nEnter number of month: ")
    while (not month.isdigit()
           or (int(year) == n_year and int(month) > n_month)
           or int(month) > 12 
           or int(month) < 1):
        if not month.isdigit():
            # print("\nLetters are unacceptable.")
            month = input("\nLetters are unacceptable.\nEnter number of month: ")
        elif(int(year) == n_year and int(month) > n_month): 
            # print("\nIt's future month.")
            month = input("\nIt's future month.\nEnter number of month: ")
        else:
            month = input("\nEnter number of month: ")
    
    day = input("\nEnter day: ")
    while (not day.isdigit()
           or calend[int(month)] < int(day) 
           or int(day) < 1
           or (int(year) == n_year and int(month) == n_month and int(day) > n_day)):
        print(calend[int(month)])
        if not day.isdigit():
            # print("\nLetters are unacceptable.")
            day = input("\nLetters are unacceptable.\nEnter day: ")
        elif calend[int(month)] < int(day) or int(day) < 1:
            print(f"\nThis day doesn't exist in month number {month}\n")
            day = input("Enter day: ")
        elif(int(year) == n_year and int(month) == n_month and int(day) > n_day): 
            # print("\nIt's future day.\n")
            day = input("\nIt's future day.\nEnter day: ")
    
    return year,month,day
    
def choose_show_mode():
    # print("\nDo you want to filter notes by date of creation?")
    mode = input("\nDo you want to filter notes by date of creation?\n1. Yes         2. No\nAnswer:")
    
    while (mode != "1" and mode != "2"):
        # if mode.lower != "1" or mode.lower != "2":
        mode = input("\nChoose number of mode.\nAnswer:")
    return int(mode)
    
def print_note(list2):
    if len(list2) == 0:
        print("\nNotes not found")
    else:
        print("-----------------")
        for d in list2:
            # print(type(list2[i]))
            for j in range(0,5):
                print(f"{globals.fields[j]}: {d[globals.fields[j]]}")
            print("-----------------")

def get_head_of_note():
    head = input("\nEnter full head of note or part of head: ")
    return head


def show_get_id():
    print("\nTo act, please choose ID:")
    data = globals.readJSON()
    if data != None:
        i = 0        
        for d in data:
            id = d[globals.fields[0]]
            print(f"{i}. {id}")
            i += 1
        getId = input("\nEnter ID position: ")
        while not getId.isdigit() or int(getId) > i-1 or int(getId) < 0:
            getId = input("\nEnter ID position: ")
        return int(getId)
    else:
        print("\nFile database.json not found. Create at least one note")