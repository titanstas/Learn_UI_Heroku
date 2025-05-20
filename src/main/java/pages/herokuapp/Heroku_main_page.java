package pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.herokuapp.dynamic_loading.Heroku_dynamic_loading_page;
import pages.herokuapp.frames.Heroku_frames_page;
import pages.herokuapp.shifting_content.Heroku_shifting_content_page;

public class Heroku_main_page extends BasePage {


    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_main_page(WebDriver driver) {
        super(driver);
    }





    /**
     * Xpath
     */

    /**
     * Заголовок главной страницы
     */
    public static String main_title_path = "//h1";

    /**
     * Кнопка перехода на страницу A/B Testing
     */
  public static String ab_testing_path = "//a[contains(@href, '/abtest')]";
    /**
     * Кнопка перехода на страницу Add/Remove Elements
     */
  public static String add_remove_elements_path = "//a[contains(@href, '/add_remove_elements/')]";
    /**
     * Кнопка перехода на страницу Basic auth
     */
    public static String basic_auth_path = "//a[contains(@href, 'basic_auth')]";
    /**
     * Кнопка перехода на страницу Broken images
     */
    public static String broken_images_path = "//a[contains(@href, 'broken_images')]";
    /**
     * Кнопка перехода на страницу Challenging DOM
     */
    public static String challenging_dom_path = "//a[contains(@href, 'challenging_dom')]";
    /**
     * Кнопка перехода на страницу Checkboxes
     */
    public static String checkboxes_path = "//a[contains(@href, 'checkboxes')]";
    /**
     * Кнопка перехода на страницу Context Menu
     */
    public static String context_menu_path = "//a[contains(@href, 'context_menu')]";
    /**
     * Кнопка перехода на страницу Context Menu
     */
    public static String disappearing_elements_path = "//a[contains(@href, 'disappearing_elements')]";
    /**
     * Кнопка перехода на страницу Drag and Drop
     */
    public static String drag_and_drop_path = "//a[contains(@href, 'drag_and_drop')]";
    /**
     * Кнопка перехода на страницу Dropdown
     */
    public static String dropdown_path = "//a[contains(@href, 'dropdown')]";
    /**
     * Кнопка перехода на страницу Dynamic content
     */
    public static String dynamic_content_path = "//a[contains(@href, 'dynamic_content')]";
    /**
     * Кнопка перехода на страницу Dynamic controls
     */
    public static String dynamic_controls_path = "//a[contains(@href, 'dynamic_controls')]";
    /**
     * Кнопка перехода на страницу Dynamic loading
     */
    public static String  dynamic_loading_path = "//a[contains(@href, 'dynamic_loading')]";
    /**
     * Кнопка перехода на страницу Entry Ad
     */
    public static String  entry_ad_path = "//a[contains(@href, 'entry_ad')]";
    /**
     * Кнопка перехода на страницу Exit Intent
     */
    public static String  exit_intent_path = "//a[contains(@href, 'exit_intent')]";
    /**
     * Кнопка перехода на страницу File Download
     */
    public static String  download_path = "//a[contains(@href, 'download')]";
    /**
     * Кнопка перехода на страницу File Download
     */
    public static String  upload_path = "//a[contains(@href, 'upload')]";
    /**
     * Кнопка перехода на страницу File Download
     */
    public static String  floating_menu_path = "//a[contains(@href, 'floating_menu')]";
    /**
     * Кнопка перехода на страницу Forgot Password
     */
    public static String  forgot_password_path = "//a[contains(@href, 'forgot_password')]";
    /**
     * Кнопка перехода на страницу Login
     */
    public static String  login_path = "//a[contains(@href, 'login')]";
    /**
     * Кнопка перехода на страницу Frames
     */
    public static String  frames_path = "//a[contains(@href, 'frames')]";
    /**
     * Кнопка перехода на страницу Geolocation
     */
    public static String  geolocation_path = "//a[contains(@href, 'geolocation')]";
    /**
     * Кнопка перехода на страницу Horizontal slider
     */
    public static String  horizontal_slider_path = "//a[contains(@href, 'horizontal_slider')]";
    /**
     * Кнопка перехода на страницу Hovers
     */
    public static String  hovers_path = "//a[contains(@href, 'hovers')]";
    /**
     * Кнопка перехода на страницу Hovers
     */
    public static String  infinite_scroll_path = "//a[contains(@href, 'infinite_scroll')]";
    /**
     * Кнопка перехода на страницу Inputs
     */
    public static String  inputs_path = "//a[contains(@href, 'inputs')]";
    /**
     * Кнопка перехода на страницу JavaScript Alerts
     */
    public static String  javascript_alerts_path = "//a[contains(@href, 'javascript_alerts')]";
    /**
     * Кнопка перехода на страницу JavaScript onload event error
     */
    public static String  javascript_error_path = "//a[contains(@href, 'javascript_error')]";
    /**
     * Кнопка перехода на страницу Key Presses
     */
    public static String  key_presses_path = "//a[contains(@href, 'key_presses')]";
    /**
     * Кнопка перехода на страницу Large & Deep DOM
     */
    public static String  large_path = "//a[contains(@href, 'large')]";
    /**
     * Кнопка перехода на страницу Multiple Windows
     */
    public static String  windows_path = "//a[contains(@href, 'windows')]";
    /**
     * Кнопка перехода на страницу Notification Messages
     */
    public static String   notification_message_path = "//a[contains(@href, 'notification_message')]";
    /**
     * Кнопка перехода на страницу Redirect Link
     */
    public static String   redirector_path = "//a[contains(@href, 'redirector')]";
    /**
     * Кнопка перехода на страницу Secure File Download
     */
    public static String   download_secure_path = "//a[contains(@href, 'download_secure')]";
    /**
     * Кнопка перехода на страницу Secure File Download
     */
    public static String   shadow_dom_path = "//a[contains(@href, 'shadowdom')]";
    /**
     * Кнопка перехода на страницу  Shifting Content
     */
    public static String   shifting_content_path = "//a[contains(@href, 'shifting_content')]";
    /**
     * Кнопка перехода на страницу Slow Resources
     */
    public static String  slow_path = "//a[contains(@href, 'slow')]";
    /**
     * Кнопка перехода на страницу Sortable Data Tables
     */
    public static String  tables_path = "//a[contains(@href, 'tables')]";
    /**
     * Кнопка перехода на страницу Typos
     */
    public static String  typos_path = "//a[contains(@href, 'typos')]";
    /**
     * Кнопка перехода на страницу JQuery UI Menus
     */
    public static String  jqueryui_path = "//a[contains(@href, 'jqueryui')]";





