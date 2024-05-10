import java.util.Scanner;

class GiangVien {
    private int maGV;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private String trinhDo;
    private int soTietGiangDay;


}

class MonHoc {
    private int maMonHoc;
    private String tenMon;
    private int tongSoTiet;
    private int soTietLyThuyet;
    private float mucKinhPhi;


}

class QuanLyKeKhai {
    private GiangVien[] danhSachGiangVien;
    private MonHoc[] danhSachMonHoc;



    public void nhapDanhSachGiangVien() {

    }

    public void nhapDanhSachMonHoc() {

    }

    public void lapBangKeKhai() {

    }

    public void sapXepTheoHoTen() {

    }

    public void sapXepTheoSoTietGiangDay() {

    }

    public void tinhToanVaLapBangTinhTienCong() {
    }
}

public class QLTLGVTG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKeKhai quanLyKeKhai = new QuanLyKeKhai();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách môn học mới");
            System.out.println("2. Nhập danh sách giảng viên mới");
            System.out.println("3. Lập bảng kê khai giảng dạy cho mỗi giảng viên");
            System.out.println("4. Sắp xếp danh sách kê khai giảng dạy");
            System.out.println("5. Tính toán và lập bảng tính tiền công cho mỗi giảng viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    quanLyKeKhai.nhapDanhSachMonHoc();
                    break;
                case 2:
                    quanLyKeKhai.nhapDanhSachGiangVien();
                    break;
                case 3:
                    quanLyKeKhai.lapBangKeKhai();
                    break;
                case 4:
                    System.out.println("a. Theo họ tên giảng viên");
                    System.out.println("b. Theo số tiết giảng dạy mỗi môn (giảm dần)");
                    System.out.print("Chọn: ");
                    char sortChoice = scanner.next().charAt(0);
                    switch (sortChoice) {
                        case 'a':
                            quanLyKeKhai.sapXepTheoHoTen();
                            break;
                        case 'b':
                            quanLyKeKhai.sapXepTheoSoTietGiangDay();
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 5:
                    quanLyKeKhai.tinhToanVaLapBangTinhTienCong();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
