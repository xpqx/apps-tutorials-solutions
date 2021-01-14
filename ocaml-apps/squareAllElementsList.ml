
let rec square_all (xs:int list) : int list =
	match xs with
	| [] -> []
	| hd::tl -> (hd + hd)::(square_all tl)
;;

let rec map (f:int * int ->int * int) (xs:int list):int list =
	match xs with
	| []->[]
	| (hd* hd) ::tl -> (f hd)::(map f tl)
;;

let inc x = x + 1;;
let inc_all xs = map inc xs;;


