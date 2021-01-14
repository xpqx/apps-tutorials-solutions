
let rec len xs =
	match xs with
	| [] -> 0
	| hd :: tl -> 1 + len tl
;;


let a = len [1;2;3;4]
;;

