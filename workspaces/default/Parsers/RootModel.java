import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String logo;
	public String email;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String privacy;
	public String topic;
	public String type;
	public String name;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String state;
	public String end_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public int id;
	public String organizer_name;

	public RootModel(CreatorModel creator, String logo, String email, String background_image, String code_of_conduct, String description, String timezone, VersionModel version, String privacy, String topic, String type, String name, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String state, String end_time, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, int id, String organizer_name) {

		this._creator = creator;
		this.logo = logo;
		this.email = email;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.privacy = privacy;
		this.topic = topic;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.state = state;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.id = id;
		this.organizer_name = organizer_name;

	}

}