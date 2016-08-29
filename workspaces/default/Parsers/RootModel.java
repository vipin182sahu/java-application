import java.util.ArrayList;

class RootModel {

	public String logo;
	public String code_of_conduct;
	public String location_name;
	public String start_time;
	public String background_image;
	public CreatorModel _creator;
	public String timezone;
	public int id;
	public String end_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String type;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_description;
	public String email;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String privacy;
	public String state;

	public RootModel(String logo, String code_of_conduct, String location_name, String start_time, String background_image, CreatorModel creator, String timezone, int id, String end_time, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String type, String description, CopyrightModel copyright, String name, String organizer_description, String email, String organizer_name, Call_for_papersModel call_for_papers, String topic, String privacy, String state) {

		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.start_time = start_time;
		this.background_image = background_image;
		this._creator = creator;
		this.timezone = timezone;
		this.id = id;
		this.end_time = end_time;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.privacy = privacy;
		this.state = state;

	}

}