    /**
     * Метод перехода на страницу A/B Testing
     */
  public Heroku_ab_testing_page goto_ab_testing_page()
  {
      WebElement page_link = set_element_visible(ab_testing_path);
      page_link.click();

      return  new Heroku_ab_testing_page(driver);
  }

    /**
     * Метод перехода на страницу Add/Remove Elements
     */
    public Heroku_add_remove_elements_page goto_add_remove_elements_page()
    {

        WebElement page_link = set_element_visible(add_remove_elements_path);
        page_link.click();
        return new Heroku_add_remove_elements_page(driver);
    }

    /**
     * Метод перехода на страницу Basic Auth
     */
    public Heroku_basic_auth_page goto_basic_auth_page()
    {
        WebElement page_link =  set_element_visible(basic_auth_path);
        page_link.click();

        return new Heroku_basic_auth_page(driver);
    }

    /**
     * Метод перехода на страницу Broken Images
     */
    public Heroku_broken_images_page goto_broken_images_page()
    {
        WebElement page_link =  set_element_visible(broken_images_path);
        page_link.click();

        return new Heroku_broken_images_page(driver);
    }

    /**
     * Метод перехода на страницу Basic Auth
     */
    public Heroku_challenging_dom_page goto_challenging_dom_page()
    {
        WebElement page_link =  set_element_visible(challenging_dom_path);
        page_link.click();

        return new Heroku_challenging_dom_page(driver);
    }

    /**
     * Метод перехода на страницу Checkboxes
     */
    public Heroku_checkboxes_page goto_Checkboxes_page()
    {
        WebElement page_link =  set_element_visible(checkboxes_path);
        page_link.click();

        return new Heroku_checkboxes_page(driver);
    }

    /**
     * Метод перехода на страницу Context Menu
     */
    public Heroku_context_menu_page goto_context_menu_page()
    {
        WebElement page_link =  set_element_visible(context_menu_path);
        page_link.click();

        return new Heroku_context_menu_page(driver);
    }

    /**
     * Метод перехода на страницу Context Menu
     */
    public Heroku_disappearing_elements_page goto_disappearing_elements_page()
    {
        WebElement page_link =  set_element_visible(disappearing_elements_path);
        page_link.click();

        return new Heroku_disappearing_elements_page(driver);
    }

