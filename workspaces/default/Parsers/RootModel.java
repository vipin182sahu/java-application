import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String email;
	public String organizer_description;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String topic;
	public String logo;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String schedule_published_on;
	public String organizer_name;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public int id;
	public String state;
	public String privacy;

	public RootModel(String background_image, String description, String start_time, ArrayList<Social_linksModel> social_links, String type, String email, String organizer_description, String end_time, CopyrightModel copyright, CreatorModel creator, String topic, String logo, String name, Call_for_papersModel call_for_papers, String timezone, String schedule_published_on, String organizer_name, String location_name, String code_of_conduct, VersionModel version, int id, String state, String privacy) {

		this.background_image = background_image;
		this.description = description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.type = type;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.topic = topic;
		this.logo = logo;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.id = id;
		this.state = state;
		this.privacy = privacy;

	}

}