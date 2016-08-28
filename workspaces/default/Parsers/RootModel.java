import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public VersionModel _version;
	public String type;
	public String location_name;
	public String name;
	public String email;
	public String topic;
	public String description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String privacy;
	public int id;
	public String logo;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String timezone;
	public String background_image;
	public String end_time;
	public String state;

	public RootModel(String code_of_conduct, VersionModel version, String type, String location_name, String name, String email, String topic, String description, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, CreatorModel creator, String privacy, int id, String logo, String start_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_description, String timezone, String background_image, String end_time, String state) {

		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.type = type;
		this.location_name = location_name;
		this.name = name;
		this.email = email;
		this.topic = topic;
		this.description = description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.privacy = privacy;
		this.id = id;
		this.logo = logo;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.end_time = end_time;
		this.state = state;

	}

}