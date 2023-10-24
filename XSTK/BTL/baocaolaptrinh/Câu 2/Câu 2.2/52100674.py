rfile = open("input.txt", "r")
wfile = open("output.txt", "w")

tables = {}

# read input.txt and add data to tables dictionary
for line in rfile.readlines():
    fd = line[line.index(')') + 2:].strip('\n').split(',')
    fd_temp = []
    for j in fd:
        src, des = j.split('->')
        if '+' not in src:
            if '+' not in des:
                fd_temp.extend([[src, des]])
            else:
                fd_temp.extend([[src, des.split('+')]])
        else:
            if '+' not in des:
                fd_temp.extend([[src.split('+'), des]])
            else:
                fd_temp.extend([[src.split('+'), des.split('+')]])

    tables[line[0:line.index('(')]] = {
        'attrs': line.strip('\n')[line.index('(')+1:line.index(')')].split(','),
        'fds': fd_temp
    }


# function to find closure from list of attributes
def find_closure(table_name, X):
    while(True):
        isChanged = False
        for i in tables[table_name]['fds']:
            if type(i[0]) is not list and type(i[1]) is not list and i[0] in X and i[1] not in X:
                X.append(i[1])
                isChanged = True
            if type(i[0]) is list and type(i[1]) is not list and all(x in X for x in i[0]) and i[1] not in X:
                X.append(i[1])
                isChanged = True
            if type(i[0]) is not list and type(i[1]) is list and i[0] in X and any(x not in X for x in i[1]):
                X.extend(i[1])
                isChanged = True
            if type(i[0]) is list and type(i[1]) is list and all(x in X for x in i[0]) and any(x not in X for x in i[1]):
                X.extend(i[1])
                isChanged = True
        if isChanged == False:
            break
    return list(set(X))


X = ['B', 'G', 'H']
table_name = 'TEST'
wfile.write('X = ' + str(X) + '\n')
wfile.write('table = ' + str(table_name) + '\n')
wfile.write('closure of X = ' +
            str(find_closure('TEST', ['B', 'G', 'H'])) + '\n')


# function to find keys of tables
def find_key():
    keys = {}
    for table_name in tables.keys():
        res = []
        temp1 = tables[table_name]['attrs'].copy()
        for i in tables[table_name]['attrs']:
            temp = temp1.copy()
            temp.remove(i)
            if all(i in find_closure(table_name, temp) for i in tables[table_name]['attrs']):
                temp1.remove(i)
                res.append(i)
        keys[table_name] = [i for i in tables[table_name]['attrs'] if i not in res]
    return keys


wfile.write('keys = ' + str(find_key()) + '\n')
