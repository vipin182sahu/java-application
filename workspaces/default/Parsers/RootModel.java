import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String timezone;
	public String logo;
	public String name;
	public String state;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public String schedule_published_on;
	public String location_name;
	public String topic;
	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public String email;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_name;
	public int id;
	public String code_of_conduct;
	public String type;

	public RootModel(ArrayList<Social_linksModel> social_links, String start_time, String timezone, String logo, String name, String state, String description, String organizer_description, VersionModel version, String schedule_published_on, String location_name, String topic, CopyrightModel copyright, String background_image, String end_time, String email, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String organizer_name, int id, String code_of_conduct, String type) {

		this.social_links = social_links;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.topic = topic;
		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this.email = email;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.type = type;

	}

}