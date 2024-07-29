/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nolas
 */
public class ManipulacionProyecto
{

    public Datos[] registroDatos(Datos[] arr, int opc)
    {

        return arr;
    }

    public static int pintaMenu(String[] mnu, String titulo)
    {
        int aux;

        System.out.println("=== MENÚ " + titulo + " ===");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);
        }
        System.out.print("Elige una opción :");
        return Lecturas.entero(true);
    }

    public static Datos crearObj(int opc, Datos[] arr)
    {
        String cve, nom, primerAp, segundoAp;
        boolean desnutricion = false, sobrepeso = false, alergias = false, diabetes = false, obesidad = false;
        char sexo = ' ';
        int opcAux;
        String otras = "";
        boolean ban = true;
        int viveCon, carrera;
        char estatus;
        Datos obj = null;

        System.out.print("Nombre(s): ");
        nom = Lecturas.cadena();
        System.out.print("Apellido Paterno: ");
        primerAp = Lecturas.cadena();
        System.out.print("Apellido Materno: ");
        segundoAp = Lecturas.cadena();
        System.out.print("Sexo:\n1.-Masculino\n2.-Femenino\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero();
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    sexo = 'M';
                } else
                {
                    sexo = 'F';
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;
        System.out.print("Desnutricion: \n1.-Si\n2.-No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    desnutricion = true;
                } else
                {
                    desnutricion = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;
        System.out.print("Sobrepeso: \n1.-Si\n2.-No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    sobrepeso = true;
                } else
                {
                    sobrepeso = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;
        System.out.print("Alergias: \n1.-Si\n2.-No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    alergias = true;
                } else
                {
                    alergias = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;
        System.out.print("Obesidad: \n1.-Si\n2.-No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    obesidad = true;
                } else
                {
                    obesidad = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;
        System.out.print("Diabetes: \n1.-Si\n2.-No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    diabetes = true;
                } else
                {
                    diabetes = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        } while (ban == true);
        ban = true;

        System.out.print("Otros padecimientos:\n1.Si\n2.No\nOpcion: ");
        do
        {
            opcAux = Lecturas.entero(true);
            if (opcAux == 1 || opcAux == 2)
            {
                if (opcAux == 1)
                {
                    System.out.print("Padecimiento: ");
                    otras = Lecturas.cadena();
                    ban = false;
                } else
                {
                    otras = "NINGUNO";
                    ban = false;
                }
                ban = false;

            } else
            {
                System.out.println("Opcion no valida, vuelce a intentarlo");
            }
        } while (ban);
        ban = true;

        if (opc == 1)
        {

            System.out.print("Numero de control: ");
            do
            {
                cve = Lecturas.cadena();
                opcAux = buscarCve(arr, cve);
                if (opcAux == -1)
                {
                    ban = false;
                } else
                {
                    System.out.println("La clave ya se encuentra registrada");
                }
            } while (ban == true);
            ban = true;

            System.out.print("Vive con: \n1.-Mama y papa\n2.-Solo mama\n3.-Solo papa \n4.-Otros\nOpcion: ");
            do
            {
                viveCon = Lecturas.entero(true);
                if (viveCon >= 1 && viveCon <= 4)
                {
                    ban = false;
                } else
                {
                    System.out.println("Opcion no valida, vuelve a intentarlo.");
                }

            } while (ban == true);
            ban = true;
            System.out.print("Carrera: \n1.-Ingeniería Electromecánica \n2.-Ingeniería Electronica"
                    + "\n3.-Ingeniería en Gestión Empresarial\n4.-Ingeniería Industrial \n5.-Ingenieria en Logística"
                    + "\n6.-Ingeniería Mecatrónica\n7.-Ingeniería Química\n8.-Ingeniería en Sistemas Computacionales"
                    + "\n9.-Ingeniería en Tecnologías de la Información y Comunicaciones\nOpcion: ");
            do
            {
                carrera = Lecturas.entero(true);
                if (carrera >= 1 && carrera <= 9)
                {
                    return new Alumnos(viveCon, carrera, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
                } else
                {
                    System.out.println("Opcion no valida, vuelve a intentarlo.");
                }

            } while (ban == true);

        } else
        {
            System.out.print("Numero de empleado: ");
            do
            {
                cve = Lecturas.cadena();
                opcAux = buscarCve(arr, cve);
                if (opcAux == -1)
                {
                    ban = false;
                } else
                {
                    System.out.println("La clave ya se encuentra registrada");
                }
            } while (ban == true);
            ban = true;
            System.out.print("Estatus: \n1.-Base\n2.-Temporal\nOpcion: ");
            do
            {
                opcAux = Lecturas.entero(true);
                if (opcAux == 1 || opcAux == 2)
                {
                    if (opcAux == 1)
                    {
                        estatus = 'B';
                        return new Personal(estatus, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);

                    } else
                    {
                        estatus = 'T';
                        return new Personal(estatus, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
                    }
                    //ban=false;
                } else
                {
                    System.out.println("Opcion no valida, vuelve a intentarlo");
                }
            } while (ban == true);
        }
        return obj;

    }

    public static Datos[] modificarAlumno(Datos[] arr, int pos, String clave, int sex, int des, int sobre, int aler, int obes, int diab, String otro, int viveC, int carr)
    {
        char sexo = ' ';
        boolean desnutricion = false;
        boolean sobrepeso = false;
        boolean alergias = false;
        boolean obesidad = false;
        boolean diabetes = false;

        switch (sex)
        {
            case 1:
                sexo = 'M';
                break;
            case 2:
                sexo = 'F';
                break;
        }

        switch (des)
        {
            case 2:
                desnutricion = true;
                break;
            case 3:
                desnutricion = false;
                break;
        }
        switch (sobre)
        {
            case 2:
                sobrepeso = true;
                break;
            case 3:
                sobrepeso = false;
                break;
        }
        switch (aler)
        {
            case 2:
                alergias = true;
                break;
            case 3:
                alergias = false;
                break;
        }
        switch (obes)
        {
            case 2:
                obesidad = true;
                break;
            case 3:
                obesidad = false;
                break;
        }
        switch (diab)
        {
            case 2:
                diabetes = true;
                break;
            case 3:
                diabetes = false;
                break;
        }
        Alumnos obj = new Alumnos(viveC, carr, clave, arr[pos].getNom(), arr[pos].getPrimerAp(), arr[pos].getSegundoAp(), sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otro);
        arr[pos] = obj;
        return arr;
    }

    public static Datos[] modificarPersonal(Datos[] arr, int pos, String clave, int sex, int des, int sobre, int aler, int obes, int diab, String otro, int estat)
    {
        char sexo = ' ';
        boolean desnutricion = false;
        boolean sobrepeso = false;
        boolean alergias = false;
        boolean obesidad = false;
        boolean diabetes = false;
        char estatus = ' ';

        switch (sex)
        {
            case 1:
                sexo = 'M';
                break;
            case 2:
                sexo = 'F';
                break;
        }

        switch (des)
        {
            case 2:
                desnutricion = true;
                break;
            case 3:
                desnutricion = false;
                break;
        }
        switch (sobre)
        {
            case 2:
                sobrepeso = true;
                break;
            case 3:
                sobrepeso = false;
                break;
        }
        switch (aler)
        {
            case 2:
                alergias = true;
                break;
            case 3:
                alergias = false;
                break;
        }
        switch (obes)
        {
            case 2:
                obesidad = true;
                break;
            case 3:
                obesidad = false;
                break;
        }
        switch (diab)
        {
            case 2:
                diabetes = true;
                break;
            case 3:
                diabetes = false;
                break;
        }
        switch (estat)
        {
            case 1:
                estatus = 'B';
                break;
            case 2:
                estatus = 'T';
                break;
        }
        Personal obj = new Personal(estatus, clave, arr[pos].getNom(), arr[pos].getPrimerAp(), arr[pos].getSegundoAp(), sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otro);
        arr[pos] = obj;
        return arr;
    }

    public static Datos[] modificacion(int opc, Datos[] arr)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
            return arr;
        } else
        {
            //----------DATOS--------------
            String cve;
            char sexo = ' ';
            boolean desnutricion = false, sobrepeso = false, alergias = false, obesidad = false, diabetes = false;
            String otros = "";
            //----------ALUMNOS--------------
            int viveCon, carrera;
            //----------DOCENTE--------------
            char estatus;
            //----------AYUDA--------------        
            int opcAux;
            int pos;
            boolean ban = true;
            Datos obj = null;

            if (opc == 1 || opc == 2)
            {
                if (opc == 1)
                {
                    System.out.print("Dame la clave del alumno: ");
                    cve = Lecturas.cadena();
                    pos = buscarCve(arr, cve);
                    if (pos != -1)
                    {
                        if (arr[pos] instanceof Alumnos)
                        {
                            //---------SEXO VALIDADO---------
                            System.out.println("Sexo:\n1.-Masculino\n2.-Femenino\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero();
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        sexo = 'M';
                                    } else
                                    {
                                        sexo = 'F';
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Desnutricion: \n1.-Si\2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        desnutricion = true;
                                    } else
                                    {
                                        desnutricion = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Sobrepeso: \n1.-Si\2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        sobrepeso = true;
                                    } else
                                    {
                                        sobrepeso = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Alergias: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        alergias = true;
                                    } else
                                    {
                                        alergias = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Obesidad: \n1.-Si\2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        obesidad = true;
                                    } else
                                    {
                                        obesidad = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Diabetes: \n1.-Si\2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        diabetes = true;
                                    } else
                                    {
                                        diabetes = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Otros padecimientos:\n1.Si\n2.No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        System.out.println("Padecimiento: ");
                                        otros = Lecturas.cadena();
                                        ban = false;
                                    } else
                                    {
                                        otros = "NINGUNO";
                                        ban = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban);
                            ban = true;

                            System.out.println("Vive con: \n1.-Mama y papa\n2.-Solo mama\n3.-Solo papa \n4.-Otros\nOpcion: ");
                            do
                            {
                                viveCon = Lecturas.entero(true);
                                if (viveCon >= 1 && viveCon <= 4)
                                {
                                    ban = false;
                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo.");
                                }

                            } while (ban == true);
                            ban = true;

                            System.out.println("Carrera: \n1.-Ingeniería Electromecánica \n2.-Ingeniería Electronica"
                                    + "\n3.-Ingeniería en Gestión Empresarial\n4.-Ingeniería Industrial \n5.-Ingenieria en Logística"
                                    + "\n6.-Ingeniería Mecatrónica\n7.-Ingeniería Química\n8.-Ingeniería en Sistemas Computacionales"
                                    + "\n9.-Ingeniería en Tecnologías de la Información y Comunicaciones\nOpcion: ");
                            do
                            {
                                carrera = Lecturas.entero(true);
                                if (carrera >= 1 && carrera <= 9)
                                {
                                    ban = false;
                                    obj = new Alumnos(viveCon, carrera, cve, arr[pos].getNom(), arr[pos].getPrimerAp(), arr[pos].getSegundoAp(), sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otros);
                                    arr[pos] = obj;
                                    return arr;
                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo.");
                                }

                            } while (ban = true);

                        } else
                        {
                            System.out.println("La clave no pertenece a un Alumno");
                        }

                    } else
                    {
                        System.out.println("La clave no existe");//AQUI SE METE AL ELSE
                    }
                } else
                {
                    //Aqui se modifica el personal
                    //se pide la clave
                    System.out.print("Dame la clave del personal: ");
                    cve = Lecturas.cadena();
                    pos = buscarCve(arr, cve);
                    if (pos != -1)
                    {
                        if (arr[pos] instanceof Personal)
                        {
                            //---------SEXO VALIDADO---------
                            System.out.println("Sexo:\n1.-Masculino\n2.-Femenino\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero();
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        sexo = 'M';
                                    } else
                                    {
                                        sexo = 'F';
                                    }
                                    ban = false;
                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }

                            } while (ban == true);
                            ban = true;

                            System.out.print("Desnutricion: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        desnutricion = true;
                                    } else
                                    {
                                        desnutricion = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Sobrepeso: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        sobrepeso = true;
                                    } else
                                    {
                                        sobrepeso = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Alergias: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        alergias = true;
                                    } else
                                    {
                                        alergias = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Obesidad: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {

                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        obesidad = true;
                                    } else
                                    {
                                        obesidad = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;
                            System.out.print("Diabetes: \n1.-Si\n2.-No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        diabetes = true;
                                    } else
                                    {
                                        diabetes = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);
                            ban = true;

                            System.out.print("Otros padecimientos:\n1.Si\n2.No\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        System.out.println("Padecimiento: ");
                                        otros = Lecturas.cadena();
                                        ban = false;
                                    } else
                                    {
                                        otros = "NINGUNO";
                                        ban = false;
                                    }
                                    ban = false;

                                } else
                                {
                                    System.out.println("Opcion no valida, vuelce a intentarlo");
                                }
                            } while (ban);
                            ban = true;
                            System.out.print("Estatus: \n1.-Base\n2.-Temporal\nOpcion: ");
                            do
                            {
                                opcAux = Lecturas.entero(true);
                                if (opcAux == 1 || opcAux == 2)
                                {
                                    if (opcAux == 1)
                                    {
                                        estatus = 'B';
                                        obj = new Personal(estatus, arr[pos].getCve(), arr[pos].getNom(), arr[pos].getPrimerAp(), arr[pos].getSegundoAp(), sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otros);
                                        arr[pos] = obj;
                                        return arr;
                                    } else
                                    {
                                        estatus = 'T';
                                        obj = new Personal(estatus, arr[pos].getCve(), arr[pos].getNom(), arr[pos].getPrimerAp(), arr[pos].getSegundoAp(), sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otros);
                                        arr[pos] = obj;
                                        return arr;
                                    }
                                } else
                                {
                                    System.out.println("Opcion no valida, vuelve a intentarlo");
                                }
                            } while (ban == true);

                        } else
                        {
                            System.out.println("La clave no pertenece al Personal");
                        }

                    } else
                    {
                        System.out.println("La clave no existe");
                    }
                }
            }
            return arr;
        }

    }

    public static Datos[] agregar(Datos[] arr, int opc, boolean b)
    {
        do
        {
            if (opc == 1 || opc == 2)
            {
                Datos obj = crearObj(opc, arr);
                if (arr == null)
                {
                    arr = new Datos[1];
                    arr[0] = obj;
                    return arr;
                } else
                {
                    Datos[] nvo = new Datos[arr.length + 1];
                    System.arraycopy(arr, 0, nvo, 0, arr.length);
                    nvo[arr.length] = obj;
                    return nvo;
                }

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
                opc = Lecturas.entero(b);
            }

        } while (b);
        return arr;
    }

    public static Datos[] agregarAlumno(Datos[] arr, int opc, boolean b, Datos obj)
    {
        do
        {
            if (opc == 1 || opc == 2)
            {

                if (arr == null)
                {
                    arr = new Datos[1];
                    arr[0] = obj;
                    return arr;
                } else
                {
                    Datos[] nvo = new Datos[arr.length + 1];
                    System.arraycopy(arr, 0, nvo, 0, arr.length);
                    nvo[arr.length] = obj;
                    return nvo;
                }

            } else
            {
                System.out.println("Opcion no valida, vuelve a intentarlo");
                opc = Lecturas.entero(b);
            }

        } while (b);
        return arr;
    }

    public static int buscarCve(Datos arr[], String cve)
    {

        if (arr == null)
        {
            return -1;
        } else
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (cve.equals(arr[i].getCve()))
                {
                    return i;
                }
            }
        }
        return -1;

    }

    public static String Consulta(boolean b, int opc, Datos[] arr)
    {
        String s = "";
        if (opc == 1 || opc == 2)
        {
            do
            {
                if (arr == null)
                {
                    System.out.println("No hay datos");
                    b = false;
                } else
                {
                    if (opc == 1)
                    {
                        s = "Clave\tNombre\t\tApellido Paterno\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\t\tVive con\tCarrera\t\n";
                        for (int i = 0; i < arr.length; i++)
                        {
                            if (arr[i] instanceof Alumnos)
                            {
                                Alumnos obj = (Alumnos) arr[i];
                                s += (obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t" + obj.isSobrepeso() + "\t" + obj.isAlergias() + "\t" + obj.isObesidad() + "\t" + obj.isDiabetes() + "\t" + obj.getOtras()
                                        + "\t\t" + obj.getViveCon() + "\t" + obj.getCarrera() + "\n");
                            }
                        }
                        return s;

                    } else
                    {
                        s = ("Clave\tNombre\t\tApellido Paterno\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\tEstatus\n");
                        for (int i = 0; i < arr.length; i++)
                        {
                            if (arr[i] instanceof Personal)
                            {
                                Personal obj = (Personal) arr[i];
                                s += (obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t" + obj.isSobrepeso() + "\t" + obj.isAlergias() + "\t" + obj.isObesidad() + "\t" + obj.isDiabetes() + "\t" + obj.getOtras()
                                        + "\t" + obj.getEstatus() + "\n");
                            }
                        }
                        return s;

                    }
                }
            } while (b);

        } else
        {
            System.out.println("Opcion no valida");
        }
        return s;

    }

    public static HistorialClinico[][] agregarfila(HistorialClinico mat[][])
    {
        if (mat == null)
        {
            mat = new HistorialClinico[1][];
            mat[0] = new HistorialClinico[0];
        } else
        {
            HistorialClinico nvo[][] = new HistorialClinico[mat.length + 1][];
            for (int i = 0; i < mat.length; i++)
            {
                nvo[i] = new HistorialClinico[mat[i].length];
                System.arraycopy(mat[i], 0, nvo[i], 0, mat[i].length);
            }
            nvo[mat.length] = new HistorialClinico[0];
            mat = nvo;
        }
        return mat;
    }

    public static HistorialClinico[][] agregarColumnaHC(HistorialClinico[][] mat, Datos[] arr, int pos, String padecimientos, String antecedentes, String medicamento, String planTratamiento)
    {
        //Este se ocupa?
        SimpleDateFormat objFecha = new SimpleDateFormat("dd/mm/yyyy");

        Date fecha = Calendar.getInstance().getTime();

        HistorialClinico objH = new HistorialClinico(padecimientos, antecedentes, medicamento, planTratamiento, fecha);

        if (pos != -1)
        {

            if (mat == null)
            {
                mat = new HistorialClinico[arr.length][];
            }
            if (mat[pos] == null)
            {
                mat[pos] = new HistorialClinico[1];
                mat[pos][0] = objH;
                return mat;
            } else
            {
                HistorialClinico nvo[] = new HistorialClinico[mat[pos].length + 1];
                System.arraycopy(mat[pos], 0, nvo, 0, mat[pos].length);
                nvo[mat[pos].length] = objH;
                mat[pos] = nvo;
                return mat;
            }

        }

        return mat;
    }

    public static HistorialClinico[][] agregarColumna(HistorialClinico[][] mat, Datos[] arr)
    {
        if (arr == null)
        {
            System.out.println("No hay datos");
            return mat;
        } else
        {
            int pos;
            String cve;
            HistorialClinico objH;
            //-------------------------------------
            System.out.print("Dame la clave:");
            cve = Lecturas.cadena();
            pos = buscarCve(arr, cve);
            //aquiguardamos el objjeto de historial
            //-------------------------------------
            if (pos != -1)
            {
                objH = crearObjHistorial();
                if (mat == null)
                {
                    mat = new HistorialClinico[arr.length][];
                }
                if (mat[pos] == null)
                {
                    mat[pos] = new HistorialClinico[1];
                    mat[pos][0] = objH;
                    return mat;
                } else
                {
                    HistorialClinico nvo[] = new HistorialClinico[mat[pos].length + 1];
                    System.arraycopy(mat[pos], 0, nvo, 0, mat[pos].length);
                    nvo[mat[pos].length] = objH;
                    mat[pos] = nvo;
                    return mat;
                }

            } else
            {
                System.out.println("La clave no pertenece a un alumno o personal");
            }
            return mat;
        }
    }

    public static HistorialClinico crearObjHistorial()
    {
        String padecimientos;
        String antecedentes;
        String medicamento;
        String planTratamiento;
        Date fecha = Calendar.getInstance().getTime();

        System.out.print("Fecha: " + fecha + "\n");
        System.out.print("Padecimiento: ");
        padecimientos = Lecturas.cadena();
        System.out.print("Antecedentes: ");
        antecedentes = Lecturas.cadena();
        System.out.print("Medicamento: ");
        medicamento = Lecturas.cadena();
        System.out.print("Plan de Tratamiento: ");
        planTratamiento = Lecturas.cadena();

        return new HistorialClinico(padecimientos, antecedentes, medicamento, planTratamiento, fecha);

    }

    //Este metodo lo ocupamos
    public static void contadorMatriz(HistorialClinico mat[][])
    {
        System.out.println("Tamaño mat[]:" + mat.length);
        for (int i = 0; i < mat.length; i++)
        {
            System.out.println("Tamaño mat[][" + i + "]:" + mat[i].length);
        }
    }

    public static void opcionesReportes(String[] mnu1, int opc, Datos[] arr, HistorialClinico[][] mat)
    {
        int opc2;
        boolean b = true;
        String mnu[] =
        {
            "ALUMNOS", "PERSONAL"
        };
        do
        {
            opc2 = pintaMenu(mnu1, "REPORTES");
            switch (opc2)
            {

                case 1:
                    //Imprimir hombres
                    filtroHombres(mnu, arr, true);
                    break;
                case 2:
                    //Imprimir mujeres
                    filtroMujeres(mnu, arr, true);
                    break;
                case 3:
                    //Imprimir alergias
                    filtroAlergias(arr, true);
                    break;
                case 4:
                    //Imprimir sobrepeso
                    filtroSobrepeso(arr, true);
                    break;
                case 5:
                    //Imprimir diabetes
                    filtroDiabetes(arr, true);
                    break;
                case 6:
                    //Imprimir desnutricion
                    filtroDesnutricion(arr, true);
                    break;
                case 7:
                    //Imprimir obesidad
                    filtroObesidad(arr, true);
                    break;
                case 8:
                    //Imprimir otras
                    filtroOtros(arr, true);
                    break;
                case 9:
                    //Imprimir mayor frecuencia
                    filtroMayorFrecuencia(arr, mat, true);
                    break;
                case 10:
                    //Imprimir menor frecuencia
                    filtroMenorFrecuencia(arr, mat, true);
                    break;
                case 11:
                    b = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    ;
            }

        } while (b);

    }

    public static void filtroHombres(String[] mnu, Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int opc = pintaMenu(mnu, "INFORME");
            int cont = 0;
            do
            {
                if (opc == 1 || opc == 2)
                {
                    if (opc == 1)
                    {
                        for (int i = 0; i < arr.length; i++)
                        {
                            char aux = arr[i].getSexo();
                            if (arr[i] instanceof Alumnos && aux == 'M')
                            {
                                cont++;
                                if (cont == 1)
                                {
                                    System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\t\tVive con\tCarrera\t");
                                }
                                Alumnos obj = (Alumnos) arr[i];
                                System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t\t" + obj.isSobrepeso() + "\t\t" + obj.isAlergias() + "\t\t" + obj.isObesidad() + "\t\t" + obj.isDiabetes() + "\t\t" + obj.getOtras()
                                        + "\t\t" + obj.getViveCon() + "\t\t" + obj.getCarrera());
                            }
                        }
                        if (cont == 0)
                        {
                            System.out.println("No hay Alumnos hombres registrados aun");
                        }
                        b = false;
                    } else
                    {
                        //Aqui imprie a personal hombres
                        for (int i = 0; i < arr.length; i++)
                        {
                            char aux = arr[i].getSexo();
                            if (arr[i] instanceof Personal && aux == 'M')
                            {
                                cont++;
                                if (cont == 1)
                                {
                                    System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\t\tVive con\tCarrera\t");
                                }
                                Personal obj = (Personal) arr[i];
                                System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t\t" + obj.isSobrepeso() + "\t\t" + obj.isAlergias() + "\t\t" + obj.isObesidad() + "\t\t" + obj.isDiabetes() + "\t\t" + obj.getOtras()
                                        + "\t\t" + obj.getEstatus());
                            }
                        }
                        if (cont == 0)
                        {
                            System.out.println("No hay personal hombres registrados aun");
                        }
                        b = false;
                    }
                } else
                {
                    System.out.println("Opcion no valida");
                    b = false;
                }
            } while (b);
        }
    }

    public static void filtroMujeres(String[] mnu, Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int opc = pintaMenu(mnu, "INFORME");
            int cont = 0;
            do
            {
                if (opc == 1 || opc == 2)
                {
                    if (opc == 1)
                    {
                        for (int i = 0; i < arr.length; i++)
                        {
                            char aux = arr[i].getSexo();
                            if (arr[i] instanceof Alumnos && aux == 'F')
                            {
                                cont++;
                                if (cont == 1)
                                {
                                    System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\t\tVive con\tCarrera\t");
                                }
                                Alumnos obj = (Alumnos) arr[i];
                                System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t\t" + obj.isSobrepeso() + "\t\t" + obj.isAlergias() + "\t\t" + obj.isObesidad() + "\t\t" + obj.isDiabetes() + "\t\t" + obj.getOtras()
                                        + "\t\t" + obj.getViveCon() + "\t\t" + obj.getCarrera());
                            }
                        }
                        if (cont == 0)
                        {
                            System.out.println("No hay alumnos mujeres registrados aun");
                        }
                        b = false;
                    } else
                    {
                        //Aqui imprie a personal hombres
                        for (int i = 0; i < arr.length; i++)
                        {
                            char aux = arr[i].getSexo();
                            if (arr[i] instanceof Personal && aux == 'F')
                            {
                                cont++;
                                if (cont == 1)
                                {
                                    System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno\tSexo\tDesnutricion\tSobrepeso\tAlergias\tObesidad\tDiabetes\tOtras\t\tVive con\tCarrera\t");
                                }
                                Personal obj = (Personal) arr[i];
                                System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp() + "\t\t" + obj.getSexo()
                                        + "\t" + obj.isDesnutricion() + "\t\t" + obj.isSobrepeso() + "\t\t" + obj.isAlergias() + "\t\t" + obj.isObesidad() + "\t\t" + obj.isDiabetes() + "\t\t" + obj.getOtras()
                                        + "\t\t" + obj.getEstatus());
                            }
                        }
                        if (cont == 0)
                        {
                            System.out.println("No hay personal mujeres registrados aun");
                        }
                        b = false;
                    }
                } else
                {
                    System.out.println("Opcion no valida");
                    b = false;
                }

            } while (b);
        }
    }

    public static void filtroAlergias(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;
            do
            {
                for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i].isAlergias() == true)
                    {
                        cont++;
                        if (cont == 1)
                        {
                            System.out.println("---------------PERSONAS CON ALERGIAS---------------");
                            System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno");
                        }
                        Datos obj = arr[i];
                        System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp());
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No hay personas registradas con alergias");
                }
                b = false;
            } while (b);
        }
    }

    //Aun sin cambiar
    public static void filtroSobrepeso(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;
            do
            {
                for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i].isSobrepeso() == true)
                    {
                        cont++;
                        if (cont == 1)
                        {
                            System.out.println("---------------PERSONAS CON SOBREPESO---------------");
                            System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno");
                        }
                        Datos obj = arr[i];
                        System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp());
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No hay personas registradas con sobrepreso");
                }
                b = false;
            } while (b);
        }
    }

    public static void filtroDiabetes(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;
            do
            {
                for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i].isDiabetes() == true)
                    {
                        cont++;
                        if (cont == 1)
                        {
                            System.out.println("---------------PERSONAS CON DIABETES---------------");
                            System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno");
                        }
                        Datos obj = arr[i];
                        System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp());
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No hay personas registradas con diabetes");
                }
                b = false;
            } while (b);
        }
    }

    public static void filtroDesnutricion(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i].isDesnutricion() == true)
                {
                    cont++;
                    if (cont == 1)
                    {
                        System.out.println("---------------PERSONAS CON DESNUTRICION---------------");
                        System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno");
                    }
                    Datos obj = arr[i];
                    System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp());
                }
            }
            if (cont == 0)
            {
                System.out.println("No hay personas registradas con desnutricion");
                b = false;
            }

        }
    }

    public static void filtroObesidad(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;
            do
            {
                for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i].isObesidad() == true)
                    {
                        cont++;
                        if (cont == 1)
                        {
                            System.out.println("---------------PERSONAS CON OBESIDAD---------------");
                            System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno");
                        }
                        Datos obj = arr[i];
                        System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp());
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No hay personas registradas con obesidad");
                }
                b = false;
            } while (b);
        }
    }

    public static void filtroOtros(Datos[] arr, boolean b)
    {
        if (arr == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            int cont = 0;
            do
            {
                for (int i = 0; i < arr.length; i++)
                {
                    if (!"NINGUNO".equals(arr[i].getOtras()))
                    {
                        cont++;
                        if (cont == 1)
                        {
                            System.out.println("---------------PERSONAS CON OTRAS ALERGIAS/ENFERMEDADES---------------");
                            System.out.println("Clave\t\tNombre\t\tApellido Paterno\t\t\tApellido Materno\t\tPadecimiento");
                        }
                        Datos obj = arr[i];
                        System.out.println(obj.getCve() + "\t" + obj.getNom() + "\t\t" + obj.getPrimerAp() + "\t\t\t\t\t" + obj.getSegundoAp() + "\t\t\t" + obj.getOtras());
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No hay personas registradas con otras alergias/enfermedades");
                }
                b = false;
            } while (b);
        }

    }

    //Especiales
    public static void filtroMayorFrecuencia(Datos[] arr, HistorialClinico[][] mat, boolean b)
    {
        int[] arrFrec = null;
        int maxFrec = 0;

        if (arr == null || mat == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            for (int i = 0; i < mat.length; i++)
            {
                if (mat[i].length > maxFrec)
                {

                    maxFrec = mat[i].length;
                    arrFrec = new int[]
                    {
                        i
                    };
                } else if (mat[i].length == maxFrec && mat[i].length > 0)
                {

                    // Si hay varios con la misma frecuencia máxima, agrega a arrFrec
                    int[] nvo = new int[arrFrec.length + 1];
                    System.arraycopy(arrFrec, 0, nvo, 0, arrFrec.length);
                    nvo[arrFrec.length] = i;
                    arrFrec = nvo;
                }
            }

            if (arrFrec != null)
            {
                System.out.println("Persona(s) con mayor frecuencia de consultas médicas");
                System.out.println("Clave\t\tNombre\t\tApellidoPaterno\t\tApellidoMaterno\t\tNo Consultas");
                for (int i : arrFrec)
                {
                    System.out.println(arr[i].getCve() + "\t" + arr[i].getNom() + "\t\t" + arr[i].getPrimerAp() + "\t\t" + arr[i].getSegundoAp() + "\t\t" + maxFrec);
                }
            } else
            {
                System.out.println("Aun no hay consultas registradas");
            }

        }

    }

    public static void filtroMenorFrecuencia(Datos[] arr, HistorialClinico[][] mat, boolean b)
    {

        int[] arrMenorFrec = null;
        int minFrec = Integer.MAX_VALUE;

        if (arr == null || mat == null)
        {
            System.out.println("No hay datos registrados");
        } else
        {
            for (int i = 0; i < mat.length; i++)
            {
                if (mat[i].length < minFrec)
                {
                    minFrec = mat[i].length;
                    arrMenorFrec = new int[1];
                    arrMenorFrec[0] = i;
                } else if (mat[i].length == minFrec)
                {
                    // Si hay varios con la misma frecuencia mínima, agrega a arrMenorFrec
                    int[] nvo = new int[arrMenorFrec.length + 1];
                    System.arraycopy(arrMenorFrec, 0, nvo, 0, arrMenorFrec.length);
                    nvo[arrMenorFrec.length] = i;
                    arrMenorFrec = nvo;
                }
            }

            if (arrMenorFrec != null)
            {
                System.out.println("-----Persona(s) con menor frecuencia de consultas médicas-----");
                System.out.println("Clave\t\tNombre\t\tApellidoPaterno\t\tApellidoMaterno\t\tNo Consultas");
                for (int i : arrMenorFrec)
                {
                    System.out.println(arr[i].getCve() + "\t" + arr[i].getNom() + "\t\t" + arr[i].getPrimerAp() + "\t\t\t" + arr[i].getSegundoAp() + "\t\t" + minFrec);
                }
            }
        }
    }

    //Este metodo lo ocupamos
    public static void imprimirPorFechas(HistorialClinico[][] mat)
    {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat objFecha = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Dame la fecha de inicio (dd/mm/yyyy): ");
        String fechaI = Lecturas.cadena();

        System.out.print("Dame la fecha de fin (dd/mm/yyyy): ");
        String fechaF = Lecturas.cadena();

        try
        {
            // Convierte las cadenas a objetos Date
            Date fechaInicio = objFecha.parse(fechaI);
            Date fechaFin = objFecha.parse(fechaF);

            // Llama al método para imprimir el historial en el rango de fechas
            imprimirPorRango(fechaInicio, fechaFin, mat);

        } catch (ParseException e)
        {
            System.out.println("Formato de fecha incorrecto/La fecha no es valida");
        }

    }

    public static void imprimirPorRango(Date fechaInicio, Date fechaFin, HistorialClinico[][] matH)
    {
        int cont = 0;
        if (matH == null)
        {
            System.out.println("No hay historial registrado.");
        } else
        {
            SimpleDateFormat objFecha = new SimpleDateFormat("dd/mm/yyyy");

            for (int i = 0; i < matH.length; i++)
            {
                if (matH[i] != null)
                {
                    for (int j = 0; j < matH[i].length; j++)
                    {
                        Date fechaConsulta = matH[i][j].getFecha();
                        if (fechaConsulta.after(fechaInicio) && fechaConsulta.before(fechaFin))
                        {
                            cont++;
                            if (cont == 1)
                            {
                                System.out.println("Historial en el rango de fechas:");
                            }
                            System.out.println("Fecha: " + objFecha.format(fechaConsulta));
                            System.out.println(matH[i][j]); // Utiliza el método toString de la clase HistorialClinico
                            System.out.println("-----------------------------");
                        }
                    }
                }
            }
            if (cont == 0)
            {
                System.out.println("No hay consultas registradas en durante las fechas");
            }

        }

    }

    public static String imprimirPorFechasInterface(HistorialClinico matH[][], Datos[] arr, int diaI, int mesI, int anioI, int diaF, int mesF, int anioF)
    {
        SimpleDateFormat objFecha = new SimpleDateFormat("dd/MM/yyyy");

        String diaInicio = Integer.toString(diaI + 1);
        String mesInicio = Integer.toString(mesI);
        switch (anioI)
        {
            case 1:
                anioI = 2020;
                break;
            case 2:
                anioI = 2021;
                break;
            case 3:
                anioI = 2022;
                break;
            case 4:
                anioI = 2023;
                break;
        }
        String anioInicio = Integer.toString(anioI);

        String diaFin = Integer.toString(diaF + 1);
        String mesFin = Integer.toString(mesF);
        switch (anioF)
        {
            case 1:
                anioF = 2020;
                break;
            case 2:
                anioF = 2021;
                break;
            case 3:
                anioF = 2022;
                break;
            case 4:
                anioF = 2023;
                break;

        }
        String anioFin = Integer.toString(anioF);

        String fechaI = diaInicio + "/" + mesInicio + "/" + anioInicio;
        String fechaF = diaFin + "/" + mesFin + "/" + anioFin;

        int cont = 0;
        String s = "lkjhgjg";
        try
        {
            // Convierte las cadenas a objetos Date
            Date fechaInicio = objFecha.parse(fechaI);
            Date fechaFin = objFecha.parse(fechaF);

            // Llama al método para imprimir el historial en el rango de fechas
            for (int i = 0; i < matH.length; i++)
            {
                if (matH[i] != null)
                {
                    for (int j = 0; j < matH[i].length; j++)
                    {
                        Date fechaConsulta = matH[i][j].getFecha();
                        if (fechaConsulta.after(fechaInicio) && fechaConsulta.before(fechaFin))
                        {
                            cont++;
                            if (cont == 1)
                            {
                                s = "             Historial de citas\n";
                            }
                            s += "------------------------------------------------\n";
                            //s += "Fecha: " + objFecha.format(fechaConsulta) + "\n";
                            s += "Nombre del paciente: " + arr[i].getNom() + " " + arr[i].getPrimerAp() + " " + arr[i].getSegundoAp() + "\n";
                            s += matH[i][j].toString() + "\n"; // Utiliza el método toString de la clase HistorialClinico
                            s += "-------------------------------------------------\n";
                        }
                    }

                }

            }

            if (cont == 0)
            {
                s = "No hay consultas registradas en durante las fechas\n" + "Fecha Inicio" + fechaI + "\nFecha fin: " + fechaF;
                return s;
            }
            return s;

        } catch (ParseException e)
        {
            s = "Formato de fecha incorrecto/La fecha no es valida";
            return s;
        }
    }

    public static void fechaRango(Datos d[], HistorialClinico h[][])
    {
        if (d == null || h == null)
        {
            System.out.println("No hay datos");
        } else
        {
            String s = "";
            Date fechaInicial;
            Date fechaFinal;
            int diaI = 0, mesI = 0, anioI = 0;
            int diaF = 0, mesF = 0, anioF = 0;
            boolean b1 = true;
            System.out.println("Historiales Clinico en un rango de fechas ");
            System.out.println("Fecha inicial: ");
            do
            {
                System.out.print("Año: ");
                anioI = Lecturas.entero(true);
                b1 = true;
                if (anioI >= 1900)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Año no valido");
                }
            } while (b1);
            do
            {
                System.out.print("Mes: ");
                mesI = Lecturas.entero(true);
                b1 = true;
                if (mesI >= 1 && mesI <= 12)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Mes no valido");
                }
            } while (b1);
            do
            {
                System.out.print("Dia: ");
                diaI = Lecturas.entero(true);
                b1 = true;
                if (diaI >= 1 && diaI <= 31)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Dia no valido");
                }
            } while (b1);
            System.out.println("Fecha final: ");
            do
            {
                System.out.print("Año: ");
                anioF = Lecturas.entero(true);
                b1 = true;
                if (anioF >= 1900 && anioF >= anioI)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Año no valido");
                }
            } while (b1);
            do
            {
                System.out.print("Mes: ");
                mesF = Lecturas.entero(true);
                b1 = true;
                if (mesF >= 1 && mesF <= 12)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Mes no valido");
                }
            } while (b1);
            do
            {
                System.out.print("Dia: ");
                diaF = Lecturas.entero(true);
                b1 = true;
                if (diaF >= 1 && diaF <= 31)
                {
                    b1 = false;
                } else
                {
                    System.out.println("Dia no valido");
                }
            } while (b1);
            fechaInicial = new Date(anioI - 1900, mesI - 1, diaI);
            fechaFinal = new Date(anioF - 1900, mesF - 1, diaF);
            DateFormat formatoLargo = DateFormat.getDateInstance(DateFormat.LONG);
            System.out.println("PERSONAS CON REGISTROS EN EL HISTORIAL CLINICO CON EL RANGO DE FECHAS");
            System.out.println("DESPUES DE: " + formatoLargo.format(fechaInicial) + " ANTES DE: " + formatoLargo.format(fechaFinal) + "\n");
            for (int i = 0; i < h.length; i++)
            {
                if (h[i] != null)
                {
                    for (int j = 0; j < h[i].length; j++)
                    {
                        Date fechaHistorial = h[i][j].getFecha();
                        if (fechaHistorial.after(fechaInicial) && fechaHistorial.before(fechaFinal))
                        {
                            s += d[i].getNom() + " " + d[i].getPrimerAp() + " " + d[i].getSegundoAp() + "en \t" + formatoLargo.format(h[i][j].getFecha() + "\n");
                        }
                    }
                } else
                {
                }
            }
            System.out.println(s);
        }
    }

    public static void despHistorial(HistorialClinico mat[][], Datos[] arr)
    {
        if (mat == null || arr == null)
        {
            System.out.println("No hay consultas/datos registradas");
        } else
        {
            System.out.print("Dame la clave del personal o alumno:");
            String cve = Lecturas.cadena();
            int pos = buscarCve(arr, cve);
            if (pos == -1)
            {
                System.out.println("La clave no se encuentra");
            } else
            {
                if (mat[pos] == null)
                {
                    System.out.println("No hay consultas registradas");
                } else
                {
                    for (int i = 0; i < mat[pos].length; i++)
                    {
                        System.out.println("----------CONSULTA NO: " + (i + 1) + "----------");
                        System.out.println("");
                        System.out.println("Fecha: " + mat[pos][i].getFecha());
                        System.out.println("Padecimiento: " + mat[pos][i].getPadecimiento());
                        System.out.println("Antecedentes: " + mat[pos][i].getAntecedentes());
                        System.out.println("Medicamento: " + mat[pos][i].getMedicamento());
                        System.out.println("Plan de Tratamiento: " + mat[pos][i].getPlanTratamiento());
                        System.out.println("--------------------------------");
                    }
                }
                //Si pide solo del alumnos subimos lo del else y en el if debe de ir arr[pos] instanceof alumnos y despliega
                //En el else debe de ir lo que esta en el if y aparte arr[pos] instanceof personal para que
                //imprima un mensaje en el que diga que la clave no pertenece a un alumno
            }
        }
    }

    public static String despHistorialInterface(HistorialClinico mat[][], Datos[] arr, int pos)
    {

        int cont = 0;
        String s = "";

        if (mat[pos].length == 0)//por que si pongo if (mat[pos] == null) no funciona?
        {
            return "No hay consultas registradas";
        } else
        {

            for (int i = 0; i < mat[pos].length; i++)
            {
                if (cont == 0)
                {
                    s = "PACIENTE: " + arr[pos].getNom() + " " + arr[pos].getPrimerAp() + " " + arr[pos].getSegundoAp() + "\n";
                }

                s += "----------CONSULTA NO: " + (i + 1) + "----------\n";
                s += "\n";
                s += "Fecha: " + mat[pos][i].getFecha() + "\n";
                s += "Padecimiento: " + mat[pos][i].getPadecimiento() + "\n";
                s += "Antecedentes: " + mat[pos][i].getAntecedentes() + "\n";
                s += "Medicamento: " + mat[pos][i].getMedicamento() + "\n";
                s += "Plan de Tratamiento: " + mat[pos][i].getPlanTratamiento() + "\n";
                s += "--------------------------------\n";
                cont++;
            }
        }

        return s;

    }
}
