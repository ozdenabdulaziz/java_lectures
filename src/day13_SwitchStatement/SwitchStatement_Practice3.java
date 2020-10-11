package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        String browser = "chrome";
        String selected = "";

        switch (browser) {

            case "chrome":
                selected = "CHROME BROWSER IS SELECTED";
                break;
            case "firefox":
                selected = "FIREFOX BROWSER IS SELECTED";
                break;
            case "opera":
                selected = "OPERA BROWSER IS SELECTED";
                break;
            case "safari":
                selected = "SAFARI BROWSER IS SELECTED";
                break;
            case "edge":
                selected = "EDGE BROWSER IS SELECTED";
                break;
            case "ie":
                selected = "IE BROWSER IS SELECTED";
                break;
            default:
                selected = "Invalid BROWSER NAME";
                break;
        }

        System.out.println(selected);

    }
}

/*

task:

        String str = "";

        valid browsers =  chrome, firefox, opera, safari, edge, ie

        output: CHROME BROWSER IS SELECTED

 */