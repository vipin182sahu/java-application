import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String name;
	public String organizer_name;
	public String timezone;
	public String logo;
	public int id;
	public String location_name;
	public VersionModel _version;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public String state;

	public RootModel(String privacy, String name, String organizer_name, String timezone, String logo, int id, String location_name, VersionModel version, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic, String organizer_description, CopyrightModel copyright, String email, String start_time, CreatorModel creator, String type, String schedule_published_on, String background_image, String end_time, String code_of_conduct, String state) {

		this.privacy = privacy;
		this.name = name;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this._version = version;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.state = state;

	}

}