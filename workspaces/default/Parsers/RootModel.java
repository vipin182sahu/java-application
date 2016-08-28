import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public String schedule_published_on;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public String timezone;
	public String privacy;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public String topic;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String location_name;
	public String description;
	public String logo;
	public CopyrightModel _copyright;
	public String start_time;
	public String type;
	public String name;

	public RootModel(CreatorModel creator, String end_time, String schedule_published_on, String organizer_name, String organizer_description, String code_of_conduct, String timezone, String privacy, int id, Call_for_papersModel call_for_papers, VersionModel version, String background_image, String topic, String email, ArrayList<Social_linksModel> social_links, String state, String location_name, String description, String logo, CopyrightModel copyright, String start_time, String type, String name) {

		this._creator = creator;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.social_links = social_links;
		this.state = state;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this._copyright = copyright;
		this.start_time = start_time;
		this.type = type;
		this.name = name;

	}

}