val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val s = "programming"

val enc = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.length)
val dec = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) - key).abs % a.length)

val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))

val ct = cipher(enc, s, 5, alphabet)
val pt = cipher(dec, ct, 5, alphabet)

print(ct)
print(pt)