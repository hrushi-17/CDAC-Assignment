using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _17Demo_WinForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Button button = new Button();
            button.Text = "OK";

            button.Click += new EventHandler(button1_Click);

            this.Controls.Add(button);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You clicked a button!");
        }

        private void label1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You clicked a label!");
        }

        private void richTextBox1_TextChanged(object sender, EventArgs e)
        {

        }
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
