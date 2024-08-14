//Bài 1: Tính tổng & diem trung binh

let vatLy = parseInt(prompt('Nhập điểm vật lý'));
let hoaHoc = parseInt(prompt('Nhập điểm hóa học: '));
let sinhHoc = parseInt(prompt('Nhập điểm sinh học: '));
let sum = vatLy + hoaHoc + sinhHoc;
let avg = sum / 3;
document.write('Tổng điểm là:' + sum);
document.write('<br/>');
document.write('Điểm trung bình là: ' + avg);

//Bài 2: chuyển độ C -> độ F

let doC = parseFloat(prompt('Nhập độ C:'));
let doF = doC * 9 / 5 + 32;
document.write('Độ F= ' + doF);

//Bài 3: Tính diện tích hình  tròn.

let R = parseFloat(prompt('Nhập bán kính:R= '));
let dienTich = 3.14 * R * R;
document.write('Diện tích hình tròn là: ' + dienTich);

//Bài 4: Tính chu vi hình tròn

let banKinh = parseFloat(prompt('Nhập bán kính hình tròn: '));
let chuVi = 2 * 3.14 * banKinh;
document.write('Chu vi hình tròn là: ' + chuVi);
