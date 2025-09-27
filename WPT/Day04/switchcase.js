let arr = [21,45,26,78,92,42,11]
console.log("choice: ")

switch(2)
{
    case 1:
        arr.push(7) //Adds 7 from end
        console.log(arr)
        break;
    
    case 2:
        arr.shift()
        console.log(arr)  // Removes the first element of the array
        break;
    case 3:
        arr.pop() //deletes the last element
        break;
    case 4:
        console.log(arr)
        arr.unshift(2)  //Adds 2 to the beginning of the array
        break;
    case 5:
        arr.splice(1,2)  //Removes 2 elements starting from index 1
        break;
    case 6:
        console.log(arr.slice(1,5))  //Return copy of elements from index 1 to 4
        break;
    
    default:
        console.log("Enter correct choice!!")
        break;
}