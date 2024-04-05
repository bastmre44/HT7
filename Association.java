public class Association {
    private String englishWord;
    private String spanishWord;
    private String frenchWord;
    
    public Association(String englishWord, String spanishWord, String frenchWord) {
        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
        this.frenchWord = frenchWord;
    }
    
    // Métodos de acceso para obtener las palabras en los diferentes idiomas
    public String getEnglishWord() {
        return englishWord;
    }
    
    public String getSpanishWord() {
        return spanishWord;
    }
    
    public String getFrenchWord() {
        return frenchWord;
    }
}
