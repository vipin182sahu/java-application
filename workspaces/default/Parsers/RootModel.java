import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String timezone;
	public String state;
	public String email;
	public int id;
	public String organizer_name;
	public String start_time;
	public String end_time;
	public String name;
	public String code_of_conduct;
	public String type;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public CreatorModel _creator;
	public String privacy;

	public RootModel(String logo, CopyrightModel copyright, String timezone, String state, String email, int id, String organizer_name, String start_time, String end_time, String name, String code_of_conduct, String type, String schedule_published_on, String location_name, String background_image, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic, String description, String organizer_description, VersionModel version, CreatorModel creator, String privacy) {

		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;
		this.state = state;
		this.email = email;
		this.id = id;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this._creator = creator;
		this.privacy = privacy;

	}

}