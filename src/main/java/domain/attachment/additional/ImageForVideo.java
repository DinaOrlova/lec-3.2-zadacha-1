package domain.attachment.additional;

public class ImageForVideo {
    private String url;
    private int width;
    private int height;
    private int withPadding;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWithPadding() {
        return withPadding;
    }

    public void setWithPadding(int withPadding) {
        this.withPadding = withPadding;
    }
}
