import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public String name;
	public String start_time;
	public CreatorModel _creator;
	public String timezone;
	public VersionModel _version;
	public String end_time;
	public String type;
	public String logo;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public CopyrightModel _copyright;
	public String state;

	public RootModel(String organizer_description, String location_name, int id, Call_for_papersModel call_for_papers, String organizer_name, String topic, String name, String start_time, CreatorModel creator, String timezone, VersionModel version, String end_time, String type, String logo, String code_of_conduct, ArrayList<Social_linksModel> social_links, String background_image, String email, String privacy, String schedule_published_on, String description, CopyrightModel copyright, String state) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this._creator = creator;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._copyright = copyright;
		this.state = state;

	}

}