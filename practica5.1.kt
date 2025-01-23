class Estudiante(val nombre: String, val dni: String) {
    // Método para inscribirse en un curso
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}


class Curso(val nombre: String, val codigo: String) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()


    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
    }


    fun mostrarEstudiantes() {
        println("Estudiantes en el curso $nombre:")
        for (estudiante in estudiantes) {
            println("- ${estudiante.nombre} (${estudiante.dni})")
        }
    }
}

fun main() {
    val curso = Curso("Matemáticas", "MAT101")

    val estudiante1 = Estudiante("Juan Pérez", "32699123P")
    val estudiante2 = Estudiante("María López", "32569456L")

    estudiante1.inscribirse(curso)
    estudiante2.inscribirse(curso)

    curso.mostrarEstudiantes()
}
