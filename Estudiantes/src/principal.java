
import estudiantes.Estudiantes;



public class principal {
        public static void main(String[] args) {
        
        Estudiantes[] estudiantes = new Estudiantes[5];
        // 2 materias
        estudiantes [0] =new Estudiantes(" Danny"," Vaca"," 1724293756");
        Estudiantes estudiantes1 = new Estudiantes(" Danny"," Vaca"," 1724293756");
        System.out.println("Estudiante Nº 1");
        System.out.println();
        System.out.println("Nombre: "+estudiantes1.getNombre());
        System.out.println("Apellido: "+estudiantes1.getApellido());
        System.out.println("Cedula: "+estudiantes1.getCedula());
        System.out.println("Materias: ");
        String []m= {"m1","m2"};
        estudiantes[0].setMaterias(m);
        String [] materiasEstudiantes = estudiantes[0].getMaterias();
        for(int i=0; i<materiasEstudiantes.length; i++){
            System.out.println(materiasEstudiantes[i]);
        }
            System.out.println();
        // 3 materias
        estudiantes [1] =new Estudiantes(" Pamela"," Barahona"," 1709598492");
        Estudiantes estudiantes2 = new Estudiantes(" Pamela"," Barahona"," 1709598492");
        System.out.println("Estudiante Nº 2");
        System.out.println();
        System.out.println("Nombre: "+estudiantes2.getNombre());
        System.out.println("Apellido: "+estudiantes2.getApellido());
        System.out.println("Cedula: "+estudiantes2.getCedula());
        System.out.println("Materias: ");
        String []p= {"m2","m3","m4"};
        estudiantes[1].setMaterias(p);
        String [] materiasEstudiantes2 = estudiantes[1].getMaterias();
        for(int i=0; i<materiasEstudiantes2.length; i++){
            System.out.println(materiasEstudiantes2[i]);
        }
        System.out.println();
        // 4 materias
        estudiantes [2] =new Estudiantes(" Amparo"," Velasquez"," 1707579482");
        Estudiantes estudiantes3 = new Estudiantes(" Amparo"," Velasquez"," 1707579482");
        System.out.println("Estudiante Nº 3");
        System.out.println();
        System.out.println("Nombre: "+estudiantes3.getNombre());
        System.out.println("Apellido: "+estudiantes3.getApellido());
        System.out.println("Cedula: "+estudiantes3.getCedula());
        System.out.println("Materias: ");
        String []q= {"m2","m3","m4","m5"};
        estudiantes[2].setMaterias(q);
        String [] materiasEstudiantes3 = estudiantes[2].getMaterias();
        for(int i=0; i<materiasEstudiantes3.length; i++){
            System.out.println(materiasEstudiantes3[i]);
        }
        System.out.println();
        // 3 materias
        estudiantes [3] =new Estudiantes(" Andres"," Reinoso"," 1729245637");
        Estudiantes estudiantes4 = new Estudiantes(" Andres"," Reinoso"," 1729245637");
        System.out.println("Estudiante Nº 4");
        System.out.println();
        System.out.println("Nombre: "+estudiantes4.getNombre());
        System.out.println("Apellido: "+estudiantes4.getApellido());
        System.out.println("Cedula: "+estudiantes4.getCedula());
        System.out.println("Materias: ");
        String []r= {"m1","m2","m3"};
        estudiantes[3].setMaterias(r);
        String [] materiasEstudiantes4 = estudiantes[1].getMaterias();
        for(int i=0; i<materiasEstudiantes4.length; i++){
            System.out.println(materiasEstudiantes4[i]);
        }
        System.out.println();
        // 2 materias
        estudiantes [4] =new Estudiantes(" Marco"," Vaca"," 1701708492");
        Estudiantes estudiantes5 = new Estudiantes(" Marco"," Vaca"," 1701708492");
        System.out.println("Estudiante Nº 5");
        System.out.println();
        System.out.println("Nombre: "+estudiantes5.getNombre());
        System.out.println("Apellido: "+estudiantes5.getApellido());
        System.out.println("Cedula: "+estudiantes5.getCedula());
        System.out.println("Materias: ");
        String []s= {"m1","m2"};
        estudiantes[4].setMaterias(s);
        String [] materiasEstudiantes5 = estudiantes[1].getMaterias();
        for(int i=0; i<materiasEstudiantes5.length; i++){
            System.out.println(materiasEstudiantes5[i]);
        }
        

    }
        
}
