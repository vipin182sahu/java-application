import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CopyrightModel _copyright;
	public String logo;
	public String code_of_conduct;
	public VersionModel _version;
	public String organizer_name;
	public String email;
	public String start_time;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String organizer_description;
	public int id;
	public String privacy;
	public String background_image;
	public String location_name;
	public String topic;
	public String state;

	public RootModel(String timezone, CopyrightModel copyright, String logo, String code_of_conduct, VersionModel version, String organizer_name, String email, String start_time, String type, String end_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on, String name, CreatorModel creator, String description, String organizer_description, int id, String privacy, String background_image, String location_name, String topic, String state) {

		this.timezone = timezone;
		this._copyright = copyright;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.organizer_name = organizer_name;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.organizer_description = organizer_description;
		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;
		this.state = state;

	}

}