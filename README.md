# Técnicas de Programação | Java

## Configurando meu Ambiente Java - Windows

### Download e instalação
1. Baixar a JDK (Java Developer Kit) e instala-la: 
> Utilize a opção de download Windows (opção x64 Installer). <br>

https://www.oracle.com/java/technologies/downloads/#jdk17-linux

2. Aceite os termos da licença e inicie o download
![licenca](https://1.bp.blogspot.com/-inWnB0zs6qc/YJ28pgaZg5I/AAAAAAAAGDQ/HqdSC03eDJUUULmaEySpo6GXwGhVg_bGwCLcBGAsYHQ/s1227/java3.PNG)
3. Após o download, execute o arquivo baixado. Clique em Next
![download](https://1.bp.blogspot.com/-HPzgnv_R8Zo/YKAyZATFIYI/AAAAAAAAGFo/LUaRiXuyFZ8sXveFyxwTERANJARcxPH1gCLcBGAsYHQ/s579/java4.PNG)
4. Colete o diretório que seu Java JDK esta sendo instalado, como da imagem abaixo:
![caminho](https://1.bp.blogspot.com/-ItjBhS_2a9M/YKAyooaMm4I/AAAAAAAAGFw/Z6Z5yQcCkY4Q-Eh8lieH4B16TCuWefXbACLcBGAsYHQ/s529/java6.PNG)
5. Aguarde a finalização da instalação Java JDK. 

### Configurando as variáveis de ambiente
1. Clique com o botão direito sobre o ícone de “Meu Computador” na sua área de trabalho, e no menu de contexto escolha a opção “Propriedades” (ou através do Painel de Controle do Windows e acesse a categoria “Sistema e Segurança” e em seguida a opção “Sistema”), conforme a imagem a seguir: <br>
![setup](https://lh3.googleusercontent.com/-IWLbGBVHXKk/YJ5jqkDFqwI/AAAAAAAAGD8/xwI6dC_aHTcKOMyd-ZTPuC05pjgka_flACLcBGAsYHQ/image.png)
2. Na janela que se abre, acesse a opção Configurações avançadas do sistema, conforme destacado na imagem abaixo:
![janela](https://lh3.googleusercontent.com/-t3juWIzbVk8/YJ5j2piVWTI/AAAAAAAAGEA/RKt0DgQp90coarKMbmSOxhazlNiImEgDQCLcBGAsYHQ/image.png)
3. Na tela a seguir, clique no botão _Variáveis de Ambiente…_ no canto inferior direito da janela: <br>
![propriedades](https://lh3.googleusercontent.com/-8Et1QBoZhp8/YJ5j_iFo3QI/AAAAAAAAGEI/AHUAXBzEwCQhlJUy8z5TlLbKpaRspR98gCLcBGAsYHQ/image.png)
4. Uma tela similar abaixo deve abrir. Clique  em *Novo*: </br>
![novo](https://user-images.githubusercontent.com/8368362/162593328-ca6f9f2c-a532-44dc-bf08-8f68eb4ab7c2.png)
5. Na janela que se abre, definimos a variável **JAVA_HOME**, conforme a imagem abaixo, informando no valor da variável, aquele caminho de instalação do JDK que anotamos no início do processo de instalação (add link) e clique em **OK**: <br>
![java home](https://lh3.googleusercontent.com/-cqmP1Z-1D6w/YJ5kXRPwQ6I/AAAAAAAAGEY/VbXxQS92p2wGDbaO9LXM3Pb5X40L2zV-QCLcBGAsYHQ/image.png)
6. Agora selecionamos a variável **Path** na lista de variáveis do sistema e clicamos no botão **Editar…** Tome cuidado para não apagar nada do que já está escrito no valor da variável _Path_, senão diversas aplicações que dependem destas configurações podem parar de funcionar corretamente. O que deve ser feito no valor desta variável é ir até o final do valor da mesma e acrescentar a nossa variável **JAVA_HOME** ao Path, conforme a imagem a seguir: </br>
![path](https://lh3.googleusercontent.com/-VqVpGdsLTI0/YJ5ke-n30ZI/AAAAAAAAGEg/_J2Mo3kg6_Mf8nPUxMiv4XFli0KP0JnQACLcBGAsYHQ/image.png) <br> <br>

> Observe que o texto adicionado no fim do valor foi: </br>
> **;%JAVA_HOME%\bin** </br>
Dependendo da versão do seu sistema operacional a janela de edição da variável Path aparecerá em forma de lista, como na imagem abaixo: </br>
![tela](https://1.bp.blogspot.com/-x9L2PXoL9mM/YKA11_J-J8I/AAAAAAAAGGA/p3mV-MlmpiIpdIufxOyPJ1e3Fmxnco-RQCLcBGAsYHQ/s539/java10.PNG)

### Verificando a instalação
Para confirmar que após a instalação o JDK está disponível para o ambiente operacional, execute o **prompt** de comando do Windows e execute o comando:
`java -version` </br>
O comando deve exibir a versão atual do java (JDK) instalado: </br>
![comando](https://lh3.googleusercontent.com/-8vkTh5r3Jf4/YJ5lL_UQtqI/AAAAAAAAGEw/wt3Gn-Z7FtcJX9CuM0ivU89knZjwsHQ-wCLcBGAsYHQ/image.png)

### Instalando Intellij
1. Baixe a versão **Community** em https://www.jetbrains.com/idea/download/#section=mac e instale com as configurações iniciais
