/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamientos;
import Entidad.Hotel4;
import Entidad.Hoteles;
import java.util.ArrayList;

/*Precio de las Habitaciones.  
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas.  Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.   
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).  
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos.  Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.   
 */
public class ServicioHoteles {
   
    ArrayList<Alojamientos> listaAlojamientos = new ArrayList<>();
    ArrayList<Hoteles> listaHoteles = new ArrayList<>();
    ArrayList<Hotel4> listaH4 = new ArrayList<>();
    public void crearHotelH4(){
        //construimos o solicitamos por teclado los datos del hotel
        /*
    Alojamientos
    public Hoteles hoteles;
    public Extrahotelero extrahoteleros;
    public String nombre;
    public String direccion;
    public String localidad;
    public String gerente;
        Hoteles
        protected int cantHab;
        protected int numCamas;
        protected int cantPisos;
        protected double precioHab;
            Hotel4
            public String gimnasio;
                public String tipoA;
                public String tipoB;
            public String nomRestaurante;
            public int capRestaurante;
            Hotel5
            public String gimnasio;
                public String tipoA;
                public String tipoB;
            public String nomRestaurante;
            public int capRestaurante;
            Public int cantSalones;
            public int cantSuites;
            public int cantLimosinas;
        Extrahoteleros
        public boolean privado;
        public int area;
            Camping
            public int cantCarpas;
            public int cantBaños;
            public boolean hayRestaurante;
            Residencias
            public int cantHabitaciones;
            public boolean conDescuento;
            public boolean conCampoDeportivo;
        */
    //Crear listado de hoteles de 4 estrellas
        //Hotel4(String gimnasio, String nomRestaurante, int capRestaurante, int cantHab, int numCamas, int cantPisos, double precioHab)
        
        //Agregar alojamientos
        //Alojamientos(String nombre, String direccion, String localidad, String gerente
        listaAlojamientos.add("Alojamiento 1","Direccion 1","Localidad 1","Gerente 1");
        listaHoteles.add(10,13,2,precioHab);
        listaH4.add(e)
        
    /*
        
    }
}        
        
    /*
        
    }
}        
        
    /*
        
    }
}        
        
    /*
        
    }
}
