import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String name;
	public String logo;
	public String timezone;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public String topic;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String organizer_description;
	public String email;
	public String background_image;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, String location_name, CopyrightModel copyright, String start_time, String name, String logo, String timezone, VersionModel version, int id, String code_of_conduct, String state, String organizer_name, String topic, String privacy, String type, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String description, String organizer_description, String email, String background_image) {

		this._creator = creator;
		this.social_links = social_links;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;
		this.timezone = timezone;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.email = email;
		this.background_image = background_image;

	}

}