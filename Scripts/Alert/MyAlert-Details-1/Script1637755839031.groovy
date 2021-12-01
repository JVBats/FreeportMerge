import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement


WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

'Elapse Time Checking ascended by default'
List<WebElement> listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]/span'))

List<WebElement> arraySorted = new ArrayList<String>()

List<WebElement> checkSorting = new ArrayList<String>()

//get the text into array
for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    checkSorting.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]/span'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        checkSorting.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

Arrays.sort(arraySorted)

//WebUI.verifyMatch(arraySorted.toString(), checkSorting.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check default list
'STATUS'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

'Elapse Time Checking ascended by default'
arraySorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    WebUI.scrollToPosition(0, 0)

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//sorted by array
Collections.sort(arraySorted)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click ascending
'Clicked Ascending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_STATUS'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

//reverse sorting list
Collections.sort(arraySorted, Collections.reverseOrder())

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click descending
'Clicked Descending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_STATUS'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check default list
'PRIORITY'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

'Checking ascended by default'
arraySorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    WebUI.scrollToPosition(0, 0)

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//sorted by array
Collections.sort(arraySorted)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click ascending
'Clicked Ascending Button'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_PRIORITY'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

//reverse sorting list
Collections.sort(arraySorted, Collections.reverseOrder())

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click descending
'Clicked Descending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_PRIORITY'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/span[2]'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

