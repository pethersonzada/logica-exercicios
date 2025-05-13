idade = int(input("Digite sua idade: "))
sexo = input("Digite seu sexo [M/F]: ").upper()

if idade < 18:
    print("Você não entra.")

elif idade >= 18 and sexo == "M":
    print("Seja bem vindo! Entradas apartir de R$10,00")
    
else:
    print("Seja bem vinda! Entradas apartir de R$5,00")