const user = {
   "name":"Chinmay",
    "rollno" : 16,
    "marks" : 17
}

console.log(user);

const jsonstring = JSON.stringify(user)
console.log(jsonstring);

const jsonobj = JSON.parse(jsonstring)
console.log(jsonobj.name, jsonobj.rollno, jsonobj.marks)

const jsonmap  = [jsonstring].map(JSON.parse);
console.log(jsonmap)