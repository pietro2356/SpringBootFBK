# SpringBootFBK
Progetto realizzato in collaborazione con FBK in SpringBoot

# Binding porte 
* config-server: **9999:9999**
* eureka: **8761:8761**
* catalogue: **7777:7777**
* purchase: **7788:7788**

---
# Chiamate API 
### Catalogue:
- **Lista di tutti i prodotti:**
    - Richiesta: **GET**
    - API: ```/products```

- **Singolo prodotto per ID:**
    - Richiesta: **GET**
    - Parametri: ***ID prodotto***
    - API: ```/products/{id}```

- **Lista dei prodotti per categoria:**
    - Richiesta: **GET**
    - Parametri: ***Nome categoria***
    - API: ```/products/category/{category}```

- **Creare un nuovo prodotto:**
    - Richiesta: **POST**
    - Body JSON: ***Prodotto formato JSON***
    - API: ```/products```

- **Modifica disponibilità di un certo prodotto:**
    - Richiesta: **PUT**
    - Parametri: ***ID Prodotto*, *Differenza***
    - API: ```/products/{id}/availability/{diff}```

### Purchase:
- **Comprare un prodotto:**
    - Richiesta: **POST**
    - Parametri: ***ID Utente***, ***ID Prodotto***, ***Quantità***
    - API: ```/api/purchases/{userId}/{productId}/{quantity}```

- **Lista degli ordini di un certo utente:**
    - Richiesta: **GET**
    - Parametri: ***ID Utente***
    - API: ```/api/purchases/{userId}```

- **Ottenere l'ordine X di un certo utente:**
    - Richiesta: **GET**
    - Parametri: ***ID Utente***, ***ID Ordine***
    - API: ```/api/purchases/{userId}/{id}```
