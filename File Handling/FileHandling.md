# Create a new File :-
    File f1 = new File("File Path");
    f1.createNewFile();

# Update a File :-
    FileWriter fw = new FileWriter("File Path");
    fw.write(int x);
    fw.write(char[] c);
    fw.(char[] c, int off, int len);
    fw.write(String s);
    fw.write(String s, int off, int len);

# Read a File :-
    FileInputStream fis=new FileInputStream("File Path");
    int x=fis.read();
			while(x!=-1) {
				if(x>=48 && x<=57)
					count++;
				x=fis.read();
			}

# Serialization :-
    Convert Object into byte
    1.) Create a Object
    FileObject fo = new FileObject(int, String);
    2.) Create a File 
    FileOutputStream file = new FileOutputStream(path);
    3.) Provide File reference to Object 
    ObjectOutputStream out = new ObjectOutputStream(file);
    4.) write in Object 
    out.writeObject(fo);

# Deserialization :-
    Convert byte into Object
    1.) Create a Object 
    FileObject fo = new FileObject(int, String);
    2.) Reading the object from a file
    FileInputStream file = new FileInputStream(path);
    ObjectInputStream in = new ObjectInputStream(file);
    3.) Method for deserialization of object
    fo = (FileObject)in.readObject();

# Transient Keyword :-
restrict serialization
it's aplicable to non-static and intance data members
we can't serialized a method and var
