import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public CopyrightModel _copyright;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String logo;
	public String state;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public String location_name;
	public String type;
	public String organizer_name;
	public String timezone;
	public String name;

	public RootModel(CreatorModel creator, String topic, CopyrightModel copyright, String email, String description, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String organizer_description, String logo, String state, int id, String end_time, String schedule_published_on, String background_image, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, String location_name, String type, String organizer_name, String timezone, String name) {

		this._creator = creator;
		this.topic = topic;
		this._copyright = copyright;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.state = state;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.name = name;

	}

}