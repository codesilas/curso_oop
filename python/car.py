from account import Account

class car:
    id = int
    licence = str
    driver = Account("","")
    passengenger = int
    
    def __init__(self, licence, driver):
        self.licence    = licence
        self.driver     = driver