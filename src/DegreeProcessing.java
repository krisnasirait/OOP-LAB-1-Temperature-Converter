class DegreeProcessing{
    double celcius;
    double reamur;
    double fahrenheit;
    double kelvin;

    DegreeProcessing(double deg){
        celcius = deg;
        reamur = (4*deg)/5;
        fahrenheit = (9*deg+32);
        kelvin = deg + 273.15;
    }

}
