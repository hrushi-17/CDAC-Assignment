let arr = [1,3,5,7,9,32,10,8,6,4,2] ;
 
let max = arr[0];
for(let i =0; i<arr.length; i++)
{
    if(max<arr[i])
    {
        max = arr[i]; 
    }
}

console.log("The Max Element in array is: " + max)
console.log("-------------------------------")

//////////////////////////////////////////////////////////////

arr.forEach(a => {
     if(max<a)
    {
        max = a; 
    }
    
});
console.log("The Max Element in array is: " + max)
console.log("-------------------------------")

//////////////////////////////////////////////////////////////

function findlargest(arr)
{
    arr.sort((a,b)=> a-b)
    return arr[arr.length-1]
}
console.log("The Max Element in array is: " + findlargest(arr))

