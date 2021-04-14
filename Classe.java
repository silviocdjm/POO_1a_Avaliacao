public class Imagem
{
    //i. a representação estática da classe criada
    private CoresRGB[][] imagem;
    CoresRGB pixel = new CoresRGB();
    
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
    private void modificarPixel(int linha, int coluna, CoresRGB pixel){
        
    }

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
}
