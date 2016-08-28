import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String background_image;
	public String timezone;
	public int id;
	public String start_time;
	public String organizer_description;
	public String privacy;
	public String location_name;
	public VersionModel _version;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String name;
	public String logo;
	public CreatorModel _creator;

	public RootModel(CopyrightModel copyright, String schedule_published_on, String organizer_name, String topic, String description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String background_image, String timezone, int id, String start_time, String organizer_description, String privacy, String location_name, VersionModel version, String end_time, String email, Call_for_papersModel call_for_papers, String type, String name, String logo, CreatorModel creator) {

		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.description = description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;
		this._version = version;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this._creator = creator;

	}

}