package logicTest;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pages.*;

public class PhpTravelController {
    private WebDriver driver;

    public PhpTravelController(WebDriver driver) {
        this.driver = driver;
    }


    public void toursAsGuest()throws Exception{
        HomePage homePhpTravels = new HomePage(driver);
        homePhpTravels.tourOption();
        Thread.sleep(2000);
        homePhpTravels.setDestination();
        Thread.sleep(1000);
        homePhpTravels.setDestinationName();
        Thread.sleep(1000);
        homePhpTravels.searchTours();
        Thread.sleep(1000);
        homePhpTravels.bigBusDubaiTour();
        Thread.sleep(1000);
        homePhpTravels.hideChatWindow();
        Thread.sleep(1000);
        homePhpTravels.cheaperPrice();
        Thread.sleep(1000);
        PackageBookingPage booking = new PackageBookingPage(driver);
        booking.name("Camila Andrea");
        Thread.sleep(1000);
        booking.email("camila.gamboa@sofka.com.co");
        Thread.sleep(1000);
        booking.phone("3204843621");
        Thread.sleep(1000);
        booking.sendBook();
        Thread.sleep(1000);
        homePhpTravels.gotItButton();
        Thread.sleep(1000);
        BookNowPage bookNow = new BookNowPage(driver);
        bookNow.bookingChatWindow();
        Thread.sleep(1000);
        bookNow.bookNowButton();
        Thread.sleep(1000);
        bookNow.bookingWindow();
        Thread.sleep(1000);
        bookNow.firstName("Camila");
        Thread.sleep(1000);
        bookNow.lastName("Gamboa");
        Thread.sleep(1000);
        bookNow.email("camila.gamboa@sofka.com.co");
        Thread.sleep(1000);
        bookNow.confirmEmail("camila.gamboa@sofka.com.co");
        Thread.sleep(1000);
        bookNow.mobile("3215679342");
        Thread.sleep(1000);
        bookNow.addres("El poblado");
        Thread.sleep(1000);
        bookNow.bookingWindowContinue();
        Thread.sleep(1000);
        bookNow.country();
        Thread.sleep(1000);
        bookNow.bookingWindowConfirmBook();
        Thread.sleep(1000);
        bookNow.confirmBooking();
        Thread.sleep(10000);
        driver.quit();
    }
    public void bookAndSignIn()throws Exception{
        HomePage homePhpTravels = new HomePage(driver);
        homePhpTravels.tourOption();
        Thread.sleep(2000);
        homePhpTravels.setDestination();
        Thread.sleep(1000);
        homePhpTravels.setDestinationName();
        Thread.sleep(1000);
        homePhpTravels.searchTours();
        Thread.sleep(1000);
        homePhpTravels.bigBusDubaiTour();
        Thread.sleep(1000);
        homePhpTravels.hideChatWindow();
        Thread.sleep(1000);
        homePhpTravels.cheaperPrice();
        Thread.sleep(1000);
        PackageBookingPage booking = new PackageBookingPage(driver);
        booking.name("Andrea Guerrero");
        Thread.sleep(1000);
        booking.email("camiigamboa1@hotmail.com");
        Thread.sleep(1000);
        booking.phone("3146824793");
        Thread.sleep(1000);
        booking.sendBook();
        Thread.sleep(1000);
        homePhpTravels.gotItButton();
        Thread.sleep(1000);
        BookNowPage bookNow = new BookNowPage(driver);
        bookNow.bookingChatWindow();
        Thread.sleep(1000);
        bookNow.bookNowButton();
        Thread.sleep(1000);
        bookNow.bookingWindow();
        Thread.sleep(1000);
        SignInBookPage signInBook = new SignInBookPage(driver);
        signInBook.signInCategory();
        Thread.sleep(1000);
        signInBook.signInWindow();
        Thread.sleep(1000);
        signInBook.emailSignIn("camiigamboa1@hotmail.com");
        Thread.sleep(1000);
        signInBook.passwordSignIn("caggrp1009");
        Thread.sleep(1000);
        signInBook.signInBookWindow();
        Thread.sleep(1000);
        signInBook.confirmBooking();
        Thread.sleep(10000);
        driver.quit();
    }
    public void signUpAndBook()throws Exception{
        SignUpPage signIn = new SignUpPage(driver);
        signIn.signInMyAccount();
        signIn.firstName("Andrea");
        signIn.lastName("Guerrero");
        signIn.phone("3105480215");
        signIn.signUpWindow();
        signIn.email("camiigamboa1@hotmail.com");
        signIn.password("caggrp1009");
        signIn.confirmPassword("caggrp1009");
        signIn.signUpButton();
        Thread.sleep(1000);
        ToursCategoryPage tours = new ToursCategoryPage(driver);
        tours.toursCategory();
        Thread.sleep(1000);
        tours.toursWindow();
        Thread.sleep(1000);
        tours.select();
        Thread.sleep(1000);
        tours.guestWindow();
        Thread.sleep(1000);
        tours.guestName1("Lola");
        Thread.sleep(1000);
        tours.guestPassport1("8451789");
        Thread.sleep(1000);
        tours.guestAge1("31");
        Thread.sleep(1000);
        tours.confirmBooking();
        Thread.sleep(10000);
        driver.quit();
    }
    public void logInAndBook()throws Exception{
        LogInPage logIn = new LogInPage(driver);
        logIn.logInMyAccount();
        logIn.userName("camiigamboa1@hotmail.com");
        logIn.password("caggrp1009");
        logIn.logInButton();
        Thread.sleep(1000);
        ToursCategoryPage tours = new ToursCategoryPage(driver);
        tours.toursCategory();
        Thread.sleep(1000);
        tours.toursWindow();
        Thread.sleep(1000);
        tours.select();
        Thread.sleep(1000);
        tours.guestWindow();
        Thread.sleep(1000);
        tours.guestName1("Pacho");
        Thread.sleep(1000);
        tours.guestPassport1("1898548");
        Thread.sleep(1000);
        tours.guestAge1("25");
        Thread.sleep(1000);
        tours.confirmBooking();
        Thread.sleep(10000);
        driver.quit();
    }
}
