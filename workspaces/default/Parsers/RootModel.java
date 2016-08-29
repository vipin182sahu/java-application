import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String name;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public String organizer_name;
	public String location_name;
	public String organizer_description;
	public int id;
	public String schedule_published_on;
	public String privacy;
	public String type;
	public String state;
	public String description;
	public CreatorModel _creator;

	public RootModel(ArrayList<Social_linksModel> social_links, String background_image, String email, String end_time, CopyrightModel copyright, String timezone, String start_time, Call_for_papersModel call_for_papers, String logo, String name, VersionModel version, String topic, String code_of_conduct, String organizer_name, String location_name, String organizer_description, int id, String schedule_published_on, String privacy, String type, String state, String description, CreatorModel creator) {

		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.type = type;
		this.state = state;
		this.description = description;
		this._creator = creator;

	}

}