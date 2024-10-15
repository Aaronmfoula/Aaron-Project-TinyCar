 
# prix total TTC de la voiture en fonction du prix Ht, du taux de de tva 
 

prixHt = 100 # float
tauxTVA= 0.20  # float

prixTCC = prixHt + prixHt*tauxTVA
print(prixTCC)


prixHt = float(input("Quel est le prix Hors Taxe? : ")) # l'utilisateur saisi le prix hors taxe
tauxTVA = 0.20 # on définit le taux TVA à 20%
prixTCC = prixHt + prixHt*tauxTVA #calcule le prix total, toutes taxes comprises

print("total du montant payer : " + str(prixTCC)) # le système affiche le prixTTC

# les fonctions de saisies float et input 


# on demande à l'utilisateur de rentrer la marque de son véhicule 
marque = input("quelle est la marque de votre véhicule") # type : str chaine de caractère,

# le système demande à l'utilisateur de rentrer le modèle de son véhicule 
modèle = input("quelle est le modèle de votre véhicule") # type : str chaine de caractère,
# fonction de saisie: input

 # l'utilisateur saisit le prix hors taxe

prixHt = float(input("quel est le prix hors taxe? : "))
tauxTVA = 0.20 # on définit le taux de TVA à 20%

#calcule le prix total, toutes taxes comprises 
prixTCC = prixHt + prixHt*tauxTVA


# le système affiche le prixTTC 

print("Total du montant à payer : " + str(prixTCC))

