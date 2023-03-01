import UImain
import create_note
import show_notes, filter, delete, editor, globals

def main():
    UImain.hello()
    mode = UImain.choose_mode()
    ch = globals.checker()
    while mode != 6:
        if mode == 1:
            data = create_note.enter_data()
            create_note.create_note(data)
            UImain.succes_creation()
        elif ch == -1:
            print("\nFile with database not found. Please first create at least one note.")
        elif mode == 2:
            f = UImain.choose_show_mode()
            if f == 1:
                filter_mod = UImain.choose_filter_mode()
                dateff = UImain.date_for_filter()
                list = filter.filter(filter_mod, dateff)
                UImain.print_note(list)
            else:
                head = UImain.get_head_of_note()
                list = show_notes.show_by_head(head)
                if isinstance(list, str):
                    print(list)
                else:
                    UImain.print_note(list)            
        elif mode == 3:
            id = UImain.show_get_id()
            editor.edit(id)
        elif mode == 4:
            id = UImain.show_get_id()
            delete.delete_note(id)
        elif mode == 5:
            list = show_notes.show_all()
            if isinstance(list, str):
                    print(list)
            else:
                UImain.print_note(list)
        mode = UImain.choose_mode()
        ch = globals.checker()
            
    UImain.bye()        
            
        
        
    

main()
    
    
    