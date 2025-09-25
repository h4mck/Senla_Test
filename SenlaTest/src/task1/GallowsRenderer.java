package task1;

class GallowsRenderer {
    public void renderGallows(int lives) {
        System.out.println("\n" + getGallowsArt(lives));
    }

    private String getGallowsArt(int lives) {
        switch (lives) {
            case 6:
                return "  ____\n |    |\n |\n |\n |\n_|_";
            case 5:
                return "  ____\n |    |\n |    O\n |\n |\n_|_";
            case 4:
                return "  ____\n |    |\n |    O\n |    |\n |\n_|_";
            case 3:
                return "  ____\n |    |\n |    O\n |   /|\n |\n_|_";
            case 2:
                return "  ____\n |    |\n |    O\n |   /|\\\n |\n_|_";
            case 1:
                return "  ____\n |    |\n |    O\n |   /|\\\n |   /\n_|_";
            case 0:
                return "  ____\n |    |\n |    O\n |   /|\\\n |   / \\\n_|_";
            default:
                return "";
        }
    }
}
