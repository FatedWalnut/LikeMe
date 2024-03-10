package olivier.erhard;

public class Games {
    private String name;
    private String description;
    private int imageResourceID;

    // Array estático de objetos Games
    public static final Games[] games = {
            new Games("Age of empires IV", "Age of Empires IV é um jogo eletrônico de estratégia em tempo real desenvolvido pela Relic Entertainment e World's Edge Studio para o Windows 10.", R.drawable.age_of_empires_iv),
            new Games("Hades", "Hades é um jogo eletrônico roguelike de RPG de ação desenvolvido e publicado pela Supergiant Games.", R.drawable.hades),
            new Games("Valorant", "Valorant é um jogo eletrônico multijogador gratuito para jogar de tiro em primeira pessoa desenvolvido e publicado pela Riot Games.", R.drawable.valorant)
    };

    // Construtor privado para inicializar objetos Games
    private Games(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    // Métodos de acesso
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    // Método toString para representar o objeto como uma string
    public String toString() {
        return this.name;
    }
}
