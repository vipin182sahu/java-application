import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public String start_time;
	public String end_time;
	public VersionModel _version;
	public String background_image;
	public String topic;
	public String name;
	public String privacy;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String email;
	public CopyrightModel _copyright;
	public String type;
	public String state;
	public String logo;
	public String description;

	public RootModel(ArrayList<Social_linksModel> social_links, int id, CreatorModel creator, String organizer_name, String organizer_description, String start_time, String end_time, VersionModel version, String background_image, String topic, String name, String privacy, String timezone, Call_for_papersModel call_for_papers, String location_name, String code_of_conduct, String schedule_published_on, String email, CopyrightModel copyright, String type, String state, String logo, String description) {

		this.social_links = social_links;
		this.id = id;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.end_time = end_time;
		this._version = version;
		this.background_image = background_image;
		this.topic = topic;
		this.name = name;
		this.privacy = privacy;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._copyright = copyright;
		this.type = type;
		this.state = state;
		this.logo = logo;
		this.description = description;

	}

}