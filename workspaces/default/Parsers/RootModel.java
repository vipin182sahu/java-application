import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String location_name;
	public String privacy;
	public String background_image;
	public String topic;
	public VersionModel _version;
	public int id;
	public String name;
	public String state;
	public String code_of_conduct;
	public String description;
	public String start_time;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public String organizer_description;

	public RootModel(ArrayList<Social_linksModel> social_links, String type, Call_for_papersModel call_for_papers, String logo, String timezone, CreatorModel creator, String location_name, String privacy, String background_image, String topic, VersionModel version, int id, String name, String state, String code_of_conduct, String description, String start_time, String email, String organizer_name, String schedule_published_on, CopyrightModel copyright, String end_time, String organizer_description) {

		this.social_links = social_links;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.location_name = location_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.topic = topic;
		this._version = version;
		this.id = id;
		this.name = name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.start_time = start_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this.organizer_description = organizer_description;

	}

}