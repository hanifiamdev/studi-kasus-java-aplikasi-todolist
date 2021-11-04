public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }

        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi TodoList";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika Full maka di resize
        if (isFull) {
            String [] tmp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < tmp.length; i ++ ) {
                model[i] = tmp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }


    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke-" + i);
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList() {

    }

    /**
     * Menampilkan view add todo ke list
     */
    public static  void viewaddTodoList() {

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {

    }
}
