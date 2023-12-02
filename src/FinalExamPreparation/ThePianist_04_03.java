package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_04_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int piecesInput = Integer.parseInt(kbInput.nextLine());

        Map<String,piecesInfo> piecesContainer = new LinkedHashMap<>();

        for (int i = 0; i < piecesInput; i++) {

            String input = kbInput.nextLine();
            String pieceName = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];

            piecesInfo newPieceInfo = new piecesInfo(composer,key);

            piecesContainer.put(pieceName,newPieceInfo);

        }

        String command = kbInput.nextLine();

        while (!"Stop".equalsIgnoreCase(command)){

            String commandType = command.split("\\|")[0];
            String pieceName = command.split("\\|")[1];

            piecesInfo piece = piecesContainer.get(pieceName);


            switch (commandType){
                case "Add":
                    String composer = command.split("\\|")[2];
                    String key = command.split("\\|")[3];
                    if (piecesContainer.containsKey(pieceName)){
                        System.out.printf("%s is already in the collection!%n",pieceName);
                    }else {
                        piecesInfo AddPiece = new piecesInfo(composer,key);
                        piecesContainer.put(pieceName,AddPiece);

                        System.out.printf("%s by %s in %s added to the collection!%n",pieceName,composer,key);
                    }

                    break;

                case "Remove":
                    if (piecesContainer.containsKey(pieceName)){
                        piecesContainer.remove(pieceName);
                        System.out.printf("Successfully removed %s!%n",pieceName);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                    }

                    break;

                case "ChangeKey":
                    String newKey = command.split("\\|")[2];

                    if (piecesContainer.containsKey(pieceName)){

                        piece.setKey(newKey);

                        System.out.printf("Changed the key of %s to %s!%n",pieceName,newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                    }

                    break;
            }

            command = kbInput.nextLine();
        }

        for (Map.Entry<String , piecesInfo>piece: piecesContainer.entrySet()) {

            piecesInfo listed = piece.getValue();

            System.out.printf("%s -> Composer: %s, Key: %s%n",piece.getKey(),listed.getComposer(),listed.getKey());
        }
    }

    static class piecesInfo{

        private String composer;
        private String key;

        public piecesInfo(String composer, String key) {
            this.composer = composer;
            this.key = key;
        }

        public String getComposer() {
            return this.composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}
