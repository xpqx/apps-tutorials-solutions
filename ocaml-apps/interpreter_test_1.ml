type variable = string
type op = Plus | Minus | Times | …
type exp =
| Int_e of int
| Op_e of exp * op * exp
| Var_e of variable
| Let_e of variable * exp * exp
type value = exp
let e1 = Int_e 3 