public class Imagem
{
    //i. a representação estática da classe criada
    private CoresRGB[][] pixel;
    //ii. um construtor que crie uma Imagem. O tamanho da Imagem será passado como parâmetro no construtor. A imagem criada deve ter todos os píxels ajustados para o BRANCO
    public Imagem(int altura, int largura){
        this.pixel = new CoresRGB[altura][largura];
        int i, j;
        for(i = 0; i < altura; i++){
            for(j = 0; j < largura; j++){
                this.pixel[i][j] = CoresRGB.BRANCA;
            }
        }
    }
    //iii. um método que modifique o pixel de uma imagem dada a posição e o pixel
    public void modificarPixel(int linha, int coluna, CoresRGB pixel){
        this.pixel[linha][coluna] = pixel;
    }
    //iv. sobrecarregue este método para modifique o pixel de uma imagem dada a posição e os valores de RGB do pixel.     
    private void modificarPixel(int linha, int coluna, int red, int green, int blue){
        CoresRGB pixel2 = new CoresRGB(red, green, blue);
        this.pixel[linha][coluna] = pixel2;
    }
    //v. método que verifique que duas imagens são iguais
    public boolean compararImagens(Imagem imagem){
        //Verificando se as dimensões das figuras são idênticas.
        int tamanho = 0;
        if((this.pixel.length == imagem.pixel.length) && (this.pixel[0].length == imagem.pixel[0].length)){
            tamanho = 1;
        }else{
            return false;
        }
        //Comparando cada pixel das imagens informadas pelo usuário.
        int i, j;
        int area = this.pixel.length * this.pixel[0].length;        
        int areaCalculada = 0;        
        for(i = 0; i < this.pixel.length; i++){
            for(j = 0; j < this.pixel[0].length; j++){
                if(imagem.pixel[i][j].equals(this.pixel[i][j])){
                    areaCalculada = areaCalculada + 1;
                }
            }          
        }
        if(area == areaCalculada && tamanho == 1){
            return true;
        }else{
            return false;
        }        
    }
    //Mostrar a imagem
    public void mostrarImagem(){
        int i, j;
        for(i = 0; i < this.pixel.length; i++){
            for(j = 0; j < this.pixel[0].length; j++){
                System.out.print(this.pixel[i][j].getLuminosidade());
            }
            System.out.println("");
        }
    }
}
