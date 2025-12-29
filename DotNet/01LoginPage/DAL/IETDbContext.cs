using _01LoginPage.Models;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Text;

namespace _01LoginPage.DAL
{
    public class IETDbContext
    {
        string connectionString =
            "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

        // 🔹 LOGIN CHECK METHOD
        public bool CheckLogin(User user)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string query =
                "SELECT COUNT(*) FROM Users WHERE Username=@username AND Password=@password";

            SqlCommand cmd = new SqlCommand(query, conn);

            cmd.Parameters.AddWithValue("@username", user.Username);
            cmd.Parameters.AddWithValue("@password", user.Password);

            conn.Open();

            int count = Convert.ToInt32(cmd.ExecuteScalar());

            conn.Close();

            return count > 0;
        }

        // 🔹 CREATE USER
        public int CreateUser(User user)
        {
            using SqlConnection conn = new SqlConnection(connectionString);
            string query = "INSERT INTO Users(Username, Password) VALUES(@u, @p)";
            SqlCommand cmd = new SqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@u", user.Username);
            cmd.Parameters.AddWithValue("@p", user.Password);

            conn.Open();
            return cmd.ExecuteNonQuery(); // rows affected
        }

        // 🔹 UPDATE USERNAME & PASSWORD
        public int UpdateUser(string oldUsername, User newUser)
        {
            using SqlConnection conn = new SqlConnection(connectionString);
            string query =
                "UPDATE Users SET Username=@newU, Password=@newP WHERE Username=@oldU";
            SqlCommand cmd = new SqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@newU", newUser.Username);
            cmd.Parameters.AddWithValue("@newP", newUser.Password);
            cmd.Parameters.AddWithValue("@oldU", oldUsername);

            conn.Open();
            return cmd.ExecuteNonQuery(); // rows affected
        }
    }
}
