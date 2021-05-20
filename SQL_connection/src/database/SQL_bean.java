package database;

public class SQL_bean {
	
	private static String actorSeven = "seven";
	private static String oscarMovies = "oscar";
	private static String bradMovies = "brad pitt";
	private static String pittAwards = "";
	
	static String requestQuery = "SELECT `act_id`,`movie_actor` FROM `movie_actors` INNER JOIN `movie_title` ON `movie_title`.`movie_id` = `movie_actors`.`movie_id` WHERE `movie_title`.`movie_name` = ?";
	static String requestQuery2 = "SELECT `movie_name` FROM `movie_title` WHERE `movie_reward` = ?";
	static String requestQuery3 = "SELECT `movie_actor`,`movie_name` FROM `movie_actors` INNER JOIN `movie_title` ON `movie_actors`.`movie_id` = `movie_title`.`movie_id` WHERE `movie_actors`.`movie_actor` = ?";
	static String requestQuery4 = "SELECT `movie_actor`,`movie_name`,`movie_reward` FROM `movie_actors` INNER JOIN `movie_title` ON `movie_actors`.`movie_id` = `movie_title`.`movie_id` WHERE `movie_actors`.`movie_actor` = 'brad pitt' AND `movie_title`.`movie_reward` <> ?";
	
	static String id1 = "movie_actor";
	static String id2 = "movie_name";
	static String id3 = "movie_name";
	static String id4 = "movie_reward";
	
	
	public static String requestQuery() {
		return requestQuery;
	}
	
	public static String requestQuery2() {
		return requestQuery2;
	}
	public static String requestQuery3() {
		return requestQuery3;
	}
	public static String requestQuery4() {
		return requestQuery4;
	}
	
	public static String id1() {
		return id1;
	}

	public static String id2() {
		return id2;
	}
	public static String id3() {
		return id3;
	}
	public static String id4() {
		return id4;
	}
	
	public static String actorSeven() {
		return actorSeven;
	}
	
	public static String oscarMovies() {
		return oscarMovies;
	}
	
	public static String bradMovies() {
		return bradMovies;
	}
	
	public static String pittAwards() {
		return pittAwards;
	}
}
