print("Tipo dos triângulos")

a = float(input("Digite o primeiro lado do triângulo: "))
b = float(input("Digite o segundo lado do triângulo: "))
c = float(input("Digite o terceiro lado do triângulo: "))

if a == b and b == c :
    print("Equilátero")

elif a == b or a == c or b == c:
    print("Isoceles")
    
else:
    print("Escaleno")