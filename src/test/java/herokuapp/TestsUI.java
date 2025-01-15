package herokuapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import pages.herokuapp.*;

import java.awt.*;
import java.util.List;

public class TestsUI extends BaseTests {


    @Test
    @DisplayName("Переход на страницу A/B Testing")
    @Tag("Sanity")
    public void test_go_to_ab_testing_page ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_ab_testing_page();

    }


    @Test
    @DisplayName("Добавление/удаление элемента на странице Add/Remove Elements")
    @Tag("Smoke")
    public void test_add_remove_element () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_add_remove_elements_page()
                .add_element()
                .remove_element();

        Thread.sleep(2000);

        Heroku_add_remove_elements_page addRemoveElementsPage = new Heroku_add_remove_elements_page(driver);
        addRemoveElementsPage.add_element();
        addRemoveElementsPage.remove_element();


    }

    @Test
    @Tag("Smoke")
    @DisplayName("Добавление/удаление N элементов на странице Add/Remove Elements")
    public void test_add_remove_n_elements () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_add_remove_elements_page();
        Heroku_add_remove_elements_page addRemoveElementsPage = new Heroku_add_remove_elements_page(driver);
        addRemoveElementsPage.add_n_elements(10);
        Thread.sleep(2000);
        addRemoveElementsPage.remove_all_elements();

    }

    @Test
    @DisplayName("Переход на страницу Basic Auth с авторизацией")
    @Tag("Smoke")
    public void test_go_to_basic_auth_page_with_authorization ()  {

        driver.get("http://the-internet.herokuapp.com/");
        Heroku_basic_auth_page page = new Heroku_basic_auth_page(driver);
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");


    }

    @Test
    @DisplayName("Переход на страницу Digest Authentication с авторизацией")
    @Tag("Smoke")
    public void test_go_to_digest_auth_page_with_authorization ()
    {

        HasAuthentication authentication= (HasAuthentication) driver;
        authentication.register(() -> new UsernameAndPassword("admin", "admin"));
        driver.get("http://the-internet.herokuapp.com/digest_auth");

    }


    @Test
    @DisplayName("Поиск сломанных картинок на странице Broken Images")
    @Tag("Smoke")
    public void test_find_broken_images ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_broken_images_page().find_broken_image();

    }


    @Test
    @DisplayName("Поиск текста в таблице на странице Challenging DOM")
    @Tag("Smoke")
    public void test_search_text_from_table ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println (
                mainPage.goto_challenging_dom_page().get_text_from_table("Definiebas4","5", "4")
        );

    }

    @Test
    @DisplayName("Поиск атрибута tagName в таблице, на странице Challenging DOM")
    @Tag("Smoke")
    public void test_get_attribute_tagName ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println (
                mainPage.goto_challenging_dom_page().get_canvas_tag_name()
        );

    }


    @Test
    @DisplayName("Выбор чекбоксов на странице Checkboxes")
    @Tag("Smoke")
    public void test_check_checkboxes ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_Checkboxes_page().check_checkboxes();
    }


    @Test
    @DisplayName("Нажать на кнопку контекстного меню")
    @Tag("Smoke")
    public void test_click_context_menu_button () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_context_menu_page().click_context_menu();
    }


    @Test
    @DisplayName("Проверка наличия всех кнопок на странице Disappearing Elements")
    @Tag("Smoke")
    public void get_disappearing_elements ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_disappearing_elements_page().search_buttons();
    }


    @Test
    @DisplayName("Изменение положения столбцов А и В на странице Drag and Drop")
    @Tag("Smoke")
    public void test_change_columns_AB ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_drag_and_drop_page().
                change_columns("A").
                change_columns_back("B");
    }

    @Test
    @DisplayName("Выбор вариантов из выпадающего списка")
    @Tag("Smoke")
    public void test_choose_dropdown_option ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dropdown_page().choose_option_in_dropdown("1");
    }

    @Test
    @DisplayName("Поиск имперского солдата")
    @Tag("Smoke")
    public void test_find_empire_soldier ()
    {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_content_page().search_empire_soldier();
    }

    @Test
    @DisplayName("Удаление/добавление галочки чекбокса")
    @Tag("Sanity")
    public void test_add_remove_checkbox () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_controls_page().check_checkbox().uncheck_checkbox();

    }

    @Test
    @DisplayName("Удаление/добавление чекбокса")
    @Tag("Sanity")
    public void test_add_remove_button_checkbox () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_controls_page().remove_checkbox().add_checkbox();

    }

    @Test
    @DisplayName("Удаление/добавление чекбокса")
    @Tag("Sanity")
    public void test_add_remove_text_field () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_controls_page()
                .enable_text_field()
                .insert_text_into_field("Stas")
                .disable_text_field();


    }

    @Test
    @DisplayName("Удаление/добавление чекбокса и активации/деактивации поля ввода текста")
    @Tag("Smoke")
    public void test_add_remove () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_controls_page()
                .check_checkbox()
                .uncheck_checkbox()
                .remove_checkbox()
                .add_checkbox()
                .enable_text_field()
                .insert_text_into_field("Stas")
                .disable_text_field();
    }

    @Test
    @DisplayName("Поиск скрытого элемента на странице Dynamic loading 1")
    @Tag("Sanity")
    public void test_search_hidden_element () {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_loading_page()
                .goto_dynamic_first_page()
                .search_hidden_element();
    }

    @Test
    @DisplayName("Поиск отсутствующего элемента на странице Dynamic loading 2")
    @Tag("Sanity")
    public void test_missing_hidden_element () {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_dynamic_loading_page()
                .goto_dynamic_second_page()
                .search_missing_element();
    }

    @Test
    @DisplayName("Открытие и закрытие модального окна на странице Entry Ad")
    @Tag("Sanity")
    public void test_open_close_modal() {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_entry_ad_page()
                .close_modal_window()
                .open_modal_window()
                .close_modal_window();
    }

    @Test
    @DisplayName("Вызов и закрытие модального окна на странице Exit Intent")
    @Tag("Sanity")
    public void test_summon_close_modal () throws  AWTException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_exit_intent_page()
                .summon_modal_window()
                .close_modal_window();
    }

    @Test
    @DisplayName("Загрузка файла на странице File Download")
    @Tag("Sanity")
    public void test_download_file () throws InterruptedException {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_download_page().download_file();

    }

    @Test
    @DisplayName("Загрузка файл на страницу File Upload")
    @Tag("Sanity")
    public void test_upload_file ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_upload_page().upload_file();

    }

    @Test
    @DisplayName("Нажать на кнопки в floating menu")
    @Tag("Sanity")
    public void test_floating_menu ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_floating_menu_page()
                .click_home()
                .click_about()
                .click_contact()
                .click_news();
    }

    @Test
    @DisplayName("Поменять пароль на странице Forgot Password")
    @Tag("Sanity")
    public void test_forgot_password ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_forgot_password_page()
                .insert_email("123456789@mail.ru")
                .submit_password_retrieve();
    }

    @Test
    @DisplayName("Проверка log_in и log_out")
    @Tag("Smoke")
    public void test_login ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_login_page()
                .true_username_and_password("tomsmith","SuperSecretPassword!")
                .text_check()
                .log_out();

    }

    @Test
    @DisplayName("Залогинится с неверным именем пользователя на странице Login Page")
    @Tag("Sanity")
    public void test_login_username_error ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_login_page()
                .false_username("1","SuperSecretPassword!");
    }

    @Test
    @DisplayName("Залогинится с неверным паролем на странице Login Page")
    @Tag("Sanity")
    public void test_login_password_error ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_login_page()
                .false_password("tomsmith","1!");
    }

    @Test
    @DisplayName("Поиск текста в верхнем nested frame")
    @Tag("Sanity")
    public void test_frames_nested_top ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_frames_page()
                .go_to_nested_frames()
                .get_text_left_top_frame();

    }

    @Test
    @DisplayName("Поиск текста в нижнем frame")
    @Tag("Sanity")
    public void test_frames_nested_bottom ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_frames_page()
                .go_to_nested_frames()
                .get_text_bottom_frame();
    }

    @Test
    @DisplayName("Поиск текста в iframe")
    @Tag("Sanity")
    public void test_frames_iframes ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_frames_page()
                .go_to_iframes()
                .get_text_iframe();

    }

    @Test
    @DisplayName("Узнать геолокацию ")
    @Tag("Sanity")
    public void test_get_geolocation ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_geolocation_page()
                .click_get_geolocation_button();

    }

    @Test
    @DisplayName("Подвинуть slider ")
    @Tag("Sanity")
    public void test_move_slider ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_horizontal_slider_page()
                .move_slider_right(4);

    }

    @Test
    @DisplayName("Увидеть данные всех пользователей на странице Hovers ")
    @Tag("Sanity")
    public void test_get_all_avatars ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_hovers_page()
                .get_all_avatars();

    }
    @Test
    @DisplayName("Пролистать бесконечный список")
    @Tag("Sanity")
    public void test_scroll_infinite_list ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_infinite_scroll_page()
                .scroll_list(10);

    }

    @Test
    @DisplayName("Ввести данные в поле ввода")
    @Tag("Sanity")
    public void test_insert_input_numbers ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_inputs_page()
                .insert_input_numbers("123");
    }

    @Test
    @DisplayName("Нажать кнопку ок в алерте JS")
    @Tag("Sanity")
    public void test_accept_js_alert ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_javascript_alerts_page()
                .accept_js_alert();
    }

    @Test
    @DisplayName("Нажать кнопку ок на подтверждении JS")
    @Tag("Sanity")
    public void test_accept_js_confirm ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_javascript_alerts_page()
                .accept_js_confirm();
    }

    @Test
    @DisplayName("Ввести значение в prompt JS")
    @Tag("Sanity")
    public void test_insert_into_js_prompt ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_javascript_alerts_page()
                .insert_data_into_js_prompt("Stas");
    }

    @Test
    @DisplayName("Узнать логи браузера в ошибке JS")
    @Tag("Sanity")
    public void test_get_logs_of_error_js ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_javascript_error_page().get_all_level_logs_js();

    }

    @Test
    @DisplayName("Ввести значение в поле key press")
    @Tag("Sanity")
    public void test_insert_input_into_keypress ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_key_presses_page()
                .insert_input_into_field(Keys.ARROW_RIGHT);
    }

    @Test
    @DisplayName("Найти глубокий элемент на странице Large")
    @Tag("Sanity")
    public void test_find_deep_element ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_large_page()
                .find_deep_element();
    }

    @Test
    @DisplayName("Найти элемент таблицы на странице Large")
    @Tag("Sanity")
    public void test_find_table_element ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_large_page()
                .find_table_element("25", "25");
    }

    @Test
    @DisplayName("Открыть новое окно и переключится на странице Windows")
    @Tag("Sanity")
    public void test_open_new_window ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_windows_page()
                .open_new_window();
    }

    @Test
    @DisplayName("Получение и закрытие уведомления на странице Notification Messages")
    @Tag("Sanity")
    public void test_get_notification_message ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_notification_message_page()
                .get_notification_message()
                .close_notification_message();
    }

    @Test
    @DisplayName("Перенаправление на статус коды на странице Redirect Link")
    @Tag("Sanity")
    public void test_redirector_200 ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_redirector_page()
                .redirect_to_status_codes_page().go_to_status_code_200_page();
    }

    @Test
    @DisplayName("Перенаправление на статус коды на странице Redirect Link")
    @Tag("Sanity")
    public void test_redirector_500 ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_redirector_page()
                .redirect_to_status_codes_page().go_to_status_code_500_page();
    }

    @Test
    @DisplayName("Скачивание файла на странице Secure File Download")
    @Tag("Sanity")
    public void test_download_secure ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        HasAuthentication authentication= (HasAuthentication) driver;
        authentication.register(() -> new UsernameAndPassword("admin", "admin"));
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_download_secure_page().download_file();

    }

    @Test
    @DisplayName("Увидеть теневой текст на странице Shadow DOM")
    @Tag("Sanity")
    public void test_get_shadow_text ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shadow_dom_page().get_shadow_text();
    }

    @Test
    @DisplayName("Нажать на изменяющий местоположение элемент")
    @Tag("Sanity")
    public void test_click_shifting_element ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shifting_content_page()
                .go_to_shifting_menu()
                .click_shifting_gallery();

    }

    @Test
    @DisplayName("Нажать на изменяющий местоположение элемент")
    @Tag("Sanity")
    public void test_click_shifting_element_by_url ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shifting_content_page()
                .go_to_shifting_menu()
                .click_shifting_gallery_by_url();
    }

    @Test
    @DisplayName("Получить атрибут изменяющего местоположение элемента")
    @Tag("Sanity")
    public void test_get_shifting_element_attribute ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shifting_content_page()
                .go_to_shifting_image()
                .get_shifting_image_attribute();
    }

    @Test
    @DisplayName("Получить атрибут изменяющего местоположение элемента")
    @Tag("Sanity")
    public void test_get_shifting_element_attribute_by_url ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shifting_content_page()
                .go_to_shifting_image()
                .get_shifting_image_attribute_by_url();
    }

    @Test
    @DisplayName("Получить изменяющий местоположение текст")
    @Tag("Sanity")
    public void test_get_shifting_text_from_list ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_shifting_content_page()
                .go_to_shifting_list()
                .get_shifting_text_attribute("Et numquam et aliquam.");
    }

    @Test
    @DisplayName("Нажать на медленно загружаемый контент")
    @Tag("Sanity")
    public void test_click_slow_downloading_content ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_slow_page();
        
    }

    @Test
    @DisplayName("Нажатие кнопки редактирования элемента таблицы")
    @Tag("Sanity")
    public void test_click_edit_button_on_element ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_tables_page()
                .click_edit_button_on_element("1", "1")
                .click_delete_button_on_element("2", "2");

    }

    @Test
    @DisplayName("Проверка опечатки на странице Typos")
    @Tag("Sanity")
    public void test_typos_check ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_typos_page().check_typos2();
    }

    @Test
    @DisplayName("Проверка JQuery UI Menus")
    @Tag("Sanity")
    public void test_jquery_ui_check ()  {
        Heroku_main_page mainPage = new Heroku_main_page(driver);
        driver.get("http://the-internet.herokuapp.com/");
        mainPage.goto_jquery_ui_page().download_file("xls");
    }



    //Запихнуть методы BasePage в папку helpers в отдельный класс или в BaseTests
}
