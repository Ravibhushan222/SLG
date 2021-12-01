package slg.slgg.responses.message;


public enum CustomSuccessEnum {

    SUCCESS_TEAM_TOTAL_PLAYED_DATA_FETCHED(309001,"Total games played by team fetched successfully."),
    SUCCESS_TEAM_PARTICIPATION_DATA_FETCHED(309002,"Participation of team fetched successfully."),
    SUCCESS_TEAM_LEADERBOARD_FETCHED(309003,"Leaderboard by team fetched successfully."),
    SUCCESS_TROPHIES_BY_TEAM_FETCHED(309004,"Total trophies achieved by team fetch successfully."),
    SUCCESS_TOTAL_GAMES_PLAYED_BY_GAME_FETCHED(309005,"Total number of game session of games fetched successfully"),
    SUCCESS_PARTICIPATION_BY_GAME_FETCHED(309006,"Participation of players in Game fetched successfully."),
    SUCCESS_GAME_LEADERBOARD_FETCHED(309007,"Leaderboard by game fetched successfully."),
    SUCCESS_TROPHIES_BY_GAME_FETCHED(309008,"Percentage of trophies achieved by players fetched successfully."),
    SUCCESS_TOTAL_GAMES_PLAYED_BY_PLAYER_FETCHED(309009,"Total games played by player fetched successfully."),
    SUCCESS_PARTICIPATION_BY_PLAYER_FETCHED(309010,"Players total game played time fetched successfully."),
    SUCCESS_TROPHIES_BY_PLAYER_FETCHED(309011,"Players trophy count fetched successfully"),
    SUCCESS_CONTEST_LEADERBOARD_FETCHED(319032,"Leaderboard by contest fetched successfully."),
    SUCCESS_TOTAL_TIME_SPEND_IN_CONTEST_FETCHED(319033,"Total time fetched successfully."),
    SUCCESS_MLG_TROPHY_ACHIEVED_BY_PLAYERS_FETCHED(319034,"Players count with MLG trophy fetched successfully."),
    SUCCESS_GAME_WINRATE_FETCHED(306045,"Game winrate fetched successfully."),
    SUCCESS_TROPHY_LIST_FETCHED(306045,"Trophy List fetched successfully."),
    SUCCESS_TROPHY_DETAILS_FETCHED(306045,"Trophy Details fetched successfully."),
    SUCCESS_CONTEST_TROPHY_LIST_FETCHED(308002,"Contest trophies details fetched successfully."),
    SUCCESS_CONTEST_TROPHY_DOWNLOAD(309018,"Contest trophy report is ready to download."),
      SUCCESS_SLG_ASSIGNMENT_ADD (123305,"Assignment Added Successfully");
    private int messageCode;
    private String message;

    private CustomSuccessEnum(int messageCode, String message) {
        this.messageCode = messageCode;
        this.message = message;
    }

    public int getMessageCode() {
        return messageCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CustomSuccessEnum{" +
                "messageCode=" + messageCode +
                ", message='" + message + '\'' +
                '}';
    }
}
