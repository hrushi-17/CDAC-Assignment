let sum = 0;
function add(...a)
{
    for (let i = 0; i < a.length;i++ )
    {
        sum = sum + a[i]
    }
    console.log("Sum of Numbers is: "+sum)
}
add(3, 5, 6);