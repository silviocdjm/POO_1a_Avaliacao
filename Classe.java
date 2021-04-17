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
