import java.util.ArrayList;

class RootModel {

	public String description;
	public String schedule_published_on;
	public String email;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String timezone;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String topic;
	public String end_time;
	public String organizer_name;
	public String start_time;
	public String logo;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String organizer_description;
	public String state;

	public RootModel(String description, String schedule_published_on, String email, CreatorModel creator, String name, VersionModel version, CopyrightModel copyright, String background_image, String privacy, String timezone, String type, Call_for_papersModel call_for_papers, String code_of_conduct, String topic, String end_time, String organizer_name, String start_time, String logo, int id, ArrayList<Social_linksModel> social_links, String location_name, String organizer_description, String state) {

		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;
		this.id = id;
		this.social_links = social_links;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}