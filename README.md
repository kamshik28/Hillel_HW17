# Product Price Analyzer

## Опис проєкту

Цей проєкт демонструє роботу з  **Stream API** для обробки списків продуктів. Програма групує продукти за категоріями, обчислює середню ціну для кожної категорії та визначає категорію з найвищою середньою ціною.



## Структура проєкту

- **Product.java**: Клас, що представляє продукт із полями: назва, категорія та ціна. Містить конструктор, геттери/сеттери та перевизначені методи `toString`, `equals` і `hashCode`.
- **Main.java**: Головний клас, що ініціалізує список продуктів, обробляє дані за допомогою Stream API та виводить результати у консоль.
