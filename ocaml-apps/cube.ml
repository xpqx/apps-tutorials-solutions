
let cube (n:int) : int =
  n * n * n
;;


let message (n:int) : string = 
  "The cube of " ^ string_of_int n ^ " is " ^ string_of_int (cube n)
;;

let arg1 : int = 2;;
let arg2 : int = 3;;


print_endline (message arg1);;
