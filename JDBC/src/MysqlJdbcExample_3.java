
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcExample_3 {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #1. 직위를 매개변수로 전달하여 해당 직위 사원의 사원번호, 이름, 직위를 조회
    // 어제 배운 PreparedStatement 이용
    public List<Employee> getEmployeesByPosition(String position) {
        List<Employee> employees = new ArrayList<>();
        String query = "select 사원번호,이름,직위 from 사원 where 직위 = ?";
        try (
                Connection conn = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, position);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Employee employee = new Employee();
                    employee.setEmployeeId(rs.getString("사원번호"));
                    employee.setName(rs.getString("이름"));
                    employee.setPosition(rs.getString("직위"));
                    employees.add(employee);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    // #2. 고객번호를 매개변수로 전달하여 고객번호, 고객회사명, 담당자명을 조회
    public List<Customer> getCustomersById(String id) {
        List<Customer> customers = new ArrayList<>();
        String query = "select 고객번호,고객회사명,담당자명 from 고객 where 고객번호 = ?";
        try (
                Connection conn = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setCustomerId(rs.getString("고객번호"));
                    customer.setCompanyName(rs.getString("고객회사명"));
                    customer.setContactName(rs.getString("담당자명"));
                    customers.add(customer);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    // #3. 주문일을 매개변수로 전달하여 주문일 이후에 발생한 주문의 주문번호와 고객번호, 주문일 조회
    public List<Order> getOrdersByOrderDate(String date) {
        List<Order> orders = new ArrayList<>();
        String query = "select 주문번호,고객번호,주문일 from 주문세부 where 주문일 = ?";
        try (
                Connection conn = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, date);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Order order = new Order();
                    order.setOrderId(rs.getString("주문번호"));
                    order.setCustomerId(rs.getString("고객번호"));
                    order.setOrderDate(rs.getString("주문일"));
                    orders.add(order);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static void main(String[] args) {
        MysqlJdbcExample_3 repository = new MysqlJdbcExample_3();
        List<Employee> objects = repository.getEmployeesByPosition("과장");
        //List<Customer> objects = repository.getCustomersById("CCOPI");
        //List<Order> objects = repository.getOrdersByOrderDate("2021-05-01");
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
