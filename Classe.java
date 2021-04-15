public class Imagem
{
    //i. a representação estática da classe criada
    private CoresRGB[][] imagem;
    public static final CoresRGB PIXEL = new CoresRGB(171,171,171);

    //ii. um construtor que crie uma Imagem. O tamanho da Imagem será passado como parâmetro no construtor. A imagem criada deve ter todos os píxels ajustados para o BRANCO
    public Imagem(int altura, int largura){
        this.imagem = new CoresRGB[altura][largura];
        int i, j;
        for(i = 0; i < altura; i++){
            for(j = 0; j < largura; j++){
                this.imagem[i][j] = CoresRGB.BRANCA;
            }
        }
    }
    
    //iii. um método que modifique o pixel de uma imagem dada a posição e o pixel
    public void modificarPixel(int linha, int coluna, CoresRGB pixel){
        this.imagem[linha][coluna] = Imagem.PIXEL;
    }
    
    //iv. sobrecarregue este método para modifique o pixel de uma imagem dada a posição e os valores de RGB do pixel.     
    private void modificarPixel(int linha, int coluna, int red, int green, int blue){
 
    }
    //Mostrar a imagem
    public void mostrarImagem(){
        int i, j;
        for(i = 0; i < this.imagem.length; i++){
            for(j = 0; j < this.imagem[0].length; j++){
                System.out.print(this.imagem[i][j].getLuminosidade());
            }
            System.out.println("");
        }
    }
    
    /*public CoresRGB getPixel() {
        return pixel;
    }

    public void setPixel(CoresRGB pixel) {
        this.pixel = pixel;
    }
    
    */
}