    /**
     * Метод перехода на страницу Context Menu
     */
    public Heroku_drag_and_drop_page goto_drag_and_drop_page()
    {
        WebElement page_link =  set_element_visible(drag_and_drop_path);
        page_link.click();

        return new Heroku_drag_and_drop_page(driver);
    }

    /**
     * Метод перехода на страницу Dropdown
     */
    public Heroku_dropdown_page goto_dropdown_page()
    {
        WebElement page_link =  set_element_visible(dropdown_path);
        page_link.click();

        return new Heroku_dropdown_page(driver);
    }

    /**
     * Метод перехода на страницу Dynamic Content
     */
    public Heroku_dynamic_content_page goto_dynamic_content_page()
    {
        WebElement page_link =  set_element_visible(dynamic_content_path);
        page_link.click();

        return new Heroku_dynamic_content_page(driver);
    }

    /**
     * Метод перехода на страницу Dynamic controls
     */
    public Heroku_dynamic_controls_page goto_dynamic_controls_page()
    {
        WebElement page_link =  set_element_visible(dynamic_controls_path);
        page_link.click();

        return new Heroku_dynamic_controls_page(driver);
    }

    /**
     * Метод перехода на страницу Dynamic controls
     */
    public Heroku_dynamic_loading_page goto_dynamic_loading_page()
    {
        WebElement page_link =  set_element_visible(dynamic_loading_path);
        page_link.click();

        return new Heroku_dynamic_loading_page(driver);
    }

    /**
     * Метод перехода на страницу Entry Ad
     */
    public Heroku_entry_ad_page goto_entry_ad_page()
    {
        WebElement page_link =  set_element_visible(entry_ad_path);
        page_link.click();
        return new Heroku_entry_ad_page(driver);
    }

    /**
     * Метод перехода на страницу Exit Intent
     */
    public Heroku_exit_intent_page goto_exit_intent_page()
    {
        WebElement page_link =  set_element_visible(exit_intent_path);
        page_link.click();
        return new Heroku_exit_intent_page(driver);
    }

    /**
     * Метод перехода на страницу File Download
     */
    public Heroku_download_page goto_download_page()
    {
        WebElement page_link =  set_element_visible(download_path);
        page_link.click();
        return new Heroku_download_page(driver);
    }

    /**
     * Метод перехода на страницу File Uploader
     */
    public Heroku_upload_page goto_upload_page()
    {
        WebElement page_link =  set_element_visible(upload_path);
        page_link.click();
        return new Heroku_upload_page(driver);
    }

    /**
     * Метод перехода на страницу Floating Menu
     */
    public Heroku_floating_menu_page goto_floating_menu_page()
    {
        WebElement page_link =  set_element_visible(floating_menu_path);
        page_link.click();
        return new Heroku_floating_menu_page(driver);
    }

    /**
     * Метод перехода на страницу Forgot Password
     */
    public Heroku_forgot_password_page goto_forgot_password_page()
    {
        WebElement page_link =  set_element_visible(forgot_password_path);
        page_link.click();
        return new Heroku_forgot_password_page(driver);
    }

    /**
     * Метод перехода на страницу Login Page
     */
    public Heroku_login_page goto_login_page()
    {
        WebElement page_link =  set_element_visible(login_path);
        page_link.click();
        return new Heroku_login_page(driver);
    }

    /**
     * Метод перехода на страницу Frames
     */
    public Heroku_frames_page goto_frames_page()
    {
        WebElement page_link =  set_element_visible(frames_path);
        page_link.click();
        return new Heroku_frames_page(driver);
    }

    /**
     * Метод перехода на страницу Geolocation
     */
    public Heroku_geolocation_page goto_geolocation_page()
    {
        WebElement page_link =  set_element_visible(geolocation_path);
        page_link.click();
        return new Heroku_geolocation_page(driver);
    }

    /**
     * Метод перехода на страницу Geolocation
     */
    public Heroku_horizontal_slider_page goto_horizontal_slider_page()
    {
        WebElement page_link =  set_element_visible(horizontal_slider_path);
        page_link.click();
        return new Heroku_horizontal_slider_page(driver);
    }

    /**
     * Метод перехода на страницу Hovers
     */
    public Heroku_hovers_page goto_hovers_page()
    {
        WebElement page_link =  set_element_visible(hovers_path);
        page_link.click();
        return new Heroku_hovers_page(driver);
    }

