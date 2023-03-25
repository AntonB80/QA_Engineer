«Тестирование API»

Для тестирования используется сайт https://editor.swagger.io/ Здесь представлен тестовый магазин Petstore со всеми запросами.

Коллекция:
Реализована postman - коллекцию которые проверяют жизненный цикл питомца по системе CRUD:
● Create
● Read
● Update
● Delete

Тесты:
Первый тесть – проверяем что переменная test1 (которая является элементом json - status) равна значению – pending (в ожидании)
Второй тесть – проверяем что переменная test2 (которая является элементом json - tags, в которой второй элемент массива [0] имеет элемент – name) равна значению – Princess
Третий тест – проверяет соответствие разных переменных объекта

Для удобства можете воспользоваться кнопкой!
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/24172906-72f9d3c1-0182-408f-a5d5-141ff74a2691?action=collection%2Ffork&collection-url=entityId%3D24172906-72f9d3c1-0182-408f-a5d5-141ff74a2691%26entityType%3Dcollection%26workspaceId%3Df3d8e297-8d97-416f-92f5-c9622e29fb7c)<br/>
