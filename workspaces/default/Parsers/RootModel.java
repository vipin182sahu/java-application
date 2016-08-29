import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String topic;
	public int id;
	public String state;
	public String location_name;
	public String timezone;
	public String description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String start_time;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public String type;
	public String organizer_name;
	public String email;
	public String code_of_conduct;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(ArrayList<Social_linksModel> social_links, String logo, String topic, int id, String state, String location_name, String timezone, String description, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String name, String start_time, String schedule_published_on, VersionModel version, String organizer_description, String background_image, String type, String organizer_name, String email, String code_of_conduct, String end_time, CopyrightModel copyright) {

		this.social_links = social_links;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.type = type;
		this.organizer_name = organizer_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}