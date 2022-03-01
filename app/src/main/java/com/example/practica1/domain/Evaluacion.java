package com.example.practica1.domain;

public class Evaluacion {

    public Pie evaluarPie(Object value1,Object value2,Object value3,Object value4,Object value5,Object value6,Object value7){

        return null;
    }
    public Pie evaluarPie(Object value1,Object value2,Object value3,Object value4,Object value5,Object value6){
        String titulo = null;
        Double[] ejeY = null;
        String[] ejeX = null;
        Double[][] unir = null;

        //Para validar el Titulo
        if (value1.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value1;
            }else{return null;}
        }
        if (value2.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value2;
            }else{return null;}
        }
        if (value3.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value3;
            }else{return null;}
        }
        if (value4.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value4;
            }else{return null;}
        }
        // Validacion para el tipo EjeX String[]

        if (value1.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value1;
            }else{return null;}
        }
        if (value2.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value2;
            }else{return null;}
        }
        if (value3.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value3;
            }else{return null;}
        }
        if (value4.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value4;
            }else{return null;}
        }
        //Validacion para el tipo EjeY

        if (value1.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value1;
            }else{return null;}
        }
        if (value2.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value2;
            }else{return null;}
        }
        if (value3.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value3;
            }else{return null;}
        }
        if (value4.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value4;
            }else{return null;}
        }

        //Validacion para el tipo Unir
        if (value1.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value1;
            }else{return null;}
        }
        if (value2.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value2;
            }else{return null;}
        }
        if (value3.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value3;
            }else{return null;}
        }
        if (value4.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value4;
            }else{return null;}
        }

        return null;
    }

    public Barra evaluarBarra(Object value1,Object value2,Object value3, Object value4){
        String titulo = null;
        Double[] ejeY = null;
        String[] ejeX = null;
        Double[][] unir = null;
        System.out.println("Ingreso a evaluar la barra");
        //Para validar el Titulo
        if (value1.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value1;
            }else{return null;}
        }
        if (value2.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value2;
            }else{return null;}
        }
        if (value3.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value3;
            }else{return null;}
        }
        if (value4.getClass() == String.class) {
            if (titulo == null) {
                titulo = (String) value4;
            }else{return null;}
        }
        // Validacion para el tipo EjeX String[]

        if (value1.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value1;
            }else{return null;}
        }
        if (value2.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value2;
            }else{return null;}
        }
        if (value3.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value3;
            }else{return null;}
        }
        if (value4.getClass() == String[].class) {
            if (ejeX == null) {
                ejeX = (String[]) value4;
            }else{return null;}
        }
        //Validacion para el tipo EjeY

        if (value1.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value1;
            }else{return null;}
        }
        if (value2.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value2;
            }else{return null;}
        }
        if (value3.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value3;
            }else{return null;}
        }
        if (value4.getClass() == Double[].class) {
            if (ejeY == null) {
                ejeY = (Double[]) value4;
            }else{return null;}
        }

        //Validacion para el tipo Unir
        if (value1.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value1;
            }else{return null;}
        }
        if (value2.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value2;
            }else{return null;}
        }
        if (value3.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value3;
            }else{return null;}
        }
        if (value4.getClass() == Double[][].class) {
            if (unir == null) {
                unir = (Double[][]) value4;
            }else{return null;}
        }

        // realizar las validaciones para enviar el programa
        if (titulo!=null && ejeX!=null && ejeY!=null && unir!=null) {
            return new Barra();
        }

        return null;
    }
}
