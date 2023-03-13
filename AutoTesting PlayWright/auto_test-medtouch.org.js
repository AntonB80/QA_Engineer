// @ts-check
import { test, expect } from '@playwright/test';

test('medtouch.org', async ({ page }) => {
  // Идем на сайт https://medtouch.org/
  await page.goto('https://medtouch.org/');
  // Проверяем заголовок 
  await expect(page).toHaveTitle(/Образовательная медицинская платформа MEDTOUCH/);
  // Закрываем Использование cookie
  await page.getByRole('button', { name: 'Закрыть' }).click();
  // Создаем локатор "Эксперты" и перход на него
  await page.getByRole('link', { name: 'Эксперты' }).click();
  // проверяем атрибут - Эксперта Волкова Анна Ральфовна и текст карточки
  await expect(page.getByText('Волкова Анна Ральфовна', { exact: true })).toBeVisible();
  await expect(page.getByText('д.м.н., профессор, профессор кафедры факультетской терапии Санкт-Петербургского Государственного медицинского университета имени академика И.П. Павлова', { exact: true })).toBeVisible();
  //Переходим в карточку Волковой Анны Ральфовны
  await page.getByRole('link', { name: 'Волкова Анна Ральфовна' }).click();
  // проверяем что URL бедет содержать - volkova
  await expect(page).toHaveURL(/.*volkova/);
  // Проверяем наличие информации об эксперте 
  await expect(page.getByText('д.м.н., профессор, профессор кафедры факультетской терапии Санкт-Петербургского Государственного медицинского университета имени академика И.П. Павлова ', { exact: true })).toBeVisible();
  // Возвращаемся на вкладку эксперты
  await page.goto('https://medtouch.org/speakers/');
  // Загружаем следующую страницу "Загрузить еще"
  await page.getByRole('link', { name: 'Загрузить еще' }).click();
  // проверяем атрибут - Эксперта Бурчакова Милана Николаевна и текст карточки
  await expect(page.getByText('Бурчакова Милана Николаевна', { exact: true })).toBeVisible();
  await expect(page.getByText('Супружеский и перинатальный психолог. Действительный Член Психотерапевтической Профессиональной Лиги.', { exact: true })).toBeVisible();
  //Переходим в карточку Бурчакова Милана Николаевна
  await page.getByRole('link', { name: 'Бурчакова Милана Николаевна' }).click();
  // проверяем что URL бедет содержать burchakova
  await expect(page).toHaveURL(/.*burchakova/);
  // Проверяем наличие информации об эксперте 
  await expect(page.getByText('Супружеский и перинатальный психолог. Действительный Член Психотерапевтической Профессиональной Лиги.', { exact: true })).toBeVisible();
});
