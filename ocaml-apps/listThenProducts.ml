
let rec prods (xs : (int * int) list) : int list =
	match xs with
	[] -> []
	| (x, y)::tail -> (x * y):: prods tail
;;


assert(prods [] = []);;

assert(prods [(2,3); (4,7); (5,2)] = [6; 28; 10]);;