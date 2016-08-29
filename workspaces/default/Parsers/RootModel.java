import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String name;
	public int id;
	public String email;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String start_time;
	public String end_time;
	public String code_of_conduct;
	public String timezone;
	public String topic;
	public String organizer_description;
	public String organizer_name;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String description;
	public String state;
	public String type;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, String name, int id, String email, CreatorModel creator, String schedule_published_on, String start_time, String end_time, String code_of_conduct, String timezone, String topic, String organizer_description, String organizer_name, String logo, String location_name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String background_image, String privacy, String description, String state, String type, VersionModel version) {

		this.social_links = social_links;
		this.name = name;
		this.id = id;
		this.email = email;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.description = description;
		this.state = state;
		this.type = type;
		this._version = version;

	}

}