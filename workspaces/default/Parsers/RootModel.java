import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String description;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String email;
	public String background_image;
	public CreatorModel _creator;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public String logo;
	public int id;
	public String timezone;
	public String start_time;
	public String state;

	public RootModel(String organizer_description, String description, String location_name, String privacy, CopyrightModel copyright, String email, String background_image, CreatorModel creator, String name, String code_of_conduct, VersionModel version, String type, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_name, String topic, String logo, int id, String timezone, String start_time, String state) {

		this.organizer_description = organizer_description;
		this.description = description;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.email = email;
		this.background_image = background_image;
		this._creator = creator;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.id = id;
		this.timezone = timezone;
		this.start_time = start_time;
		this.state = state;

	}

}