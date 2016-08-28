import java.util.ArrayList;

class RootModel {

	public String logo;
	public String background_image;
	public String type;
	public String description;
	public CopyrightModel _copyright;
	public String location_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String organizer_description;
	public String topic;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String state;

	public RootModel(String logo, String background_image, String type, String description, CopyrightModel copyright, String location_name, VersionModel version, String code_of_conduct, String organizer_description, String topic, String name, ArrayList<Social_linksModel> social_links, String timezone, String organizer_name, String privacy, String end_time, Call_for_papersModel call_for_papers, int id, String email, String start_time, CreatorModel creator, String schedule_published_on, String state) {

		this.logo = logo;
		this.background_image = background_image;
		this.type = type;
		this.description = description;
		this._copyright = copyright;
		this.location_name = location_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.name = name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}