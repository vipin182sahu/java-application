import java.util.ArrayList;

class RootModel {

	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;
	public int id;
	public String privacy;
	public VersionModel _version;
	public String name;
	public String email;
	public String description;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public String location_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;

	public RootModel(String state, String logo, CopyrightModel copyright, String topic, int id, String privacy, VersionModel version, String name, String email, String description, String timezone, CreatorModel creator, String organizer_name, String organizer_description, String location_name, String start_time, ArrayList<Social_linksModel> social_links, String code_of_conduct, String end_time, String type, String background_image, Call_for_papersModel call_for_papers, String schedule_published_on) {

		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this.name = name;
		this.email = email;
		this.description = description;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;

	}

}