valor_da_compra = float(input("Digite o valor da sua compra: "))
forma_de_pagamento = int(input("[1] para Dinheiro/Pix, [2] para Cartão: "))
parcelamento = int(input("[1] para compra à vista, [2] para 2x sem juros, [3] para 3x com juros de 10%: "))

if forma_de_pagamento <= 2 :

    if parcelamento <= 3 :

        if forma_de_pagamento == 1 and parcelamento == 3 :
            desconto = valor_da_compra - (valor_da_compra * 0.10)
            juros = desconto + (valor_da_compra * 0.20)
            parcela = valor_da_compra / parcelamento
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 10% por compra no pix e com juros de 20%: R${juros}, com 3 parcelas de {parcela}")

        elif forma_de_pagamento == 1 and parcelamento == 2 :
            desconto = valor_da_compra - (valor_da_compra * 0.10)
            parcela = valor_da_compra / parcelamento
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 10% por compra no pix: R${desconto}, com 2 parcelas de {parcela}")

        elif forma_de_pagamento == 1 and parcelamento == 1 :
            desconto = valor_da_compra - (valor_da_compra * 0.15)
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 15% por compra no pix: R${desconto}, com uma parcela única de {valor_da_compra}") 

        elif forma_de_pagamento == 2 and parcelamento == 1:
            desconto = valor_da_compra - (valor_da_compra * 0.05)
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 5% por compra no cartão: R${desconto}")

        elif forma_de_pagamento == 2 and parcelamento == 2 :
            desconto = valor_da_compra - (valor_da_compra * 0.05)
            parcela = valor_da_compra / parcelamento
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 5% por compra no cartão: R${desconto}, com 2 parcelas de {parcela}")

        elif forma_de_pagamento == 2 and parcelamento == 3 :
            desconto = valor_da_compra - (valor_da_compra * 0.05)
            juros = desconto + (valor_da_compra * 0.20)
            parcela = valor_da_compra / parcelamento
            print(f"Valor da compra: R${valor_da_compra}, com desconto de 5% por compra no cartão e com juros de 20%: R${juros}, com 3 parcelas de {parcela}")

    else :
        print(f"Valores inválidos, nosso programa aceita apenas [1] e [2], e você digitou:  {parcelamento}")

else :
    print(f"Valores inválidos, nosso programa aceita apenas [1], [2] e [3], e você digitou: {forma_de_pagamento}")