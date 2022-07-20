package jour20072022.Bridge;

public abstract class Color {
    private String code;
    private String name;

    @Override
    public String toString() {
        return "Color{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Color(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
