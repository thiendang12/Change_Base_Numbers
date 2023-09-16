
package Model;

public class Element {

    private int inputBase;
    private int outputBase;
    private String inputValue;
    private int result;
    private String resultString;

    public int getInputBase() {
        return inputBase;
    }

    public void setInputBase(int inputBase) {
        this.inputBase = inputBase;
    }

    public int getOutputBase() {
        return outputBase;
    }

    public void setOutputBase(int outputBase) {
        this.outputBase = outputBase;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public String getResultString(){
         return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }
    public int otherToDec(String other, int base) {
        int result = 0;
        String Hex = "0123456789ABCDEF";
        other = other.toUpperCase();
        for (int i = 0; i < other.length(); i++) {
            result += Hex.indexOf(other.charAt(i)) * Math.pow(base, other.length() - 1 - i);
        }
        return result;
    }

    public String decToOther(int dec, int base) {
        String result = "";
        String Hex = "0123456789ABCDEF";
        while (dec > 0) {
            result = Hex.charAt(dec % base) + result;
            dec /= base;
        }
        return result;
    }

}
