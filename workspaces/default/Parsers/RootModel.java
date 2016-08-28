import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public String timezone;
	public int id;
	public String name;
	public String end_time;
	public String schedule_published_on;
	public String topic;
	public String logo;
	public String code_of_conduct;
	public String organizer_description;
	public VersionModel _version;
	public String description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String state;
	public String email;
	public String start_time;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CreatorModel creator, String privacy, String organizer_name, String background_image, String timezone, int id, String name, String end_time, String schedule_published_on, String topic, String logo, String code_of_conduct, String organizer_description, VersionModel version, String description, String location_name, ArrayList<Social_linksModel> social_links, String type, String state, String email, String start_time, CopyrightModel copyright, Call_for_papersModel call_for_papers) {

		this._creator = creator;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._version = version;
		this.description = description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.type = type;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;

	}

}