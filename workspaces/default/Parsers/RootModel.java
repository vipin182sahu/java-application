import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public String end_time;
	public String type;
	public String logo;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public int id;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public String email;
	public String name;
	public String background_image;
	public CopyrightModel _copyright;

	public RootModel(CreatorModel creator, Call_for_papersModel call_for_papers, String start_time, String location_name, String end_time, String type, String logo, VersionModel version, String privacy, String organizer_name, String description, ArrayList<Social_linksModel> social_links, String timezone, String schedule_published_on, String topic, int id, String state, String organizer_description, String code_of_conduct, String email, String name, String background_image, CopyrightModel copyright) {

		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.id = id;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.name = name;
		this.background_image = background_image;
		this._copyright = copyright;

	}

}