class Main {
    public static void main(String[] args) {
        System.out.println("################# Teste CoresRGB #################");        
    
        System.out.println("__________________________________________________");
        System.out.println("Cor original");
        CoresRGB cor1 = new CoresRGB(37, 150, 190);
        cor1.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Cópia da cor original");
        CoresRGB corCopia = new CoresRGB(cor1);
        corCopia.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Segunda cópia da cor original");
        CoresRGB corCopia2 = new CoresRGB(cor1);
        corCopia2.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Cor preta");
        CoresRGB corPreta = new CoresRGB();
        corPreta.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Verificando se a cor cópia é igual à cor original");
        System.out.println(cor1.equals(corCopia));      
        
        System.out.println("__________________________________________________");
        System.out.println("Verificando se a cor preta é igual à cor original");
        System.out.println(cor1.equals(corPreta));  
        
        System.out.println("__________________________________________________");
        System.out.println("Clareando a cor cópia em 10%");
        corCopia.clarearTonalidade(0.1);
        corCopia.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Escurecendo a cor original em 10%");
        cor1.escurecerTonalidade(0.1);
        cor1.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma nova instância igual à cor original (já escurecida)");        
        CoresRGB cor2 = cor1.novaInstancia(cor1);
        cor2.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Teste para criar cor com componentes negativos");
        CoresRGB cor3 = new CoresRGB(-37, -150, -190);
        cor3.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Teste para criar cor com componentes maiores que 255");
        CoresRGB cor4 = new CoresRGB(256, 300, 350);
        cor4.imprimir();

        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor PRETA");        
        CoresRGB corPRETA = CoresRGB.PRETA;
        corPRETA.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor BRANCA");        
        CoresRGB corBRANCA = CoresRGB.BRANCA;
        corBRANCA.imprimir();

        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor RED");        
        CoresRGB corRED = CoresRGB.RED;
        corRED.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor GREEN");        
        CoresRGB corGREEN = CoresRGB.GREEN;
        corGREEN.imprimir();
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor BLUE");        
        CoresRGB corBLUE = CoresRGB.BLUE;
        corBLUE.imprimir();

        System.out.println("__________________________________________________");
        System.out.println("Criando uma cor em equivalente cinza");        
        CoresRGB corCinza = corCopia2.novaInstanciaCinza(corCopia2);
        corCinza.imprimir();
        
        System.out.println("#################### Fim teste ####################");        
        System.out.println(" ");
        System.out.println("################## Teste Imagem ###################");        
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma Imagem BRANCA");        
        Imagem imagem1 = new Imagem(5, 3);//new Imagem(altura, largura)
        imagem1.mostrarImagem();
        
        System.out.println("__________________________________________________");
        System.out.println("Modificando pixels da Imagem, dado o pixel");
        CoresRGB pixel1 = new CoresRGB(37, 150, 190);
        imagem1.modificarPixel(0, 0, pixel1);
        imagem1.modificarPixel(0, 1, pixel1);
        imagem1.modificarPixel(0, 2, pixel1);
        imagem1.modificarPixel(1, 0, pixel1);
        imagem1.modificarPixel(1, 1, pixel1);
        imagem1.modificarPixel(1, 2, pixel1);
        imagem1.mostrarImagem();
    }
}

