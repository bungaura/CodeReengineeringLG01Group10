package Missing_Hierarchy;

public class Entity {
    private String name;
    private String sprite;

    public Entity(String name, String sprite) {
        this.name = name;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
