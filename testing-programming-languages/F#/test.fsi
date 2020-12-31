open System

let sign num =
    if num < 0 then "negative"
    elif num = 0 then "zero"
    
    
let main() =
    Console.WriteLine("sign 22: {0}", (sign 51))
    
    
main()
