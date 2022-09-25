package LabAssignment2;

public class Convert {
    public double value;
    
    public String convertTo,convertFrom;

    

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    public String getConvertFrom() {
        return convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public double convertedValue=65;

    public double getConvertedValue() {
            if(convertFrom=="fl.oz"){
                if(convertTo=="ml"){
                    convertedValue = value * 29.574;
                }else if(convertTo=="l"){
                    convertedValue = value / 33.814;
                }

            }else if(convertFrom=="gal"){
                if(convertTo=="ml"){
                    convertedValue = value * 3785;
                }else if(convertTo=="l"){
                    convertedValue = value * 3.785;
                }
            }else if(convertFrom=="oz"){
                if(convertTo=="g"){
                    convertedValue = value * 28.35;
                }else if(convertTo=="kg"){
                    convertedValue = value / 35.274;
                }
            }else if(convertFrom=="lb"){
                if(convertTo=="g"){
                    convertedValue = value * 453.6;
                }else if(convertTo=="kg"){
                    convertedValue = value * .4536;
                }
            }else if(convertFrom=="in"){
                if(convertTo=="mm"){
                    convertedValue = value * 25.4;
                }else if(convertTo=="cm"){
                    convertedValue = value * 2.54;
                }else if(convertTo=="m"){
                    convertedValue = value / 39.37;
                }else if(convertTo=="km"){
                    convertedValue = value / 39370 ;
                }
            }else if(convertFrom=="ft"){
                if(convertTo=="mm"){
                    convertedValue = value * 304.8;
                }else if(convertTo=="cm"){
                    convertedValue = value * 30.48;
                }else if(convertTo=="m"){
                    convertedValue = value / 3.281;
                }else if(convertTo=="km"){
                    convertedValue = value / 3281;
                }
            }else if(convertFrom=="mi"){
                if(convertTo=="mm"){
                    convertedValue = value *  1.609e6;
                }else if(convertTo=="cm"){
                    convertedValue = value *  160900;
                }else if(convertTo=="m"){
                    convertedValue = value *  1609;
                }else if(convertTo=="km"){
                    convertedValue = value *  1.609;
                }
            }
        return convertedValue;
    }
}
