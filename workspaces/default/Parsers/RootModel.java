import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String code_of_conduct;
	public String state;
	public CopyrightModel _copyright;
	public int id;
	public String logo;
	public String description;
	public String background_image;
	public String privacy;
	public String name;
	public String type;
	public String start_time;
	public String organizer_description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;

	public RootModel(CreatorModel creator, VersionModel version, String end_time, String organizer_name, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, String code_of_conduct, String state, CopyrightModel copyright, int id, String logo, String description, String background_image, String privacy, String name, String type, String start_time, String organizer_description, String topic, ArrayList<Social_linksModel> social_links, String email, String timezone) {

		this._creator = creator;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.type = type;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;

	}

}