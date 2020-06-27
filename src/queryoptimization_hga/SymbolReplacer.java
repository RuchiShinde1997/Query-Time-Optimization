/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queryoptimization_hga;

public class SymbolReplacer
{
public String replaceString(String str)
    {

    str=str.replace(",","");
    str=str.replace("?","");
    str=str.replace("-","");
    str=str.replace("_","");
    str=str.replace("/","");
    str=str.replace("'","");
    str=str.replace(":","");
    str=str.replace(";","");
   





    return str;



    }
}
