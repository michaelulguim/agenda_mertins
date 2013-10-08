
package util;


public class Data{
	
	private String data;
	
	public Data(String data){
            String[] dataNova = data.split("-");
            this.data = dataNova[0] + "/" + dataNova[1] + "/" + dataNova[2];
	}
	
	/*
        public String toString(){
		return data[0] + "/" + data[1] + "/" + data[2];
	}
        */
}