    /**
     * Метод перехода на страницу Infinite scroll
     */
    public Heroku_infinite_scroll_page goto_infinite_scroll_page()
    {
        WebElement page_link =  set_element_visible(infinite_scroll_path);
        page_link.click();
        return new Heroku_infinite_scroll_page(driver);
    }

    /**
     * Метод перехода на страницу Inputs
     */
    public Heroku_inputs_page goto_inputs_page()
    {
        WebElement page_link =  set_element_visible(inputs_path);
        page_link.click();
        return new Heroku_inputs_page(driver);
    }

    /**
     * Метод перехода на страницу JavaScript Alerts
     */
    public Heroku_javascript_alerts_page goto_javascript_alerts_page()
    {
        WebElement page_link =  set_element_visible(javascript_alerts_path);
        page_link.click();
        return new Heroku_javascript_alerts_page(driver);
    }

    /**
     * Метод перехода на страницу JavaScript onload event error
     */
    public Heroku_javascript_error_page goto_javascript_error_page()
    {
        WebElement page_link =  set_element_visible(javascript_error_path);
        page_link.click();
        return new Heroku_javascript_error_page(driver);
    }

    /**
     * Метод перехода на страницу Key presses
     */
    public Heroku_key_presses_page goto_key_presses_page()
    {
        WebElement page_link =  set_element_visible(key_presses_path);
        page_link.click();
        return new Heroku_key_presses_page(driver);
    }

    /**
     * Метод перехода на страницу Large & Deep DOM
     */
    public  Heroku_large_page goto_large_page()
    {
        WebElement page_link =  set_element_visible(large_path);
        page_link.click();
        return new  Heroku_large_page(driver);
    }

    /**
     * Метод перехода на страницу Multiple Windows
     */
    public  Heroku_windows_page goto_windows_page()
    {
        WebElement page_link =  set_element_visible(windows_path);
        page_link.click();
        return new  Heroku_windows_page(driver);
    }

    /**
     * Метод перехода на страницу Notification Messages
     */
    public  Heroku_notification_message_rendered_page goto_notification_message_page()
    {
        WebElement page_link =  set_element_visible(notification_message_path);
        page_link.click();
        return new  Heroku_notification_message_rendered_page(driver);
    }

    /**
     * Метод перехода на страницу Redirect Link
     */
    public  Heroku_redirector_page goto_redirector_page()
    {
        WebElement page_link =  set_element_visible(redirector_path);
        page_link.click();
        return new  Heroku_redirector_page(driver);
    }

    /**
     * Метод перехода на страницу Secure File Download
     */
    public  Heroku_download_secure_page goto_download_secure_page()
    {
        WebElement page_link =  set_element_visible(download_secure_path);
        page_link.click();
        return new  Heroku_download_secure_page(driver);
    }

    /**
     * Метод перехода на страницу Shadow DOM
     */
    public  Heroku_shadow_dom_page goto_shadow_dom_page()
    {
        WebElement page_link =  set_element_visible(shadow_dom_path);
        page_link.click();
        return new  Heroku_shadow_dom_page(driver);
    }

    /**
     * Метод перехода на страницу Shifting Content
     */
    public Heroku_shifting_content_page goto_shifting_content_page()
    {
        WebElement page_link =  set_element_visible(shifting_content_path);
        page_link.click();
        return new  Heroku_shifting_content_page(driver);
    }

    /**
     * Метод перехода на страницу Shifting Content
     */
    public Heroku_slow_page goto_slow_page()
    {
        WebElement page_link =  set_element_visible(slow_path);
        page_link.click();
        return new  Heroku_slow_page(driver);
    }

    /**
     * Метод перехода на страницу Sortable Data Tables
     */
    public Heroku_tables_page goto_tables_page()
    {
        WebElement page_link =  set_element_visible(tables_path);
        page_link.click();
        return new  Heroku_tables_page(driver);
    }

    /**
     * Метод перехода на страницу Typos
     */
    public Heroku_typos_page goto_typos_page()
    {
        WebElement page_link =  set_element_visible(typos_path);
        page_link.click();
        return new  Heroku_typos_page(driver);
    }

    /**
     * Метод перехода на страницу JQuery UI Menus
     */
    public Heroku_jquery_ui_page goto_jquery_ui_page()
    {
        WebElement page_link =  set_element_visible(jqueryui_path);
        page_link.click();
        return new  Heroku_jquery_ui_page(driver);
    }





}

