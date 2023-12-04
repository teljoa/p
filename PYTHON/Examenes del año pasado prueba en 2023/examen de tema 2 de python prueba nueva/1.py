from random import randint

codigoA=[4,11,14,18,21,23,29,41]

def generar_digito_cotrol(seguridadN):
    codigo_Control=seguridadN%12*97
    if 0<=codigo_Control<=9:
        codigo_Control=codigo_Control+0
    return codigo_Control

def es_emitido_andalucia(seguridadN):
    valido=False
    if seguridadN[:1] in codigoA:
        valido=True
    return valido

seguridadN="564365311"

print(es_emitido_andalucia(seguridadN))