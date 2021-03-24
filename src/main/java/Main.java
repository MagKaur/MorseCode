class StringToMorseCode {
    public static void main(String[] args) throws Exception {
        MorseConverter converter = new MorseConverter("","","");
        converter.getNumber();
        converter.translateToMorse();
        converter.show();
    }
}
