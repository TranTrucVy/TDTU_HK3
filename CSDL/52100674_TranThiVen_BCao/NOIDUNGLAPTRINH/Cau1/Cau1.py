#read and write files
rfile = open('input.txt','r')
wfile = open('output.txt','w')

#read files input
for line in rfile.readlines():
    #split string and get relationship from input file
    line = line.strip().split(':');
    relationship_input = line[1].strip();
    
    #split string and get table in database schema
    data = line[0].strip().split('--');
    
    #merge relationship and table into a list
    data.append(str(relationship_input));
    
    relation = data[-1];
    tables = data[:-1];
    if relation == '1-1' or relation == '1-N': 
        txt = "{} -- {}\n".format(*tables);
        wfile.write(txt);
    if relation == 'N-N':
        main = "_".join(tables);
        for i in data[:-1]:
            txt = "{} -- {}\n".format(main, i);
            wfile.write(txt);