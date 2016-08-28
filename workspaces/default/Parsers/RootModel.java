import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public String location_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String privacy;
	public String start_time;
	public String timezone;
	public String description;
	public String name;
	public String organizer_description;
	public String email;
	public String schedule_published_on;
	public String background_image;
	public String code_of_conduct;
	public String type;
	public int id;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String organizer_name, CreatorModel creator, String topic, String location_name, VersionModel version, CopyrightModel copyright, Call_for_papersModel call_for_papers, String end_time, String privacy, String start_time, String timezone, String description, String name, String organizer_description, String email, String schedule_published_on, String background_image, String code_of_conduct, String type, int id, String logo, ArrayList<Social_linksModel> social_links, String state) {

		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.location_name = location_name;
		this._version = version;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.privacy = privacy;
		this.start_time = start_time;
		this.timezone = timezone;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.id = id;
		this.logo = logo;
		this.social_links = social_links;
		this.state = state;

	}

}