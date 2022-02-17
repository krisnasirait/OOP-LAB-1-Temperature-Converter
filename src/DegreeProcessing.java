class DegreeProcessing{
    double celcius;
    double reamur;
    double fahrenheit;
    double kelvin;
    String waterCond;

    DegreeProcessing(double deg){
        celcius = deg;
        reamur = (4*deg)/5;
        fahrenheit = (9*deg+32);
        kelvin = deg + 273.15;
        if(deg < 0){
            waterCond = "Kondisi air beku";
        }else if(deg > 0 && deg < 100){
            waterCond = "Kondisi air normal";
        }else if(deg > 100){
            waterCond = "Kondisi air beku";
        }
    }

}
