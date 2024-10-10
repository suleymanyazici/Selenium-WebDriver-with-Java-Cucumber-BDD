@ets
Feature:Ets login page
Background: Ets sitesine giris islemi
  Given Ets sitesine gidilir
  When Giris butonuna basilir


  Scenario: TC-01-Ets sitesine giris
    And E-posta girilir
    And Sifre girilir
    When Giris yap butonuna tiklanir
    Then Sayfaya gidilemedigi gorulur



  Scenario: TC-02-Ets sitesine kayıt olma
    When Uye ol butonuna tiklanir
    And Isim girilir
    And Soyisim girilir
    And Uyelik sebebiyle e-posta girilir
    And Tel No girilir
    And Alan Kodu degistirilir
    And Uyelik sebebiyle sifre girilir
    And Sifre tekrarı girilir
    And Checkbox lar tiklanir
    When Uye olmak icin ileri butonuna basilir
    Then Sayfaya gidilemedigi gorulur


