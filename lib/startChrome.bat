java -jar selenium-server-standalone-2.53.0.jar -role wd -port 6666 -hub http://localhost:4444/grid/register -browser browserName=chrome,maxInstances=2 -Dwebdriver.chrome.driver=chromedriver.exe