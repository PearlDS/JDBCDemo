import java.sql.*;

public class TheMainClass {
    public static void main(String[] args) {

        try {

            //TODO: pas de connectionString, userName en wachtwoord
            Connection connection = DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33062/jouwDB",
                    "jouwUserName", "jouwWachtWoord");
            Statement statement = connection.createStatement();

            //TODO: voeg onderstaande tabel toe aan je database in Squirrel


            /*CREATE TABLE Animal(
                    id INT AUTO_INCREMENT,
                    name VARCHAR(255),
                    country VARCHAR(255),
                    foodId INT,
                    countryId INT,
                    PRIMARY KEY (id));

            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (1,'zebra','Kenya',null,1);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (2,'lion','Kenya',1,1);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (3,'leopard','Kenya',1,1);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (4,'hyena','Kenya',1,1);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (5,'fox','Belgium',7,null);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (6,'walibi','Australia',null,null);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (7,'chicken','Belgium',null,null);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (8,'dingo','Australia',6,null);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (9,'cat',null,7,null);
            INSERT INTO ANIMAL (id,name,country,foodId,countryId) VALUES (10,'polar bear','North Pole',5,null);


     */

            String select = "SELECT * FROM Animal";
            String update = "INSERT INTO Animal (id,name,country,foodId,countryId) VALUES ('rabbit','Belgium');";

            statement.executeUpdate(update);
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()){
                System.out.print(resultSet.getInt("id")+ "--");
                System.out.println(resultSet.getString("name"));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
