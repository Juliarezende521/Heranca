# 📘 Exercícios de Java – Herança e Polimorfismo

## 📌 Sobre
Este projeto contém exercícios desenvolvidos em Java com foco em Programação Orientada a Objetos (POO), especialmente herança e polimorfismo.

O objetivo é praticar a reutilização de código e o comportamento dinâmico dos objetos.

---

## 🧠 Conceitos aplicados
- Herança  
- Polimorfismo  
- Sobrescrita de métodos (Override)  
- Organização de classes  

---

## 📂 Estrutura
src/
├── Desenvolvedor.java
├── DesenvolvedorFrontEnd.java
├── DesenvolvedorBackEnd.java
├── TestaDesenvolvedor.java

---

## ⚙️ Funcionamento
- `Desenvolvedor` é a classe base  
- As classes filhas herdam seus atributos e métodos  
- Cada tipo de desenvolvedor implementa seu próprio comportamento  

Exemplo de polimorfismo:

```java
public static void exibir(Desenvolvedor dev){
    dev.codar();
    System.out.println(dev.toString() + " Bonus " + dev.calcularBonus());
}
```
## 💡 Objetivo
Praticar conceitos de POO
Aplicar herança e polimorfismo
Simular cenários reais de programação
