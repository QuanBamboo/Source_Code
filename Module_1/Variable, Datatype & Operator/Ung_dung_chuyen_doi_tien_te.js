function changeMoney() {
    let amount = parseFloat(document.getElementById('amount').value);
    let currency = document.getElementById('currency').value;
    let toCurrency = document.getElementById('toCurrency').value;
    let result;
    if (currency == "VND" && toCurrency == "USD") {
        result = 'Kết quả là' + (amount / 25000) + '$';
    } else if (currency == "USD" && toCurrency == "VND") {
        result = 'Kết quả là: ' + (amount * 25000) + 'VND';
    } else if (currency == "USD" && toCurrency == "USD") {
        result = 'Kết quả là: ' + amount + '$';
    } else {
        result = 'Kết quả là: ' + amount + 'VND';
    }
    document.getElementById('result').innerHTML = result;
}






