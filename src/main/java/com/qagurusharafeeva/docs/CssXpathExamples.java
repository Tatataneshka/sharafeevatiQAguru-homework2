package com.qagurusharafeeva.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Наша задача научиться писать ЛОКАТОРЫ.
 * есть xPath (растёт от xmls) и css
 * Открыть интернет-страницу - есть ДОМ - это путь черех xpath
 * А есть справа Styles-
 * например, через xPath  ищем вот так -
 * в css  через #id ищем id,  а через .class ищем класс*
 * То есть к одному элементу можно обратиться по-разному
 */


public class CssXpathExamples {
    public static void main(String[] args) {


        void cssXpathExamples () {
            /** например, имеем вот такую строку, по которой будем искать
             здорово. если есть id, и очень здорово, если есть"data-testid" - вот это разработчики могут писать специально для автотестетов */
            //    <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">  */

            $("[data-testid=email]");
            $(by("data-testid", "email"));

            // <input type="email" class="inputtext login_form_input_box" name="email" id="email">

            $("#email");
            $(byId("email"));
            $(By.id("email"));
            $("[id=email]");
            $("[id='email']");
            $("[id=\"email\"]");
            $(by("id", "email"));
            $x("//*[@id='email']");
            $(byXpath("//*[@id='email']"));

            $("input#email");
            $("input[id=email]");


            // <input type="email" class="inputtext login_form_input_box" name="email">

            $("[name=email]");
            $(byName("email"));

            // <input type="email" class="inputtext login_form_input_box">
            $(byClassName("login_form_input_box"));
            $(".login_form_input_box");
            $(".inputtext.login_form_input_box");
            $x("//*[@class='login_form_input_box']");

            // <div type="email" class="inputtext">
            //      <input class="login_form_input_box">
            // </div>
            $(".inputtext .login_form_input_box");


            // <div>Hello qa.guru</div>
            $(byText("Hello qa.guru"));
            $(withText("lo qa.guru"));
        }
    }
}
