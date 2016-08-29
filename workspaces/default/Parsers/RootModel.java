import java.util.ArrayList;

class RootModel {

	public String name;
	public VersionModel _version;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String timezone;
	public String code_of_conduct;
	public String schedule_published_on;
	public String logo;
	public String type;
	public String email;
	public String privacy;
	public int id;
	public CreatorModel _creator;
	public String description;
	public String organizer_description;
	public String end_time;
	public CopyrightModel _copyright;
	public String start_time;
	public String topic;
	public String state;

	public RootModel(String name, VersionModel version, String location_name, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String background_image, String timezone, String code_of_conduct, String schedule_published_on, String logo, String type, String email, String privacy, int id, CreatorModel creator, String description, String organizer_description, String end_time, CopyrightModel copyright, String start_time, String topic, String state) {

		this.name = name;
		this._version = version;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.type = type;
		this.email = email;
		this.privacy = privacy;
		this.id = id;
		this._creator = creator;
		this.description = description;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._copyright = copyright;
		this.start_time = start_time;
		this.topic = topic;
		this.state = state;

	}

}