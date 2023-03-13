// @ts-check
import { test, expect } from '@playwright/test';


test('My PlayWright Test Tutu.ru', async ({ page }) => {
    // Идем на сайт Google
    await page.goto('https://www.google.com/');
    // Проверяем заголовок 
    await expect(page).toHaveTitle(/Google/);
    // Переходи в строку поиска
    await page.getByRole('combobox', { name: 'Найти' }).click();
    // Вбиваем tutu ru
    await page.getByRole('combobox', { name: 'Найти' }).fill('билеты');
    // Начинаем поиск, нажимаем Enter
    await page.getByRole('combobox', { name: 'Найти' }).press('Enter');
    // В результатах поиска находим 'Tutu.ru: Авиа, ЖД, билеты на автобус и туры онлайн ...' и переходим по ссылке
    await page.getByRole('link', { name: 'Tutu.ru: Авиа, ЖД, билеты на автобус и туры онлайн ...' }).click();
    // Проверяем заголовок
    await expect(page).toHaveTitle(/Tutu.ru: Авиа, ЖД, билеты на автобус и туры онлайн/);
    // Создаем локатор "Отели"
    const hotel = page.locator('.b-visible_tabs > a').first();
    // проверяем атрибут - ссылку на сайт https://hotel.tutu.ru/
    await expect(hotel).toHaveAttribute('href', 'https://hotel.tutu.ru/');
    //переходим на сайт https://hotel.tutu.ru через 'click'
    await page.locator('.b-visible_tabs > a').first().click();
    // проверяем что URL бедет содержать 'hotel.tutu.ru'
    await expect(page).toHaveURL(/.*hotel.tutu.ru/);
    // Проверяем заголовок 
    await expect(page).toHaveTitle(/Бронирование отелей/);
    // await page.getByLabel('Еду в командировку').check();
});


test('My PlayWright Test TOURS Tutu.ru', async ({ page }) => {
    // Возвращаемся на сайт Tutu.ru
    await page.goto('https://www.tutu.ru/');
    // создаем локатор Туры
    const tours = page.locator('.b-visible_tabs > a:nth-child(6)');
    // проверяем атрибут - ссылку на сайт https://tours.tutu.ru/
    await expect(tours).toHaveAttribute('href', 'https://tours.tutu.ru/');
    //переходим на сайт Туры - https://tours.tutu.ru/
    await page.locator('.b-visible_tabs > a:nth-child(6)').click();
    // проверяем что URL бедет содержать 'tours.tutu.ru'
    await expect(page).toHaveURL(/.*tours.tutu.ru/);
    // Проверяем Заголовок
    await expect(page).toHaveTitle(/Поиск и подбор туров онлайн от/);


});