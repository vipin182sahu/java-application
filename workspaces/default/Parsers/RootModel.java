import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String organizer_description;
	public String location_name;
	public String email;
	public String background_image;
	public String state;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public int id;
	public String logo;
	public String organizer_name;
	public VersionModel _version;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String type;

	public RootModel(ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String timezone, String organizer_description, String location_name, String email, String background_image, String state, CreatorModel creator, String schedule_published_on, String end_time, int id, String logo, String organizer_name, VersionModel version, String start_time, Call_for_papersModel call_for_papers, String privacy, String description, CopyrightModel copyright, String name, String type) {

		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.email = email;
		this.background_image = background_image;
		this.state = state;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.id = id;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.type = type;

	}

}