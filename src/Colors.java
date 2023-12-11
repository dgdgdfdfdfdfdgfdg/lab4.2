public enum Colors {
    BLACK("черными"),YELLOW("жёлтыми"),BLUE("голубыми"),GREY("серыми"),BROWN("карими");

    private final String word;

    Colors(String word) {
        this.word =word;
    }

    public String getWord() {
        return word;
    }
}
