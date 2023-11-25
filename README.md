# Projeto de Aplicativo Mobile
## Integrantes: Matheus Kevin dos Santos e Pedro Santos Pequini- 4° Bimestre

**Nome do Aplicativo:** Sweetastic

**Temática:** Plástico, usos e características
**Descrição:** O projeto do aplicativo mobile foi feita na linguagem Java, na versão de Android 8.0 (Versão Oreo). Ele contem 5 telas distintas 
(Home, Usos, Aspectos, Pontos e Reciclagem) onde em cada uma há um menuzinho na parte inferior da tela, com os icones das respectívas telas, 
possibilitando a navegação entre elas. O aplicativo tem a propósta de informar as pessoas que o usárem, sobre o plástico, material tão comum
no dia-a-dia das pessoas, e a ideia é que a informação seja passada de maneira divertida e descontraida, portanto, o APP tem um mascote, 
no caso. é a Docinho, dá série de desenhos "As Meninas Super Poderosas", que nos ajuda com essa propósta

<br>

> **Cores:** Tons de verde, branco, preto e creme (um tom de amarelo)
>> Verde claro: #5DB443
> 
>> Verde escuro: #003C25
> 
>> Creme: #FFF9A5
> 
>> Branco: #FFFFFF
>
>> Preto: #000000
<br>

**Logo do Aplicativo:**

<br>

  <img src="https://github.com/MKevin2/Sweetastic/blob/master/app/src/main/res/drawable/logo.png" width="230" height="230">
  
**Criação do Aplicativo durante o 3°B:**
>> 1. Novas telas
>
>> 2. Botões para a navegação entre telas (Intents Explícitas com funções diferentes)
>
>> 3. Botões para uma navegação externa (Intents Implícitas com resultados variados)
>
>> 4. TextViews, ImageViews, VideoView, ButtonImage, EditText, entre outros elementos para compor as telas

## Informações das novas telas/componentes
1.1. **Pontos de coleta** 
<p>
   Na tela "Reciclagem" foi criado um botão, que leva o usuário para uma nova tela, que mostrará quais são os locais adequados para o descarte de lixo, que é mostrado por meio de duas Intents Implícitas, que são os botões "Pesquisar Ecopontos" e "Pesquise no Mapa" o primeiro deles leva o usuário para uma pesquisa no Google "Pontos de coleta de lixo perto de mim", e o segundo botão leva o usuário para o seu aplicativo de mapa, para poder procurar locais de descarte de lixo por perto de sua localização.
</p>

1.2. **Saiba mais** 
<p>
  Na tela "Aspectos", foi criado um botão que leva o usuário para uma nova tela, que mostrará a história do plástico, mostrando sobre cada detalhe de sua composição e processo de criação, e vem acompanhado de uma Intent Explícita, que se trata de um vídeo(VideoView), que conta a história do material plástico com muito mais detalhes, criado pelo canal "Invenções da História" no Youtube.
</p>

1.3. **Crie Você Mesmo!** 
<p>
  Na tela "Usos", contém um novo botão adicionado, que leva o usuário para uma nova tela, que apresenta dois vídeos(duas Intents Explícitas) de ideias de reciclagem que você mesmo pode fazer em casa, o primeiro deles mostra a criação de um avião de garrafa pet, e o segundo deles mostra a criação de um carrinha de tampinha de garrafa de plástico
</p>

1.4. **Jogos e Botão 'Bem Vindo'** 
<p>
  Na tela principal, logo ao iniciar o aplicativo, foi criado uma função que pede o nome do usuário, e assim que ele digita seu nome, o aplicativo lhe dá boas vindas. E após isso, na parte de baixo da tela, podemos ver um novo botão chamado "Jogos", que ao clicar nele, a aplicação te redireciona(Intent Implícita) a um site que contém diversos mini-games com o tema de reciclagem e conscientização sobre o lixo.
</p>


**Diagrama de Classes:**
<br>
  <img src="https://github.com/MKevin2/Sweetastic/blob/master/IMG-20230808-WA0011.jpg" widht="260" height="280">   
<br>
<br>
Link do vídeo do funcionamento atualizado do aplicativo:  
[Aplicativo Sweetastic - APP PAMI 3Bimestre](https://youtu.be/bhckaZixTjE?si=5lLjrHaxY6rOlY2B) 👈

**4° BIMESTRE - SENSORES:**

>ADIÇÕES:

>> Zoom In/Zoom Out em imagens <br>
>> Nova tela "Sensor" com o Sensor de luz <br>
>> Toast na tela "Home" de boas vindas 

Link do vídeo do funcionamento atualizado do aplicativo:  
[Aplicativo Sweetastic - APP PAMI 4Bimestre](https://youtu.be/F7CjhElmIx4?feature=shared) 👈