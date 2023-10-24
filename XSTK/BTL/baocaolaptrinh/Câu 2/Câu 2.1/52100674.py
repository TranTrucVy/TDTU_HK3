# open input.txt, output.txt
rfile = open("input.txt", "r")
wfile = open("output.txt", "w")

for i in rfile.readlines():
    if '-' in i:
        # split line into table name and relational data
        temp = i.strip('\n').split('-')
        # create junction table if relation is many to many, linked junction table to 2 related table and write to output.txt
        if temp[1] == 'MM':
            wfile.write(temp[0] + '_' + temp[2] + ' -- ' +
                        temp[0] + '\n')
            wfile.write(temp[0] + '_' + temp[2] + ' -- ' +
                        temp[2] + '\n')
        # linked related tables and write to output.txt
        elif temp[1] == 'OM' or temp[1] == 'MO' or temp[1] == 'OO':
            wfile.write(temp[0] + ' -- ' + temp[2] + '\n')
    else:
        wfile.write(i)