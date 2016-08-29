import java.util.ArrayList;

class RootModel {

	public String topic;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public String end_time;
	public String location_name;
	public String organizer_name;
	public int id;
	public String background_image;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public String email;
	public String description;
	public String state;

	public RootModel(String topic, VersionModel version, String organizer_description, CopyrightModel copyright, String logo, String end_time, String location_name, String organizer_name, int id, String background_image, String timezone, Call_for_papersModel call_for_papers, String start_time, String privacy, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String code_of_conduct, String type, String email, String description, String state) {

		this.topic = topic;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.id = id;
		this.background_image = background_image;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this.description = description;
		this.state = state;

	}

}