package ch.heigvd.res.labs.roulette.net.protocol;

public class ByeCommandResponse {

    private String status;
    private int numberOfCommands;

    public ByeCommandResponse() {

    }

    public ByeCommandResponse(String status, int numberOfCommands) {
        this.status = status;
        this.numberOfCommands = numberOfCommands;
    }

    public String getStatus() {
        return status;
    }

    public int getNumberOfCommands() {
        return numberOfCommands;
    }
}
