
let rec inc_all (xs:int list):int list =
	match xs with
	| [] -> []
	| hd::tl -> (hd+1)::(inc_all tl)
;;
