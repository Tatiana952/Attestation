import globals

def filter(mode, filter_date):    
    filtered_list = []
    strJSON = globals.readJSON()
    if strJSON != None:
        for d in strJSON:
            creation_date = d[globals.fields[3]].split()[0].split('-')
            if mode == 1:
                if (int(creation_date[0]) == int(filter_date[0]) and
                int(creation_date[1]) == int(filter_date[1]) and
                int(creation_date[2]) == int(filter_date[2])):
                    filtered_list.append(d)
            elif mode == 2:
                if (int(creation_date[0]) < int(filter_date[0]) or     
                int(creation_date[0]) == int(filter_date[0]) and int(creation_date[1]) < int(filter_date[1]) or
                int(creation_date[0]) == int(filter_date[0]) and int(creation_date[1]) == int(filter_date[1]) and int(creation_date[2]) <= int(filter_date[2])):
                    filtered_list.append(d)
            elif mode == 3:
                if (int(creation_date[0]) > int(filter_date[0]) or     
                int(creation_date[0]) == int(filter_date[0]) and int(creation_date[1]) > int(filter_date[1]) or
                int(creation_date[0]) == int(filter_date[0]) and int(creation_date[1]) == int(filter_date[1]) and int(creation_date[2]) >= int(filter_date[2])):
                    filtered_list.append(d)
                    
        return(filtered_list)

# mode = 1
# d = ('2022', '5', '22')        
# filter(mode, d)