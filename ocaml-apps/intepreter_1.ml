let e1 =
  let a = 30 in
  let a =
    (let a = 3 in a*4)
  in
    a+a
;;

let e2 =
  let x = 30 in
  let y =
    (let z = 3 in z*4)
  in
    y+y
;;

assert (e1 = e2);;