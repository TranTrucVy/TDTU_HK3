from itertools import combinations
# input and output
rfile = open("input.txt", "r")
wfile = open("output.txt", "w")

tables = {}

# read input.txt and add data to tables dictionary
for line in rfile.readlines():
    fd = line[line.index(')') + 2:].strip().split(',');
    fds = []
    for j in fd:
        src, des = j.split('->')
        if '+' not in src:
            if '+' not in des:
                fds.extend([[src, des]])
            else:
                fds.extend([[src, des.split('+')]])
        else:
            if '+' not in des:
                fds.extend([[src.split('+'), des]])
            else:
                fds.extend([[src.split('+'), des.split('+')]])
    tables[line[0:line.index('(')]] = {
        'attrs': line.strip('\n')[line.index('(')+1:line.index(')')].split(','),
        'fds': fds
    }
# function to find closure from list of attributes

def closureOfSetAttributes(name, set_att):
    while(True):
        is_change = False;
        for Ul, Ur in tables[name]['fds']:
            if type(Ul) is not list and Ul in set_att:
                if type(Ur) is not list and Ur not in set_att:
                    set_att.append(Ur);
                    is_change = True;
                elif type(Ur) is list and any(item  not in set_att for item in Ur):
                    set_att.extend(Ur);
                    is_change = True;
            if type(Ul) is list and all(item in set_att for item in Ul):
                if type(Ur) is not list and Ur not in set_att:
                    set_att.append(Ur);
                    is_change = True;
                elif type(Ur) is list and any(item not in set_att for item in Ur):
                    set_att.extend(Ur);
                    is_change = True;
        if is_change == False:
            break;
    return list(set(set_att));

X = ['B', 'G'];
wfile.write("X: {}\n".format(X));
for table_name in tables.keys():
    wfile.write("CLOSURE OF {}: {}\n".format(table_name, closureOfSetAttributes(table_name, X)));
# function to find keys of tables   
def key():
    keys = {};
    for table_name in tables.keys():
        res = [];
        R = list(set([item for Ul, Ur in tables[table_name]['fds'] for item in Ur]));
        L = list(set([item for Ul, Ur in tables[table_name]['fds'] for item in Ul]));
        # TG = R - L
        TG = list(set(L).intersection(set(R)));
        U = tables[table_name]['attrs'];
        # TD = U - R
        TN = [item for item in U if item not in R]
        Xi = sum([list(map(list, combinations(TG, i))) for i in range(len(TG) + 1)], [])
        
        for item in Xi: 
            temp = TN + item;
            temp1 = temp.copy();
            closure_temp = closureOfSetAttributes(table_name, temp);
            if set(closure_temp) == set(tables.get(table_name)['attrs']):
                res.append(list(set(temp1)));
        keys[table_name] = [x for x in res if len(x) == len(min(res, key=len))];
    return keys;
wfile.write("KEYS: \n");
for table_name in key().keys():
    wfile.write("{} : {}\n".format(table_name, key().get(table_name)));
