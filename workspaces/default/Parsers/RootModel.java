import java.util.ArrayList;

class RootModel {

	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String type;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public CreatorModel _creator;
	public String topic;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;
	public String code_of_conduct;
	public int id;
	public String logo;
	public String start_time;
	public String location_name;
	public String organizer_name;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String background_image, ArrayList<Social_linksModel> social_links, String email, String type, String privacy, String timezone, CopyrightModel copyright, String name, CreatorModel creator, String topic, String schedule_published_on, String organizer_description, VersionModel version, String code_of_conduct, int id, String logo, String start_time, String location_name, String organizer_name, String end_time, String description, Call_for_papersModel call_for_papers, String state) {

		this.background_image = background_image;
		this.social_links = social_links;
		this.email = email;
		this.type = type;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this._creator = creator;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.logo = logo;
		this.start_time = start_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}